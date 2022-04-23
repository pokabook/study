package study.chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println(sdf1.format(d)); //Date 객체를 날짜 포멧에 맞춘 문자열로 반환한다.

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            d = sdf2.parse("2023-02-28");
        }catch (ParseException e){
        }
        System.out.println(sdf1.format(d));
    }
}
