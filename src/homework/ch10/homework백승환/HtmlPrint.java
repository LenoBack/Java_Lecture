package homework.ch10.homework백승환;

public class HtmlPrint extends Document {

    @Override
    public void header(Contents contents) {
        System.out.println("<head>" + "\n" +
                "\t" + contents.getHeader() + "\n" +
                "</head>");
    }

    ;

    @Override
    public void body(Contents contents) {
        System.out.println("<body>" + "\n" +
                "\t" + contents.getBody() + "\n" +
                "</body>");
        ;
    }

    @Override
    void footer(Contents contents) {
        System.out.println("<footer>" + "\n" +
                "\t" + contents.getFooter() + "\n" +
                "</footer>");
    }

    ;

}
