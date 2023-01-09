package ch03;

/**
 * 비트 오른쪽 쉬프트(>>) 연산자
 */
public class OperatorRightShiftEx1 {
    public static void main(String args[]) {

        // 오른쪽 쉬프트 연산자는 x / 2n과 같다
        // 20 << 3 => 20 / 2^3
        System.out.println(10>>2); // 10/2^2 = 10/4=2
        System.out.println(20>>2); // 20/2^2 = 20/4=5
        System.out.println(20>>3); // 20/2^3 = 20/8=2
    }
}
