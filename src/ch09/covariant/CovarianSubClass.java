package ch09.covariant;

class SuperClass {
    SuperClass get() {
        System.out.println("상위클래스 get() 메서드 호출");
        return this;
    }
}

public class CovarianSubClass extends SuperClass {
    // Covariant Return type
    CovarianSubClass get() {
        System.out.println("하위클래스 get() 메서드 호출");
        return this;
    }
    public static void main(String[] args) {
        SuperClass tester = new CovarianSubClass(); // 업캐스팅
        tester.get();
    }
}
