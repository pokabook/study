package study.chapter10;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            square(in.nextLine());
        } catch (NumberFormatException e){ //square() 메서드에서 예외가 발생하면 스스로 처리하지 않고 여기서 처리한다.
            System.out.println("정수가 아닙니다.");
        }
    }

    private static void square(String s) throws NumberFormatException { //s가 숫자 문자열이 아니면 NumberFormatException 예외가 발생한다.
        int n = Integer.parseInt(s);
        System.out.println(n * n);
    }
}
