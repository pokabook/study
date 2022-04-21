package study.chapter8;

public class MemberClassDemo { //외부 클래스
    private String secret = "비공개";
    String s = "외부";

    class MemberClass{ //인스턴스 멤버 클래스
        String s = "내부";

        public void show1(){
            System.out.println("인스턴스 멤버 클래스");
            System.out.println(secret);//외부 클래스의 private 멤버도 접근 가능.

            System.out.println(s);//08행의 멤버 s를 의미한다.

            System.out.println(MemberClassDemo.this.s);//05행의 멤버 s를 의미한다.
        }

        //static String ss = "정적 멤버 필드"; 인스턴스 멤버 클래스 내부에 정적 변수나 메서드를 포함할 수 없다.
        //static void show2() {}
    }

    public static void main(String[] args) {
        MemberClassDemo m = new MemberClassDemo();
        MemberClassDemo.MemberClass m1 = m.new MemberClass(); //MemberClassDemo 클래스의 멤버인 MemberClass를 의미한다.
                                                              //m.new MemberClass(); 인스턴스 멤버 객체를 생성한다.

        System.out.println(m1.s);
        m1.show1();
    }
}
