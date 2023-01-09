package ch07;

/**
 * 객체값을 복사하는 생성자
 */
public class CopyConstructorEx1 {
    int id;
    String name;

    CopyConstructorEx1(int i,String n){
        id = i;
        name = n;
    }
    //constructor to initialize another object
    CopyConstructorEx1(CopyConstructorEx1 originObj){
        id = originObj.id;
        name = originObj.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        CopyConstructorEx1 obj = new CopyConstructorEx1(123,"홍길동");
        CopyConstructorEx1 copyObj = new CopyConstructorEx1( obj );
        obj.display();
        copyObj.display();
    }
}
