package homework.ch02;

public class Homework_BackSeungHwan {
	public static void main(String[] args) {
		

// 과제 : 오류나는 코드를 정상적으로 동작하도록 수정하고, 이렇게 해야하는 이유를 작성
// 오류코드
//    short sa,sb,sc;
//    sa = 1;
//    sb = 2; 
//    // incompatible types: possible lossy conversion from int to short
//    sc = sa+sb;
//    System.out.println("sc:" + sc);
    
// 오류 이유: 
// * 자바의 연산 규칙 
// => 연산자가 int형(4byte)보다 작은 크기의 데이터 타입인 경우에 boolean형을 제외하고 모두 int형으로 자동 형 변환이 되어 연산이 수행된다.
// => 2항(덧셈,뺄셈)은 연산을 수행하기 전에 두 피연산자의 값을 일치 시킨다. 
// =>=> float + int => float + float => float
    
// 해결 방법_01
// 1. sc의 데이터 타입을 short (short sc;)가 아닌 int (int sc;)로 바꿔준다. 
// => int = int+int 형이 되도록 바꿔준다. 
    short sa,sb;
    int sc;
    sa = 1;
    sb = 2; 
    sc = sa+sb;
    System.out.println("sc:" + sc);
    
// 해결 방법_02
// 2. sc = sa+sb;를 sc = (short)(sa+sb);로 바꿔준다. 
// => 계산식이 int형으로 casting 되는 것을 short형으로 casting 해준다.
// => short = (short)(int+int)
    
    short sd,se,sf;
    sd = 1;
    se = 2; 
    sf = (short)(sd+se);
    System.out.println("sf:" + sf);
	}
}
