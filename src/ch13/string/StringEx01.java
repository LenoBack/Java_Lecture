package ch13.string;

public class StringEx01 {
    public static void main(String args[]){
        String s1 = "java"; // 문자열 리터럴로 string 객체 생성

        char ch[] = {'g','i','l','d','o','n','g'};
        String s2 = new String(ch); // char 배열을 문자열로 변환
        // new 키워드로 자바 문자열 객체 생성
        String s3 = new String("새로운 문자열");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String strVar1 = "abc";
        String strVar2 = "abc";
        String strVar3 = new String("abc");
        String strVar4 = new String("abc");
        // true = 동일한 객체 참조값
        System.out.println(strVar1 == strVar2);
        // false = new로 생성되어 객체 참조값이 다르다
        System.out.println(strVar3 == strVar4);
        // 오버라이된 equals메서드로 값을 비교
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar3.equals(strVar4));
    }
}
