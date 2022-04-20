package study.chapter6;


class Good{
}

class Better extends Good{
}

final class Best extends Better{
}
//class NumberOne extends Best {} Best 클래스는 final로 지정되어 있어 더 이상 자식 클래스로 확장할 수 없다. 따라서 NumberOne 클래스를 선언할 수 없다.
public class FinalClassDemo {
    public static void main(String[] args) {
        //new NumberOne();
        new Best();
    }
}