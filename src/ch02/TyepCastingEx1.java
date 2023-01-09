package ch02;

/**
 * casting 에제
 * 업캐스팅
 * byte -> short -> char -> int -> long -> float -> double
 *
 * 다운캐스팅
 * double -> float -> long -> int -> char -> short -> byte
 */
public class TyepCastingEx1 {
    public static void main(String args[]) {

        int value1 = (int)3.14; // 다운캐스팅
        long value2 = (long)10; // 업캐스팅
        float value3 = (float)6.123; // 다운캐스팅
        double value4 = (double)16; // 업캐스팅

        System.out.println(value1); //3
        System.out.println(value2); //10
        System.out.println(value3); //6.123
        System.out.println(value4); //16.0

    }
}
