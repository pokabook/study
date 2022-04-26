package org.opentutorials.javatutorials.scope;

import java.util.StringJoiner;

class A { //클래스 A 구현
    public static int a = 0; //변수 선언
    public int b = 1; //변수 선언
    static int c = 2; //변수 선언

    public void view() { //전역변수 출력
        System.out.println(new StringJoiner(", ").add(String.valueOf(a)).add(String.valueOf(b)).add(String.valueOf(c)).toString());
    }

    public void set() { //전역변수 수정 및 출력
        a = 3;
        b = 4;
        c = 5;
        System.out.println(new StringJoiner(", ").add(String.valueOf(a)).add(String.valueOf(b)).add(String.valueOf(c)).toString());
    }

    public void voidSet() { //지역변수 수정 및 출력
        int a = 6;
        int b = 7;
        int c = 8;
        System.out.println(new StringJoiner(", ").add(String.valueOf(a)).add(String.valueOf(b)).add(String.valueOf(c)).toString());
    }

}
public class ScopeDemo5{
    public static void main(String[] args) {
        A p = new A(); //객체 선언
        p.view(); //출력
        p.set(); //전역 정의
        p.view(); //출력
        p.voidSet(); //지역 정의
        p.view(); //출력
    }
}