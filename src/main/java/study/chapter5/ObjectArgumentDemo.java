package study.chapter5;

public class ObjectArgumentDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);

        zero(c1);//객체를 인수로 전달하면 객체의 주소 값을 매개변수에 복사한다
        System.out.println("원(c1)의 반지름 : " + c1.radius);

        zero(c2.radius);//기초 타입을 매개변수로 전달하면 기초 타입 값을 복사한다
        System.out.println("원(c2)의 반지름 : " + c2.radius);
    }

    public static void zero(Circle c) {
        c.radius = 0.0;
    }

    public static void zero(double r) {
        r = 0.0;
    }
}
