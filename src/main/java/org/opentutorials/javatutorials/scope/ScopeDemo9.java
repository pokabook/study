package org.opentutorials.javatutorials.scope;

class C2{
    int v = 10;

    void m(){
        int v = 20; //지역변수가 전역변수보다 우선순위가 높다
        System.out.println(v);
    }
}
public class ScopeDemo9 {
    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();
    }
}
