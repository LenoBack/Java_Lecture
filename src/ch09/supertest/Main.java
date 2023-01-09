package ch09.supertest;

class Animal {
    public void display(){
        System.out.println("나는 동물이다");
    }
}

class Dog extends Animal {
    @Override
    public void display(){
        System.out.println("나는 개 이다");
    }
    public void printMessage(){
        display();
        super.display();
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}
