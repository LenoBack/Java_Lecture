package homework.ch10.homework백승환;

public class PrintTest {
    public static void main(String[] args) {

        Contents contents = new Contents();
        HtmlPrint htmlPrint = new HtmlPrint();
        BasicPrint textPrint = new BasicPrint();
        contents.setHeader("header");
        contents.setBody("body");
        contents.setFooter("footer");
        textPrint.Print(contents);
        System.out.println();
        System.out.println();
        htmlPrint.Print(contents);


    }

}
