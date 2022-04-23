package study.chapter9;

import java.text.MessageFormat;

public class MessageFormatDemo {
    public static void main(String[] args) {
        String java = "Java";
        int version = 17;

        String s = MessageFormat.format("language : {1}\nversion : {0}", version, java); //version 패턴 메시지의 {1}에 대응된 값.
                                                                                                //language 패턴 메시지 {0}에 대응된 값.
        System.out.println(s);

        Object[] data = { java, version};

        MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");

        System.out.println(f.format(data));
    }
}
