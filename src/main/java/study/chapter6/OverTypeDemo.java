package study.chapter6;

class Vehicle {
    String name = "탈 것";

    void whoami(){
        System.out.println("나는 탈 것이다.");
    }

    static void move() {
        System.out.println("이동하다.");
    }
}

class Car extends Vehicle {
    String name = "자동차";

    void whoami() {
        System.out.println("나는 자동차다.");
    }

    static void move() {
        System.out.println("달리다.");
    }
}
public class OverTypeDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.name);//Vehicle 타입의 name 필드에 접근한다
        v.whoami();//v의 실제 객체는 Car 타입이므로 Car 타입의 whoami() 메서드를 호출한다
        v.move(); //정적 메서드이므로 부모 객체의 메소드를 호출
    }
}
