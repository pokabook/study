package study.chapter8;

public class Anonymous2Demo {
    public static void main(String[] args) {
        Bird b = new Bird() { //b 지역 변수이다.
            public void move() {
                System.out.println("독수리가 난다~~~."); //Bird 클래스의 move() 메서드를 오버라이딩한다.
            }
        };

        b.move();
    }
}
