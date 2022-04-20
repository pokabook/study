package study.chapter5;

public class VarArgsDemo {
    public static void main(String[] args) {
        printSum(1,2,3,4,5);
        printSum(10,20,30);

    }

    public static void printSum(int ... v){ //가변 개수 매개변수로 임의 개수의 int 타입 인수를 받을 수 있다.
        int sum = 0;
        for(int i : v)
            sum+=i;
        System.out.println(sum);
    }
}
