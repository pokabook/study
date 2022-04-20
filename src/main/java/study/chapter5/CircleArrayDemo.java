package study.chapter5;


class Circle{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    double findArea(){
        return 3.14 * radius * radius;
    }
}
public class CircleArrayDemo {
    public static void main(String[] args) {
     Circle[] circles = new Circle[5]; //5개의 Circle 객체를 가진 배열 변수를 선언한다

        for (int i = 0; i < circles.length; i++) { // circles.length : Circle 객체 배열의 크기이다
            circles[i] = new Circle(i+1.0); //Circle 객체를 생성해서 배열의 각 원소에 대입한다
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());//i 번째 객체 배열의 radius 필드 값과 findArea() 메서드 값이다
        }
    }
}
