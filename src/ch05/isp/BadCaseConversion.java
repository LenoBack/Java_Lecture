package ch05.isp;

/**
 * ISP(인터페이스 분리 원칙)
 * 인터페이스를 구현하는 클래스에서 intToChar() 메서드만 구현하길 원하지만 모두 구현해야 한다
 */
public interface BadCaseConversion {
    public void intToDouble();
    public void intToChar();
    public void charToString();
    public void sendMsg();
}
