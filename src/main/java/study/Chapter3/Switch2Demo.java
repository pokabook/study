package study.Chapter3;

public class Switch2Demo {
    public static void main(String[] args) {
        String english = "odd";

        switch (english) {
            case "odd":
                System.out.println("홀수입니다.");
                break;
            case "even":
                System.out.println("짝수입니다.");
                break;
            default:
                System.out.println("짝수도 홀수도 아닙니다.");
        }
    }
}
