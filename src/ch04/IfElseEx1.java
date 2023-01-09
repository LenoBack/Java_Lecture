package ch04;

/**
 * if-else 문
 */
public class IfElseEx1 {
    public static void main(String args[]) {

        boolean isComplete = true;
        if(isComplete) System.out.println("완료되었습니다");

        int i = 20;
        if( i < 10 ){
            System.out.println("if 조건이 true여서 if 블럭 실행 : i가 10보다 작습니다");
        } else {
            System.out.println("if 조건이 false로 else 블럭 실행 : i가 10보다 큽니다");
        }

        int year = 2022;
        int month = 12;
        if( ( (year == 2022) && (month >= 1) ) && ( (year == 2022) && (month <= 11) ) ) {
            System.out.println("2022년 12월 이전이다");
        }else{
            System.out.println("2022년 12월이다");
        }
    }
}
