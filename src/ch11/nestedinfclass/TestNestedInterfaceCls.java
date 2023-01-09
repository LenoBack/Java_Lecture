package ch11.nestedinfclass;

class A{
    interface Message{
        void msg();
    }
}

class TestNestedInterface implements A.Message{
    public void msg(){
        System.out.println("안녕! nested interface");
    }

    public static void main(String args[]){
        A.Message message=new TestNestedInterface();
        message.msg();
    }
}

