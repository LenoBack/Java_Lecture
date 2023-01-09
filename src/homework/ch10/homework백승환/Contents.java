package homework.ch10.homework백승환;

public class Contents {

    private String header;
    private String body;
    private String footer;

    Contents() {
    }

    ;

    public Contents(String header, String body, String footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
