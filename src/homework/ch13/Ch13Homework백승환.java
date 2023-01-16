package homework.ch13;

import org.w3c.dom.ls.LSOutput;

public class Ch13Homework백승환 {

    public static void main(String[] args) {

        int i;
        String[] sentence = new String[8];
        String word  = new String("HELL");

        sentence[0] = "안녕하세요!";
        sentence[1] = "반갑습니다!";
        sentence[2] = "안녕1";
        sentence[3] = "안녕i";
        sentence[4] = "1안녕2";
        sentence[5] = "안녕12";
        sentence[6] = "hello12";
        sentence[7] = "Hello12";

        for (i=0; i<8; i++){
            System.out.println(sentence[i]);
        }

        System.out.println(word.endsWith("HELL"));
        System.out.println(word.length());
        System.out.println(word.substring(1,3));

    }
}
