package study.chapter10;

public class GenericClass1Demo {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Boricha());
                                     //Cup 객체에 모든 객체를 담을 수 있으므로  Boricha 객체도 Beer 객체도 담을 수 있다. Cup 객체에는 Beer 객체만 남아 있다.
        c.setBeverage(new Beer());

        Beer b1 = (Beer) c.getBeverage(); //getBeverage() 메서드 Object 타입을 반환하므로 Beer 타입으로 변환해야 한다.

        Boricha b2 = (Boricha) c.getBeverage(); //Cup에 있는 Beer 객체 Boricha 타입으로 변환하므로 실행 오류가 발생한다.
    }
}
