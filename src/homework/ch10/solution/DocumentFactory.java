package homework.ch10.solution;

/**
 * Document 타입에 맞는 객체를 생성하여 리턴하는 팩토리 클래스
 */
public class DocumentFactory {
    public static Document getDocumentBuild(int docType) {
        Document document = null;
        if(docType == Document.TEXT_DOCUMENT) document = new TextDocument();
        if(docType == Document.HTML_DOCUMENT) document = new HtmlDocument();
        return document;
    }
}
