package ch13.prop;

import java.io.FileWriter;
import java.util.Properties;

public class PropsTestEx2 {
    public static void main(String[] args)throws Exception{
        Properties p=new Properties();
        p.setProperty("name","홍길동");
        p.setProperty("email","perfectjava@naver.com");

        p.store(new FileWriter("info.properties"),"Properties Example");
    }
}
