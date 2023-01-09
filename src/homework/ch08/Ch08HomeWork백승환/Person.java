package homework.ch08.Ch08HomeWork백승환;

public class Person {

//private 변수로 직접 수정이 가능하지 않도록 선언 
	private String name = "";
	private int money = 0;
	
// default 생성자 선언 (모든 클래스는 기본 1개 이상의 생성자 필요) 
// 생성자는 return 없어도 된다 (기본 void)
// 생성자가 클래스 안에 하나도 없을때만 컴파일러가 자동으로 추가
	Person(){}
	
// Person 생성자 (생성자 오버로딩(매개변수 다름))
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
//get메서드로 간접적으로 호출이 가능하도록함
//set메서드로 호출 후 수정이 가능하도록 함. 
	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

}
