package ch05;

// public scope class
public class PublicAccModClass {

    // public scope variable
    public int var = 10;

    // public scope method
    public void print() {
        System.out.println("public scope access modifier!");;
    }
}

class PublicAccModTest {
    public static void main(String args[]){
        PublicAccModClass obj = new PublicAccModClass();
        obj.print();
        obj.var = 20;
    }
}