package study.chapter6.chapter7;

public class ControllableDemo {
    public static void main(String[] args) {
       Controllable[] controllables = { new TV(), new Computer() };
       for(Controllable c : controllables){
           c.turnOn();
           c.turnOff();
           c.repair();
       }
       Controllable.reset();//정적 메서드는 인터페이스로 직접 호출해야 한다.
        //tv.reset();
        //com.reset();
    }
}
