package ch13.wrapper;

public class AutoBoxingUnBoxing {
    public static void main(String arggs[]) {
        Integer num = Integer.valueOf(15); // 박싱
        int n = num.intValue();        // 언박싱
        System.out.println(n);

        Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
        char c = ch;        // char c = ch.charValue();           : 오토언박싱
        System.out.println(c);

        // 오토박싱과 오토언박싱을 통해 기본형과 래퍼클래스간의 다양한 연산도 가능하다
        Integer num1 = Integer.valueOf(7); // 박싱
        Integer num2 = Integer.valueOf(3); // 박싱

        int int1 = num1.intValue();    // 언박싱
        int int2 = num2.intValue();    // 언박싱

        Integer result1 = num1 + num2; // 10
        Integer result2 = int1 - int2; // 4
    }
}
