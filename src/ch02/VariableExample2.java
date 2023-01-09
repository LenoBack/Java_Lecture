package ch02;

/**
 *  * 데이터 타입 변수 선언 및 연산 예제
 */
public class VariableExample2 {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        int tmp = 0;

        System.out.println("x:"+ x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:"+ x + " y:" + y);
    }
}
