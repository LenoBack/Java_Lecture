package homework.ch10.solution;

/**
 * Template method pattern 정의 클래스
 */
abstract public class Document {

    public static final String SPECIAL_CHAR = "*";
    public static final int TEXT_DOCUMENT = 1;
    public static final int HTML_DOCUMENT = 2;

    // 로직을 담고 있는 메서드
    public final void printDoc(Contents contents){
        // 문서의 헤더를 출력
        //System.out.println("[헤더]-------------------");
        printHeader(contents);
        //System.out.println("[본문]-------------------");
        printBody(contents);
        //System.out.println("[푸터]-------------------");
        printFooter(contents);
        //System.out.println("[끝]-------------------");
    }

    abstract void printHeader(Contents contents);
    abstract void printBody(Contents contents);
    abstract void printFooter(Contents contents);

}
