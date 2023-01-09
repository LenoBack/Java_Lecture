package ch04;

/**
 * optional 코드 블럭
 */
public class IfOptional {
    public static void main(String args[]) {
        int i = 20;

        // if문안의 코드 블럭이 단일 라인일 경우 중괄호({})로 감싸는 것은 optional이다
        if( i < 10 )
            System.out.println("i는 10보다 작다");
        else if( i < 15)
            System.out.println("i는 15보다 작다");
        else
            System.out.println("조건이 맞지 않았습니다");

        if( i < 10 ) {
            System.out.println("i는 10보다 작다");
        } else if( i < 15) {
            System.out.println("i는 15보다 작다");
        } else {
            System.out.println("조건이 맞지 않았습니다");
        }

    }
}
