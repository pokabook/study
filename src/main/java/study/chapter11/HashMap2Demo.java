package study.chapter11;

import java.util.HashMap;
import java.util.Map;

public class HashMap2Demo  {
    public static void main(String[] args) {
        Map<Element, Integer> map = new HashMap<>();
        map.put(new Element("안녕"),1);
        map.put(new Element("안녕"),2);
        map.put(null, 3);
        System.out.println(map.size());
        System.out.println(map);
    }
}
