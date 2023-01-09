package ch05;

class PrivateAccModClass {

    // private scope variable
    private int var;

    // private scope method
    private void print() {
        System.out.println("private scope access modifier!");;
    }
}

public class PrivateAccModTest {
    public static void main(String args[]){
        PrivateAccModClass obj = new PrivateAccModClass();
//        obj.print();
//        obj.var = 20;
    }
}