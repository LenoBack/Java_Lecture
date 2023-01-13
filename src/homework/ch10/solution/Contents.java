package homework.ch10.solution;

/**
 * 출력할 콘텐츠 정보를 담고 있는 클래스
 */
public class Contents {
    // 헤더
    private String header;
    // 본문
    private String body;
    // 푸터
    private String footer;

    // setter를 사용하기 보단 생성자를 통해 멤버 변수 초기화 값을 설정하는것이 좋다
    public Contents(String header, String body, String footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String getHeader() {
        return header;
    }
    public String getBody() {
        return body;
    }
    public String getFooter() {
        return footer;
    }
}
