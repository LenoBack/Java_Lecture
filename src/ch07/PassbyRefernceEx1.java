package ch07;

class Mug{
    private String contents;
    public Mug(String contents) {
        this.contents = contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getContents() {
        return contents;
    }
}

public class PassbyRefernceEx1 {
    public static void main(String args[]) {
        // Mug 클래스의 생성자를 호출하면서 contents 멤버변수에 초기화 값 "Tea"를 할당
        Mug myMug = new Mug("Tea");
        System.out.println(myMug.getContents());
        // myMug 객체 참조 변수의 참조값을 전달
        spill(myMug);
        // spill 메서드 종료 후의 myMug 인스턴스의 contents 값이 "Nothing"으로 변경됨
        System.out.println(myMug.getContents());
    }

    public static void spill(Mug mugToBeSpilled) {
        // myMug와 mugToBeSpilled는 동일한 Mug 인스턴스를 참조한다
        // Mug 인스턴스의 setContents메서드로 값을 변경
        mugToBeSpilled.setContents("Nothing");
    }
}
