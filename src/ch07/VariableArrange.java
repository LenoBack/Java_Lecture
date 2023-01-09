package ch07;

class VariableArrange {
    // 클래스 변수
    static int ci = 3;
    // 클래스 변수
    static String cs = "Static";

    // 인스턴스 변수(멤버 변수)
    int mi = 4;
    // 인스턴스 변수(멤버 변수)
    String ms = "Member";
    // 상수
    final double PI = 3.14;

    // 파라미터 변수
    void method(int pi, String ps) {
        int li = 5;          // 지역 변수
        String ls = "Local"; // 지역 변수
    }
}
