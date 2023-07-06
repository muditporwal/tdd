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

    private interface Expression {
        String evaluate();
    }
    private static class StringExpression implements Expression {

        int rep;
        Expression val;

        @Override
        public String evaluate() {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < rep; i++) {
             sb.append(val.evaluate());
            }
            return sb.toString();
        }
    }

}
