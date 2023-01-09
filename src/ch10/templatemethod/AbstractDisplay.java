package ch10.templatemethod;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    // Template method - 알고리즘 구조(처리과정)
    public final void display() {
        open();
        for(int i=0; i<5; i++){
            print();
        }
        close();
        System.out.println();
    }
}
