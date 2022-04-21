package study.chapter8;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        String [] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};

        Arrays.sort(strings, new Comparator<String>() { //Comparator 인터페이스의 무명 구현 객체로서 문자열의 길이를 비교
            @Override
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        });
        for (String s : strings)
            System.out.println(s);
    }
}
