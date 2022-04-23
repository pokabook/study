package study.chapter10;

import java.util.StringTokenizer;

public class UnChecked1Demo {
    public static void main(String[] args) {
        String s = "Time is money";
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()){
            System.out.print(st.nextToken()+"+");
        }
        System.out.print(st .nextToken());//더 이상 가져올 토큰이 없어 예외를 발생시킨다.
    }
}
