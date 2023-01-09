package ch03;

/**
 * 비트 연산자 예제
 */
public class BitwiseOperatorEx1 {
    public static void main(String[] args){
        int x = 5; // 이진수 0101
        int y = 6; // 이진수 0110
        int z = 2; // 이진수 0010

        // 비트연산자 AND 0101 & 0110 = 0100 => 4
        System.out.println("x&y = " + (x & y));

        // 비트연산자 OR 0101 | 0110 = 0111 => 7
        System.out.println("x|y = " + (x | y));

        // 비트연산자 XOR  0101 ^ 0110 = 0011 => 3
        System.out.println("x^y = " + (x ^ y));

        // 비트연산자 NOT(~) 0101 -> 1010 => -6
        System.out.println("~x = " + ~x);

        // 왼쪽쉬프트 연산자(<<) 0010 -> 1000 => 8
        System.out.println("z<<2 = " + (z << 2));

        // 오른쪽쉬프트 연산자(>>) 0110 -> 0001 => 1
        System.out.println("x>>2 = " + (x >> 2));

        // 부호없는 오른쪽쉬프트 연산자(>>) 0110 -> 0001 => 1
        System.out.println("y>>>2 = " + (y >>> 2));

    }
}
