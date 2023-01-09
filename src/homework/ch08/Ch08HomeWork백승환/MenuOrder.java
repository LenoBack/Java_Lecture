package homework.ch08.Ch08HomeWork백승환;

public class MenuOrder {
	
	//참조형 매개변수 삽입 
	//참조형 매개변수를 넣어줘야 personBack에 등록된 "백승환"과 1900을 읽기,쓰기가 가능하다.
	//1900을 수정해줘야 하기에 참조변수 삽입
	public void orderCoffee(Person personBack) {
		if(personBack.getMoney() >= Menu.getCoffee()) {
			System.out.println("정상주문 \n커피를 주문하셨습니다!");
			System.out.println("잔액은 : " + (personBack.getMoney()-Menu.getCoffee())+"원 입니다.");
		}
		else {
			System.out.println("잔액부족 \n 커피를 주문하셨습니다.");
			System.out.println("잔액이 부족합니다.");
		}
			
	}
	public void orderIceTea(Person personBack) {
		if(personBack.getMoney() >= Menu.getIceTea()) {
			System.out.println("정상주문 \n아이스티를 주문하셨습니다!");
			System.out.println("잔액은 : " + (personBack.getMoney()-Menu.getIceTea())+"원 입니다.");
		}
		else {
			System.out.println("잔액부족 \n 아이스티를 주문하셨습니다.");
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	public void orderBread(Person personBack) {
		if(personBack.getMoney() >= Menu.getBread()) {
			System.out.println("정상주문 \n 빵을 주문하셨습니다!");
			System.out.println("잔액은 : " + (personBack.getMoney()-Menu.getBread())+"원 입니다.");
		}
		else {
			System.out.println("잔액부족 \n 빵을 주문하셨습니다.");
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	public static void main(String[] args) {
		Person personBack = new Person("백승환",5000);
		MenuOrder order = new MenuOrder();
		//참조형 매개변수를 매서드에 매개변수 부에 넣어준다.
		//읽고 쓰기 목적 (돈 => 바뀌어야함)
		order.orderCoffee(personBack);
		order.orderIceTea(personBack);
		order.orderBread(personBack);
	}
}
