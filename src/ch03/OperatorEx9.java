package ch03;

/**
 * 비트 NOT 연산자 : ~
 */
public class OperatorEx9 {
    public static void main(String args[]) {

        int a=3;
        boolean b=true;

        // 3 비트NOT연산자 -> -4
        // 값 첫번째 비트는 부호비트로 0은 양수, 1은 음수다
        // ~ 00000011 (3)
        //   11111100 (-4)
        System.out.println(~a);//-4
        System.out.println(!b);//false (boolean의 반대)

    }
}
