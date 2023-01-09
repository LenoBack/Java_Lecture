package homework.ch07;

public class MethodConstructorOverrodingHomework백승환 {
	int id;
	String name;
	int age;

//  생성자 오버로딩 
//  MethodConstructorOverrodingHomework m = new MethodConstructorOverrodingHomework();
//  MethodConstructorOverrodingHomework m1 = new MethodConstructorOverrodingHomework(111,"홍길동");
//  MethodConstructorOverrodingHomework m2 = new MethodConstructorOverrodingHomework(222,"김수철",25)
	public MethodConstructorOverrodingHomework백승환() {} 
	
	public MethodConstructorOverrodingHomework백승환(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public MethodConstructorOverrodingHomework백승환(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
//메서드 오버로딩
//  m.showInformation(10);
//  m1.showInformation(1.2f);
//  m2.showInformation(3.8f, 10, 2.0);
//  m1.showInformation("홍길동", 10L, 2.0);
//  m.showInformation(1);

	public void showInformation(int NumI) {
		System.out.println(NumI);
	}

	public void showInformation(float NumF) {
		System.out.println(NumF+"f");
	}
	
	public void showInformation(float NumF, int NumI, double NumD) {
		System.out.println(NumF+"f"+", "+NumI+", "+NumD);
	}
	
	public void showInformation(String Name, long NumL, double NumD) {
		System.out.println(Name+", "+NumL+"L"+", "+NumD);
	}
	
	public static void main(String args[]) {

		MethodConstructorOverrodingHomework백승환 m = new MethodConstructorOverrodingHomework백승환();
		MethodConstructorOverrodingHomework백승환 m1 = new MethodConstructorOverrodingHomework백승환(111,"홍길동");
		MethodConstructorOverrodingHomework백승환 m2 = new MethodConstructorOverrodingHomework백승환(222,"김수철",25);

	        m.showInformation(10);
	        m1.showInformation(1.2f);
	        m2.showInformation(3.8f, 10, 2.0);
	        m1.showInformation("홍길동", 10L, 2.0);
	        m.showInformation(1);
	}
}