package study.chapter10;

public class GenericClass2Demo {
    public static void main(String[] args) {
        CupDemo<Boricha> c = new CupDemo<Boricha>(); //Boricha 타입의 Cup 객체를 생성한다.

        c.setBeverage(new Boricha());
                                     // Boricha 타입의 Cup 객체이기 때문에 Beer 타입의 객체를 담을 수 없다.
        // c.setBeverage(new Beer());

        // Beer b = c.getBeverage(); //Cup 객체에 있는 Boricha 객체를 Beer 타입 변수에 대입할 수 없다.

        Boricha b = c.getBeverage(); //Boricha 객체가 반환되므로 타입 변환이 필요 없다.
    }
}
