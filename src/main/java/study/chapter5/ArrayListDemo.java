package study.chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>(); //Integer 타입의 ArrayList 객체를 생성한다
        int data;
        int sum = 0;

        while ((data = in.nextInt()) >= 0) //음수가 아닐 때 까지 반복
            scores.add(data);   //데이터를 동적 배열에 추가한다

        for(int i = 0; i < scores.size(); i++)
            sum += scores.get(i); //동적 배열의 i번째 원소를 가져온다

        System.out.println("평균 = " + sum / scores.size()); //scores.size() 동적 배열의 크기를 나타낸다
    }
}
