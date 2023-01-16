package ch13.wrapper;

public class WrapperClassEx02 {
    public static void main(String args[]){
        byte    b=20;
        short   s=10;
        int     i=70;
        long    l=200;
        float   f=10.0F;
        double  d=20.0D;
        char    c='c';
        boolean bool=true;

        // Autoboxing
        Byte    byteobj=b;
        Short   shortobj=s;
        Integer intobj=i;
        Long    longobj=l;
        Float   floatobj=f;
        Double  doubleobj=d;
        Character charobj=c;
        Boolean boolobj=bool;

        System.out.println("랩퍼 클래스 객체");
        System.out.println("Byte object :"+  byteobj);
        System.out.println("Short object: "+ shortobj);
        System.out.println("Integer object: "+ intobj);
        System.out.println("Long object: "+ longobj);
        System.out.println("Float object: "+ floatobj);
        System.out.println("Double object: "+ doubleobj);
        System.out.println("Character object: "+ charobj);
        System.out.println("Boolean object: "+ boolobj);

        // Unboxing
        byte    bytevalue = byteobj;
        short   shortvalue = shortobj;
        int     intvalue = intobj;
        long    longvalue = longobj;
        float   floatvalue = floatobj;
        double  doublevalue = doubleobj;
        char    charvalue = charobj;
        boolean boolvalue = boolobj;

        System.out.println("기본형(Primitive type)");
        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("int value: " + intvalue);
        System.out.println("long value: " + longvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);
        System.out.println("char value: " + charvalue);
        System.out.println("boolean value: " + boolvalue);


    }
}
