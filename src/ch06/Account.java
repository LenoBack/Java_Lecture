package ch06;

/**
 * 은행 계좌 클래스
 * 계좌 정보 멤버 변수 정의
 * 입출,출금 멤버 메서드 정의
 */
public class Account {
    // 계좌번호
    int accNo;
    // 예금주
    String name;
    // 잔액
    int balance;

    /**
     * 맴버 변수 초기화
     * @param a 계좌번호
     * @param n 예금주
     * @param bal 잔액
     */
    void setVar(int a, String n, int bal){
        accNo   = a;
        name    = n;
        balance = bal;
    }

    /**
     * 입금
     * @param amount 입금액
     */
    void deposit(int amount){
        balance = balance + amount;
        System.out.println(
                name + "님 " +
                amount + "원이 입금되었습니다.\n" +
                "잔액 : "+ balance);
    }

    /**
     * 출금
     * @param amount 출금액
     */
    void withdraw(int amount){

        // 출금처리 코드 작성

        // 잔액 부족 체크
        // 잔액이 부족하지 않다면 잔액에서 차감하고 출금정보 출력
        // 출력 예시) 홍길동님 5000원이 출금되었습니다.

    }

    // 잔액 확인하기
    void checkBalance() {
        System.out.println("잔액 확인 : " + balance);
    }

    // 계좌정보 출력
    void printAccountInfo( ){
        // 계좌정보 출력 코드 작성
        /*
        출력예시)
        [ 계좌 정보 ]
        계좌번호 : 123
        예금주 : 홍길동
        잔액 : 6000
         */
    }
}
