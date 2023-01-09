package ch05;

public class Account {
    static String bankName; // 클래스 변수
    long accountNO;         // 인스턴스 변수
    String customerName;   //인스턴스 변수

    // 생성자
    Account (){ // 기본 생성자 <- 컴파일러 컴파일 시점에 추가해줌
        System.out.println("셍상자 실행");
    }

    // 초기화 블럭(initialize block)
    {
        System.out.println("블록입니다");
    }
    // 메서드
    void printInfo(){
        System.out.println ("계좌 클래스");
    }
}

class TestAccount{
    public static void main(String args[]){
        // acc <- reference 변수 (객체의 참조값만 가지고 있음)
        Account acc = new Account();
        acc.printInfo();
    }
}