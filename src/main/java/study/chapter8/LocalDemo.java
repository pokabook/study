package study.chapter8;

public class LocalDemo {
    public static void main(String[] args) {
        class Eagle extends Bird { //지역 클래스이다.
            public void move() {
                System.out.println("독수리가 난다~~~."); //Bird 클래스의 move()를 오버라이딩한 메서드이다.
            }
        }

        Bird e = new Eagle(); //e main() 메서드의 지역 변수이다.
        e.move();
    }
}
