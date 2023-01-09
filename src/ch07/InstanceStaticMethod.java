package ch07;

public class InstanceStaticMethod {
    // Object(instance) method
    void instanceMethod1() {}
    // static method
    static void staticMethod1() {}

    // instance method
    void instanceMethod2() {
        instanceMethod1(); // 다른 instance method 호출
        staticMethod1(); // static method 호출
    }

    // static method
    static void staticMethod2() {
        //instanceMethod1(); //Error! 인스턴스를 호출할 수 없다
        staticMethod1();
    }
}