package ch06;

/**
 * 학생 클래스
 */
class Student{
    // 학생번호
    int id;
    // 학생명
    String name;

    /**
     * 멤버 변수 초기화 메서드
     * @param i 학생번호
     * @param n 학생명
     */
    void setVar(int i, String n){
        id=i;
        name=n;
    }

    /**
     * 멤버 값 출력
     */
    void printInformation(){
        System.out.println(
                id+" "+
                name);
    }
}