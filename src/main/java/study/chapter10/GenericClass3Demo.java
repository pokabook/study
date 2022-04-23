package study.chapter10;

public class GenericClass3Demo {
    public static void main(String[] args) {
        CupDemo c1 = new CupDemo(); //구체적인 타입이 없으므로 Raw 타입의 제네릭 클래스를 사용한다.

        c1.setBeverage(new Beer()); //Raw 타입의 Cup 객체이므로 어떤 타입의 객체든 추가할 수 있다.

        //Beer beer = c1.getBeverage(); //어떤 타입이 반환되는지 알 수 없으므로 타입 변환이 필요하다.

        Beer beer = (Beer) c1.getBeverage();
    }
}
