package ch09.methodhiding;

public class BookExampleStaticMethod {
    public static void main(String[] args) {
        Book base = new Book();
        base.printName(); // 책
        CourseBook derived = new CourseBook();
        // static method는 컴파일 타임에 바인딩되기떼문에 참조하는 타입으로 체크한다
        derived.printName(); // 책
    }
}
