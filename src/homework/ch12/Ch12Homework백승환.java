package homework.ch12;

public class Ch12Homework백승환 {

    // 1.점수_오류_사용자_애외 클래스 작성
    // Exception 클래스를 상속하여 점수_오류_사용자_애외 클래스를 정의한다
    static class PointException extends Exception {
        public PointException(String message) {   // 사용자 정의 예외 클래스 메시지 정의를 위해서 String message 필요
            super(message); // 조상인 Exception 클래스의 생성자를 호출
        }
    }
    //학점_계산_메서드호출(int 점수){
    //점수가 100 초과이거나 음수일 경우 점수_오류_사용자_애외생성해서 호출한 메서드로 throw한다
    //if(점수가 100 초과이거나 음수일 경우){
    //점수_오류_사용자_애외를 throw한다
    public static void calc(int score) throws PointException {
        String name = "백승환";
        if (score < 0 || score > 100) {
            throw new PointException("점수 오류입니다."); //throw new를 통해서 강제로 PointException 예외를 발생 시킨다. PointException예외는 throws를 통해서 사용자 정의한 PointException 클래스에서 처리됨
        } else {
            System.out.println(name + " 학생의 점수는 " + score + "점 입니다.");
        }
    }
    // 2.예외처리
    // 예외_테스트_클래스
    // 메인_메서드{
    // throw되는 예외를 try~catch로 처리한다
    // try~catch를 통한 예외처리와 상관없이 "Hello try~catch~finally!" 메시지를 출력해야 한다
    // 학점_계산_메서드호출(점수);
    public static void main(String args[]) {
        System.out.println("Hello!");
        try {
            System.out.println("try");
            calc(101);
            //point Exception
            // 예외처리 메서드를 사용하기 위해서 예외처리구분 뒤에 객체명을 써준다.
        } catch (PointException pe) {
            System.out.println("catch");
            System.out.println(pe.getMessage());
            // 모든 예외를 처리할 수 있는 Exception을 catch문  마지막에 적어줘야 한다.
        } catch (Exception e) {
            System.out.println("default excaption catch");
            System.out.println(e.getMessage());
            //마지막에 무조건 1번 수행된다.
        } finally {
            System.out.println("finally");
        }
    }
}
