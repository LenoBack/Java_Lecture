package ch01;

public class ClassLoaderEx {
    public static void main(String[] args) {
        // 응용프로그램/시스템클래스 로더가 이 클래스를 로드한다
        Class c= ClassLoaderEx.class;
        System.out.println(c.getClassLoader());
        // 클래스 로더 이름을 String으로 print하면 null이 print
        // rt.jar에 있는 내장 클래스이므로 Bootstrap 클래스로더에 의해 로드된다
        System.out.println(String.class.getClassLoader());
    }
}
