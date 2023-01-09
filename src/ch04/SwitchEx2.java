package ch04;

import java.util.Scanner;

/**
 * switch 문 예저
 */
public class SwitchEx2 {
    public static void main(String args[]) {

        // 콘솔창에서 값을 입력 받을 수 있도록 java.util.Scanner 객체를 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요: ");
        int i = scanner.nextInt(); // 입력한 점수를 int정수로 얻는다

        String grade = "";
        switch (i / 10) { // 점수를 10으로 나눈 값으로 체크
            case 10: // 값이 10 or 9이면 A
            case 9:
                grade = "A";
                break; // break문을 만나면 switch 블럭 종료
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default: // 이외에는 F
                grade = "F";
                break;
        }
        System.out.println(grade + "학점 입니다");
    }

}
