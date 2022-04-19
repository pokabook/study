package study.Chapter4;


class Circle3{
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public Circle3(double radius){
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}
public class CircleDemo3 {
    public static void main(String[] args) {
        Circle3 myCircle = new Circle3(10.0);
        Circle3 yourCircle = new Circle3(5.0);

        System.out.println("원의 개수 : "+ myCircle.numOfCircles);
        System.out.println("원의 개수 : "+ yourCircle.numCircles);
    }

    void printf() {
        System.out.println("인스턴스 메서드입니다.");
    }
}
