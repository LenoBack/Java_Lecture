package homework.ch08.Ch08HomeWork백승환;

public class Menu {
    // 메뉴명(가격을 할당) 정의 (static)
    // 커피 = 1000
    // 아이스티 = 2000
    // 빵 = 3000
	
	// private로 직접 가격이 수정되지 않도록 지정 
	private static int coffee = 1000;
	private static int iceTea = 2000;
	private static int bread = 3000;
	
	// private로 지정한 인스턴스 변수를 get 메서드를 통해 간접 호출
	public static int getCoffee() {
		return coffee;
	}

	public static int getIceTea() {
		return iceTea;
	}

	public static int getBread() {
		return bread;
	}
}
