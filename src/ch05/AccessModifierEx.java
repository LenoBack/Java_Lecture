package ch05;

public class AccessModifierEx {
    public int pubVar;
    protected int proVar;
    int defVar; // default 접근 제어자 자동 설정
    private int priVar;

    // 생성자를 private 접근제어자로 지정하면 상속 불가
    //private AccessModifierEx(){}
    public AccessModifierEx(){}
}
