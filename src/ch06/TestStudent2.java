package ch06;

public class TestStudent2{
    public static void main(String args[]){
        //여러 객체 생성
        Student s1= new Student();
        Student s2= new Student();
//        //객체 초기화
//        s1.id = 100 ;
//        s1.name= "홍길동" ;
//        s2.id= 200 ;
//        s2.name= "김철수" ;

        s1.setVar(100, "홍길동");
        s2.setVar(200, "김철수");

        s1.printInformation();
        s2.printInformation();
    }
}
