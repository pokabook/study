package study.chapter9;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        char[] a1 = {'J', 'a', 'v', 'a'};
        char[] a2 = Arrays.copyOf(a1, a1.length);//배열을 복사한다.
        System.out.println(a2);

        String[] sa = {"케이크", "애플", "도넛", "바나나"};
        print(sa);

        Arrays.sort(sa); //배열의 원소를 정렬한다.
        print(sa);

        System.out.println(Arrays.binarySearch(sa, "애플")); //배열을 이진 탐색한다.

        Arrays.fill(sa, 2, 4, "기타");//배열의 인덱스 2번에서 4-1번까지 원소를 '기타' 문자열로 채운다.
        print(sa);
    }

    private static void print(Object[] Oa) {
        for (Object o: Oa)
            System.out.print(o + " ");
        System.out.println();
    }
}
