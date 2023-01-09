package ch10.instof;

class Animal { }

class Dog extends Animal {
    static void method(Animal a) {
        if(a instanceof Dog){
            Dog d=(Dog)a;//downcasting
            System.out.println("다운캐스팅 가능");
        }
    }

    public static void main (String [] args) {
        //Dog d = new Animal(); // 컴파일 에러

        //컴파일은 성공했지만 실행 시 ClassCastException이 throw된다
        // class ch10.instof.Animal cannot be cast to class ch10.instof.Dog
        Dog d = (Dog)new Animal();

        Animal a=new Dog();
        Dog.method(a);
    }

}