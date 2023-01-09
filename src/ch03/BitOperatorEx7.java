package ch03;

/**
 * 비트 연산자
 */
public class BitOperatorEx7 {
    public static void main(String args[]) {

        byte num1 = 3;
        byte num2 = 5;
        // byte로 선언해도 비트 연산시 연산의 최소단위인 4 byte로 변경됨
        int result;

        result = num1 | num2;
        System.out.println("3 | 5 = " + result);

        // 0b + 0/1 bit로 지정하면 이진수 표기법이다
        // 0b0011 -> 3
        // 0b0101 -> 5
        result = 0b0011 | 0b0101;
        System.out.println("3 | 5 = " + result);

        result = num1 & num2;
        System.out.println("3 & 5 = " + result);

        result = num1 ^ num2;
        System.out.println("3 ^ 5 = " + result);

    }
}
