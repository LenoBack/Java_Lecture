package ch05;

// default scope class
class DefaultAccModClass {

    // default scope variable
    int var = 10;

    // default scope method
    void print() {
        System.out.println("default scope access modifier!");;
    }
}

class DefaultAccModTest {
    public static void main(String args[]){
        DefaultAccModClass obj = new DefaultAccModClass();
        obj.print();
        obj.var = 20;
    }
}