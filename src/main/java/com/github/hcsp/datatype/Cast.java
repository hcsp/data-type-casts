package com.github.hcsp.datatype;

public class Cast {
    // 将int类型转换成byte
    public static byte int2byte(int i) { return (byte) i; }
    // 将int类型转换成short
    public static short int2short(int i) { return (short) i; }
    // 将int类型转换成char
    public static char int2char(int i) { return (char) i; }
    // 将一个整数转换为字符串，例如，将123转换成字符串"123"
    public static String int2String(int i) { return  Integer.toString(i); }
    // 将一个字符串转换成整数，例如，将字符串"123"转换成整数123
    public static int string2int(String s) { return Integer.parseInt(s); }
    // 将一个字符串转换成double类型，例如，将字符串"1.23"转换成1.23
    public static double string2double(String s) {
        return Double.parseDouble(s);
    }
    // 将Long类型转换成int
    public static int Long2int(Long l) { return l.intValue(); }
    // 将Double类型转换成long
    public static long double2Long(Double d) {
        return d.longValue();
    }
}
