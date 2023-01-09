package ch11;

public class PrintableInfTest implements Printable{
    public void print(){
        System.out.println("안녕! 인터페이스");
    }

    public static void main(String args[]){
        PrintableInfTest obj = new PrintableInfTest();
        obj.print();
    }
}
