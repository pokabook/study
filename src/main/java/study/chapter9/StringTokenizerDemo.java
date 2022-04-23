package study.chapter9;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";

        StringTokenizer st = new StringTokenizer(s, " ,"); //공백과 콤마를 구분자로 파싱한 StringTokenizer 객체를 생성.

        System.out.println(st.countTokens()); //토큰의 개수를 출력.

        while (st.hasMoreTokens()) { //토큰이 남아 있을 때까지 다음 토큰을 꺼내어 출력.
            System.out.print("[" + st.nextToken() + "] ");
        }
    }
}
