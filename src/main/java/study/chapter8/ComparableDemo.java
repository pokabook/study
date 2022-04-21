package study.chapter8;

import java.util.Arrays;

class Rectangle implements Comparable{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int findArea() {
        return width * height;
    }

    public String toString() {
        return "사각형[넓이=" + width +", 높이= " + height + "]";
    }

    public int compareTo(Object o) { //Comparable 인터페이스의 추상 메서드를 구현
        Rectangle other = (Rectangle) o;

        if(this.findArea() < other.findArea()) // 다른 객체의 넓이와 비교해 -1, 1, 0을 반환
            return -1;
        else if(this.findArea() > other.findArea())
            return 1;
        else
            return 0;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        Rectangle[] rectangles = {new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5)};

        Arrays.sort(rectangles); //비교 기준이 없는 Rectangle 객체들을 정렬한다.

        for(Rectangle r : rectangles) //정렬한 Rectangle 객체 배열의 문자 정보를 출력한다.
            System.out.println(r);
    }
}
