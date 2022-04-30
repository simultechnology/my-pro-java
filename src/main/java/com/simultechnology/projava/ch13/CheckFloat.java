package com.simultechnology.projava.ch13;

public class CheckFloat {

    enum FloatState {
        START, NEGATIVE, INT, FRAC_START, FRAC, ZERO
    }

    static boolean check(String data) {
        var state = FloatState.START;
        for (char ch : data.toCharArray()) {
            switch (state) {
                case START -> {
                    if (ch == '-') {
                        state = FloatState.NEGATIVE;
                    } else if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case NEGATIVE ->  {
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case ZERO -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                case INT -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case FRAC_START, FRAC -> {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else {
                        return false;
                    }
                }
            }
        }
        return switch (state) {
            case ZERO, INT -> true;
            case FRAC -> data.charAt(data.length() - 1) != '0';
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println("start!");
        char ch = '0';
        System.out.println(ch);
        System.out.println((int) ch);
        System.out.println((int) '9');

        System.out.println("----------------------------");
        System.out.println(check(""));
        System.out.println(check("012"));
        System.out.println(check(".12"));
        System.out.println(check("12."));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("12.30"));
        System.out.println(check("12.0"));
        System.out.println(check("12aaa"));
        System.out.println("----------------------------");
        System.out.println(check("-123"));
        System.out.println(check("--123"));
        System.out.println(check("-12-3"));
    }
}
