package homework.ch10.solution;

abstract public class DocumentDesc {

    // 1.문서에 대한 헤더 정보, 본문 정보, 푸터 정보를 담고 있는 Contents 클래스를 정의한다

    // 2.Document라는 abstract class와 printDoc이라는 abstract method를 정의한다
    /**
     * 로직 메서드
     * printDoc(Contents contents) {
     *   // abstract method를 call
     *   문서헤더생성(contents)
     *   문서본문생성(contents)
     *   문서푸터생성(contents)
     * }
     *
     * abstract method를 정의한다
     *
     *
     */

    // 3.콘솔에 텍스트형식으로만 출력하는 클래스를 Document를 상속하여 abstract method를 구현한다

    // 4.콘솔에 HTML형식으로 출력하는 클래스를 Document를 상속하여 abstract method를 구현한다
    // -> 콘솔에 HTML태그와 포함되서 출력되면 됨
    // HTML이 아닌 다른 형식으로 출력

    // 5.테스트 클래스를 정의하여 Abstract 클래스 타입으로 선언한 하위클래스 객체들을 생성 및
    // Contents 객체를 생성하고 printDoc(contents) 메서드 호출하면 문서를 출력한다

}
