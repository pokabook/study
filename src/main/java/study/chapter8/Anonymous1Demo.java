package study.chapter8;

public class Anonymous1Demo {
    Bird e = new Bird() { //Anonymous1Demo 클래스의 멤버 필드이다.
        public void move() {
            System.out.println("독수리가 난다~~~.");//Bird 클래스의 move() 메서드를 오버라이딩한다.
        }

        void sound(){
        System.out.println("휘익~~~.");//무명 클래스의 메서드로 정의 했지만 Bird 타입의 객체로는 접근할 수 없다.
        }
    };

    public static void main(String[] args) {
        Anonymous1Demo a = new Anonymous1Demo();
        a.e.move(); //다형성으로 오버라이딩한 메서드를 호출한다.
        //a.e.sound(); //a.e 객체가 Bird 타입이므로 sound() 메서드를 호출할 수 없다.
    }
}
