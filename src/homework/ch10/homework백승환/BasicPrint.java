package homework.ch10.homework백승환;

public class BasicPrint extends Document {
    //매개변수에 참조변수 타입을 넣음으로써 Contents 클래스의 하위 멤버들을 사용가능
    @Override
    public void header(Contents contents) {
        System.out.println(contents.getHeader());
        System.out.println("===========");
    }

    ;

    @Override
    public void body(Contents contents) {
        System.out.println(contents.getBody());
        System.out.println("===========");
    }

    ;

    @Override
    public void footer(Contents contents) {
        System.out.println(contents.getFooter());
    }

    ;

}
