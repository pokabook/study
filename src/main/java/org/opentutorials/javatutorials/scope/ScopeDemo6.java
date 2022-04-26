package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //System.out.println(i); //유효하지 않은 변수
    }
}
