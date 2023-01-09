package ch09.covariant;

class A1
{
    A1 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("A1 클래스의 print() 메서드입니다");
    }
}


// A1의 자식 클래스 A2
class A2 extends A1
{
    // Covariant return type으로 오버라이딩
    @Override
    A2 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("A2 클래스의 print() 메서드입니다");
    }
}

// A2의 자식 클래스 A3
class A3 extends A2
{
    // Covariant return type으로 오버라이딩
    @Override
    A3 foo()
    {
        return this;
    }

    @Override
    void print()
    {
        System.out.println("A3 클래스의 print() 메서드입니다");
    }
}

/**
 * 공변 반환 타입 예제
 */
public class CovariantExample {
    public static void main(String argvs[]){

        A1 a1 = new A1();
        a1.foo().print();

        A2 a2 = new A2();
        // foo() 메서드로 리턴되는 객체 유형을 명확히 체크할 수 있다
        a2.foo().print();
        // 상속받은대로 A1 타입을 리턴타입으로 할 경우 A2의 객체를 통해 실행되어도 A1 클래스 타입으로
        // 실행된다
        //((A2)a2.foo()).print();

        A3 a3 = new A3();
        a3.foo().print();
        //((A3)a3.foo()).print();
    }
}
