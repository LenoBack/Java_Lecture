package ch02;

/**
 * 10진수, 8진수, 16진수 변환 예제
 */
public class DecimalConvert {
    public static void main(String args[]) {
        int d1 = 100;        // 10진수
        int d2 = 0b1100100;  // 2진수
        int d3 = 0144;       // 8진수
        int d4 = 0x64;       // 16진수

        // 10진수를 n진수로 변환하는 메소드 사용
        System.out.println(Integer.toBinaryString(d1)); // 2진수 변환
        System.out.println(Integer.toHexString(d1)); // 8진수 변환
        System.out.println(Integer.toOctalString(d1)); // 16진수 변환
        System.out.println(0b1100100); // 2진수->10진수로 출력됨
    }
}
