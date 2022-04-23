package study.chapter9;


class Garbage{
    public int no;

    public Garbage(int no){
        this.no = no;
        System.out.printf("Garbage(%d) 생성\n", no);
    }

    protected void finalize(){ //가비지를 수거하기 전에 가비지 컬렉터가 호출하는 Object 클래스의 메서드이다. 가비지 수거 과정을 출력하려고 오버라이딩 당한 코드.
        System.out.printf("Garbage(%d) 수거\n", no);
    }
}
public class GarbageDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            new Garbage(i); //생성된 객체를 참조 변수에 대입하지 않았기 때문에 바로 가비지가 된다.

        System.gc(); //JVM에 빨리 가비지 컬렉터를 실행하라고 요청한다.
    }
}
