package ch02;

/**
 * 데이터 타입 선언 및 출력 예제
 */
public class DataTypeEx1 {
    public static void main(String args[]){
        // 유니크도 \u0000~\uFFFF
        char c  = 'M';
        byte b1 = -128;
        byte b2 = 127;
        int i1  = -2147483648;
        int i2  = 2147483647;
        short s1= -32768;
        short s2= 32767;
        // L,l로 long type 데이터를 표현 (기본타입은 int)
        long l2 = 9223372036854775807L;
        long l1 = -9223372036854775808L;
        // L을 제거하면 integer 값의 범위를 벗어나서 "integer number too large" 오류 발생
        // int 데이터범위 : -2,147,483,648 ~ 2,147,483,647
        //long l3 = -9223372036854775808;

        // F,f로 float type 데이터를 표현 (기본타입은 double)
        // f를 제거하면 기본타입 double형 값으로 인식하여 데이터손실 오류 발생
        // incompatible types: possible lossy conversion from double to float
        float f= 3.41f;
        double d= 4.37346473;

        System.out.println("char c : " + c);
        System.out.println("byte 범위: " + b1 + "~" + b2);
        System.out.println("short 범위 : " + s1 + "~" + s2);
        System.out.println("int 범위 : " + i1 + "~" + i2);
        System.out.println("Long 범위 : " + l1 + "~" + l2);
        System.out.println("float is: " + f);
        System.out.println("double is: " + d);
    }
}
