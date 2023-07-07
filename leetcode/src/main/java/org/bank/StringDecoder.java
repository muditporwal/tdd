package org.bank;

import java.util.*;

class StringDecoder {
    public static String decodeString(String s) {
        Expression exp = parse(s);

        return Objects.requireNonNull(exp).evaluate();
    }

    static Expression parse(String s) {
        if(s.contains("[")) {
        Deque<Character> deque = new LinkedList<>();
        char[] charArray = s.toCharArray();
        List<String> tokens = new ArrayList<>();
        int lastIndex = 0;
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
            char ch = charArray[i];
            if (ch == '[') {
                deque.addFirst(ch);
            }
            if (ch == ']') {
                deque.removeFirst();
                if (deque.isEmpty()){
                    String current = String.copyValueOf(charArray, lastIndex, i + 1 - lastIndex);
                    lastIndex = i+1;
                    tokens.add(current);
                }
            }
        }
        if(tokens.size() > 1) {
            List<Expression> list = tokens.stream().map(StringDecoder::parse).toList();
            return new RepeatingExpressions(list);
            }
            else return new ComplexExpression(getPreString(s),getRepCount(s), parse(getInnerString(s)),getPostString(s));
        }
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
        String repCountString = count.replaceAll("[A-Za-z]", "");
        return Integer.parseInt(repCountString);
    }

    interface Expression {
        String evaluate();
    }
    static record ComplexExpression(String preString, int rep, Expression val, String postString) implements Expression {
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

  static record StringExpression(String value) implements Expression {
      @Override
      public String evaluate() {
          return value;
      }
  }

    static record RepeatingExpressions(List<Expression> expressions) implements Expression {
        @Override
        public String evaluate() {
            return expressions.stream().map(Expression::evaluate).reduce(String::concat).orElse("");
        }
    }
}
