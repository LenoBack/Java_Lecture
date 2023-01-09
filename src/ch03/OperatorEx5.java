package ch03;

/**
 * 삼항 연산자
 */
public class OperatorEx5 {
    public static void main(String args[]) {

        int i = 7;
        int j = 15;

        int minValue = ( i < j ) ? i : j;
        System.out.println("최소값 : " + minValue);

    }
}
