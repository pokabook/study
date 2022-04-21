package study.chapter7;

public class ControllableDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer com = new Computer();
        tv.turnOn();
        tv.turnOff();
        tv.repair();
        com.turnOn();
        com.turnOff();
        com.repair();
        Controllable.reset();//정적 메서드는 인터페이스로 직접 호출해야 한다.
        //tv.reset();
        //com.reset();
    }
}
