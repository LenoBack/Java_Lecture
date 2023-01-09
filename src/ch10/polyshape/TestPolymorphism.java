package ch10.polyshape;

class Shape{
    void draw(){
        System.out.println("그리기");
    }
}

// Rectangle, Circle, Triangle 3개의 하위클래스를 정의하고
// 상위클래스의 메서드를 오버라이드한다

public class TestPolymorphism{
    public static void main(String args[]){
        // Shape 클래스 타입으로 객체 참조 변수를 선언
        // 하위클래스 객체를 생성하여 할당하고 오버라이드한 메서드를 각각 호출하여 다형성을 수행한다
    }
}
