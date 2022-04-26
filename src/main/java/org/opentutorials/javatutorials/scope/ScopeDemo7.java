package org.opentutorials.javatutorials.scope;

public class ScopeDemo7 {
    static int i = 5;

    static void a(){
        int i = 10;
        b(); //b 메서드 안에는 변수 i값이 존재 하지 않는다.
    }

    static void b(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        a();
    }
}
