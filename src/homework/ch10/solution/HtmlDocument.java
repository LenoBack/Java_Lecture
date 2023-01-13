package homework.ch10.solution;

public class HtmlDocument extends Document{
    @Override
    void printHeader(Contents contents) {
        System.out.println(
                "<!DOCTYPE html>\n" +
                "<HTML>\n" +
                "<H1>" + contents.getHeader() + "</H1>"
        );
    }

    @Override
    void printBody(Contents contents) {
        System.out.println(
                "<BODY>\n" +
                        "<h3>" +
                        "<font color='blue'>" +
                        contents.getBody().replaceAll("\n","<br>") +
                        "</font>" +
                        "</h3>" +
                "</BODY>"
        );
    }

    @Override
    void printFooter(Contents contents) {
        System.out.println(
                "<H1>" + contents.getFooter() + "</H1>\n" +
                "</HTML>"
        );
    }
}
