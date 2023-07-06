package org.bank;

import java.util.Objects;

class StringDecoder {
    public static String decodeString(String s) {
        Expression exp = parse(s);
        return Objects.requireNonNull(exp).evaluate();
    }

    static Expression parse(String s) {
        if(s.contains("[")) { return new RepExpression(getRepCount(s), parse(getInnerString(s)));}
        else return new StringExpression(s);
    }

    static String getPostString(String s) {
        int to = s.lastIndexOf("]");
        return s.substring(to+1);
    }

    static String getPreString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.toCharArray().length; i++) {
           if( Character.isDigit(s.charAt(i))) break;
           else sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static String getInnerString(String s) {
        int from = s.indexOf("[");
        int to = s.lastIndexOf("]");
        return s.substring(from+1,to);
    }

    static int getRepCount(String s) {
        int from = s.indexOf("[");
        String count = s.substring(0,from);
        return Integer.parseInt(count);
    }

    interface Expression {
        String evaluate();
    }
    static class RepExpression implements Expression {
        public RepExpression(String preString, int rep, Expression val, String postString) {
            this.preString = preString;
            this.postString = postString;
            this.rep = rep;
            this.val = val;
        }
        String preString;
        String postString;
        int rep;
        Expression val;

        public RepExpression(int rep, Expression val) {
            this.rep = rep;
            this.val = val;
        }

        @Override
        public String evaluate() {
            StringBuilder sb = new StringBuilder();
            if(preString!=null && !preString.isEmpty()) sb.append(preString);
            for(int i = 0; i < rep; i++) {
             sb.append(val.evaluate());
            }
            if(postString!=null && !postString.isEmpty()) sb.append(postString);
            return sb.toString();
        }
    }

  static class StringExpression implements Expression {

        String value;
     public StringExpression(String value) {
         this.value = value;
     }

      @Override
      public String evaluate() {
          return value;
      }
  }
}
