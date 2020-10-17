package com.github.hcsp.datatype;

public class Cast {
    // Cast an int to byte
    // 将int类型转换成byte
    public static byte int2byte(int i) {
        return (byte) i;
    }

    // Cast an int to short
    // 将int类型转换成short
    public static short int2short(int i) {
        return (short) i;
    }

    // Cast an int to char
    // 将int类型转换成char
    public static char int2char(int i) {
        return (char) i;
    }

    // Cast an int to String, e.g. 123 -> "123"
    // 将一个整数转换为字符串，例如，将123转换成字符串"123"
    public static String int2String(int i) {
        return String.valueOf(i);
    }

    // Cast an String to int, e.g. "123" -> 123
    // 将一个字符串转换成整数，例如，将字符串"123"转换成整数123
    public static int string2int(String s) {
        return Integer.parseInt(s);
    }

    // Cast an String to double, e.g. "1.23" -> 1.23
    // 将一个字符串转换成double类型，例如，将字符串"1.23"转换成1.23
    public static double string2double(String s) {
        return Double.parseDouble(s);
    }

    // Cast an Long to int
    // 将Long类型转换成int
    public static int Long2int(Long l) {
        return l.intValue();
    }

    // Cast an Double to long
    // 将Double类型转换成long
    public static long double2Long(Double d) {
        return d.longValue();
    }

//    public static void main(String[] args) {
//        int i = 20_0000_0009;
//        System.out.println("int2byte(i) = " + int2byte(i));
//        System.out.println("int2short(i) = " + int2short(i));
//        System.out.println("int2char(i) = " + int2char(i));
//        System.out.println("int2String(i) = " + int2String(i));
//        String str = "1234";
//        System.out.println("string2int(str) = " + string2int(str));
//        System.out.println("string2double(str) = " + string2double(str));
//    }
}
