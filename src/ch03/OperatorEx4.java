package ch03;

/**
 * 논리 연산자
 */
public class OperatorEx4 {
    public static void main(String args[]) {

        int i = 10;
        int j = 5;
        int k = 20;

        // && (short circut) : A && B 라고 가정하면 첫번째 조건이 false 이면 두번째 조건은 확인하지 않아 (&) 연산자에 비해 실행시간을 줄일 수 있다
        System.out.println( (i<j) && (i<k) ); // false && true = false
        // || : A || B 라고 하면 A가 true 이면 B는 확인하지 않는다
        System.out.println( (i>j) || (i>k) ); // true || false = true

    }
}
