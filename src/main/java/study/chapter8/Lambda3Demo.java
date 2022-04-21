package study.chapter8;


interface Printable{
    void print();
}
public class Lambda3Demo {
    public static void main(String[] args) {
        Printable p;
        p = () -> {
            System.out.println("안녕!");
        };

        p = () -> System.out.println("안녕!");
        p.print();
    }
}
