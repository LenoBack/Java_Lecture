package ch04;

/**
 * 중첩 if 문
 */
public class NestedIfEx {
    public static void main(String args[]) {
        int i = 20;

        if( i > 10 ) {
            System.out.println("i가 10보다 작습니다");
            if( i <= 20) {
                System.out.println("i가 20보다 작거나 같습니다");
            } else{
                System.out.println("i가 20보다 큽니다");
            }
        } else {
            System.out.println("else 블럭이 실행되었습니다");
        }
    }
}
