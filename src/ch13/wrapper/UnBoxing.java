package ch13.wrapper;

public class UnBoxing {
    public static void main(String arggs[]){
        // new 생성자를 사용하는 것은 deprecated 되었다
        // Integer i = new Integer(20);
        Integer i = Integer.valueOf(20); // 박싱
        // intValue() 메서드를 이용하여 기본형으로 변환
        int val1 = i.intValue();
        // AutoUnboxing 기능으로 기본형으로 자동 변환
        int val2 = i;
    }
}
