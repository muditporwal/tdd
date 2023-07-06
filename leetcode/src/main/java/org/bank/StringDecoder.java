package org.bank;

import java.util.Objects;

class StringDecoder {
    public static String decodeString(String s) {
        if(s.contains("[")) {
            Expression exp = parse(s);
            return Objects.requireNonNull(exp).evaluate();
    } else   return s;
    }

    private static Expression parse(String s) {
        return null;
    }

    interface Expression {
        String evaluate();
    }
    static class RepExpression implements Expression {

        int rep;
        Expression val;

        public RepExpression(int rep, Expression val) {
            this.rep = rep;
            this.val = val;
        }

        @Override
        public String evaluate() {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < rep; i++) {
             sb.append(val.evaluate());
            }
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
