package study.chapter6;


class SportsCar extends Car{
    void whoami() {
        System.out.println("나는 스포츠 자동차이다.");
    }
}
public class PolymorDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new SportsCar();

        for (Vehicle v: vehicles) {
            v.whoami();//v가 vehicles[0]이라면 Car 클래스의 whoami() 호출
                       //vehicles[1]이라면 SportsCar 클래스의 whoami() 호출
        }
    }
}
