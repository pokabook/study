package study.chapter11;


import java.util.HashSet;
import java.util.Set;

class Element {
    String value;

    public  Element(String value){
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o instanceof Element) {
            return ((Element) o).value.equals(value);
        }
        return false;
    }

    public String toString(){
        return "Element[" + value + "]";
    }
}
public class HashSet2Demo {
    public static void main(String[] args) {
        Set<Element> h = new HashSet<>();
        h.add(new Element("안녕"));
        h.add(new Element("안녕"));
        System.out.println(h.size());
        System.out.println(h);
    }
}
