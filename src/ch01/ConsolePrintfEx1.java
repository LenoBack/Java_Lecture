package ch01;

import java.util.Date;

/**
 * System.out.printf() 예제
 */
public class ConsolePrintfEx1 {
    public static void main(String args[]){

        // 문자열(String) 출력 예제
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("[문자열 출력]==========");
        // public PrintStream printf(String format, Object ... args)
        System.out.printf("%s, %s %n", s1, s2); // Hello, World
        System.out.printf("%S, %S %n", s1, s2); // HELLO, WORLD
       // 문자 출력
        System.out.println("[문자 출력]==========");
        // 문자 타입 (Unicode 출력, 67 -> 대문자 C)
        System.out.printf("%c %n", 67); // C

        // %7s처럼 입력 숫자만큼의 공간을 채워놓는다
        // 양수면 오른쪽 정렬, 음수면 왼쪽 정렬
        System.out.println("[공간채움 출력]==========");
        System.out.printf("[%7s]%n", s1); // [  Hello]
        System.out.printf("[%-7s]%n", s2); // [World  ]

        // 정수,실수 출력 예제
        System.out.println("[정수,실수 출력]==========");
        System.out.printf("%d%n", 100L); // 정수 출력-100
        System.out.printf("%f%n", 123.456); // 실수 출력-123.456000
        System.out.printf("%.2f%n", 123.456); // 소수 2자리-123.46
        System.out.printf("%.2e%n", 123.456); // 지수 표현식-1.23e+02

        // 시간 출력 예제
        System.out.println("[시간 출력]==========");
        Date date = new Date();
        // %tH:시, %tM:분, %tS:초 - 현재 시:21, 분:30, 초:36
        System.out.printf("현재 시:%tH, 분:%tM, 초:%tS %n",
                date, date, date);
        // 날짜 인자를 한번에 전달해서 출력하고 싶을 때는 첫번째 인자의 의미인 1$를 표기해주면 된다
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
    }
}
