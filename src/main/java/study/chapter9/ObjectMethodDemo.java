package study.chapter9;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech");
        Mouse m2 = new Mouse("Logitech");
        Mouse m3 = m1;
        Keyboard k1 = new Keyboard("Microsoft");
        Keyboard k2 = new Keyboard("Microsoft");

        System.out.println(m1.toString());
        System.out.println(m1); //객체 자체를 출력하면 객체의 toString() 메서드의 결과를 출력한다, 즉 m1.toString()과 동일하다

        System.out.println(k1.toString());
        System.out.println(k1);

        System.out.println(m1.equals(m2)); //Mouse 클래스는 Object 클래스에서 상속받은 equals() 메서드를 사용한다. 따라서 내용이 동일하더라도 다른 객체이기 때문에 flase
        System.out.println(m1.equals(m3));
        System.out.println(k1.equals(k2));
    }
}
