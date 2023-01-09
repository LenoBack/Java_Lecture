package ch03;

public class ConditionalOpratorEx1 {
    public static void main(String[] args){

        int a = 5;
        int b = 10;
        // 값을 비교하는 비교연산자, 논리 연산자(&&)
        boolean result = ((a == 5) && (b == 10));

        System.out.println("a = 5 AND b = 10 :"+ result);
        result = ((a == 5) || (b == 5));
        System.out.println("a = 5 OR b =  5 : " + result);

        // 결과 boolean 값을 삼항연산자로 조건을 체크하여 성공/실패 문자열을 리턴한다
        String finalResult = result? "성공" : "실패";
        System.out.println("최종결과 : "+ finalResult);//o/p is “Pass”
    }
}
