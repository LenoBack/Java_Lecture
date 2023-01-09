package homework.ch10.homework백승환;


abstract public class Document {
    // 2.Document라는 abstract class와 printDoc이라는 abstract method를 정의한다
//상속 불가 final 선언
    public final void Print(Contents contents) {
        header(contents);
        body(contents);
        footer(contents);
    }

    abstract void header(Contents contents);

    abstract void body(Contents contents);

    abstract void footer(Contents contents);


}
