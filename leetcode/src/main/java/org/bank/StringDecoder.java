package org.bank;

class StringDecoder {
    public static String decodeString(String s) {
        if(s.contains("[")) return null;
        else return s;
    }
}
