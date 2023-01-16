package ch13.wrapper;

public class Boxing {
    public static void main(String arggs[]){
        int val = 20;
        // valueOf() 메서드를 이용하여 래퍼 클래스 객체 변환
        Integer i1 = Integer.valueOf(val);
        // Autoboxing으로 래퍼 클래스 객체 자동 변환
        Integer i2 = val;
    }
}
