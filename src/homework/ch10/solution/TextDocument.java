package homework.ch10.solution;

public class TextDocument extends Document{

    @Override
    void printHeader(Contents contents) {
        System.out.println(
                Document.SPECIAL_CHAR +
                contents.getHeader());
    }

    @Override
    void printBody(Contents contents) {
        System.out.println(contents.getBody());

    }

    @Override
    void printFooter(Contents contents) {
        System.out.println(
                Document.SPECIAL_CHAR +
                contents.getFooter());
    }
}
