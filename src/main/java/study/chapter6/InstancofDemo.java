package study.chapter6;

public class InstancofDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Person p  = new Person();

        System.out.println(s instanceof Person);

        System.out.println(s instanceof Student);

        System.out.println(p instanceof Student);

        //System.out.println(s instanceof String); 항상 오류

        downcast(s);
    }
    static void downcast(Person p){
        if(p instanceof Student) {
            Student s = (Student) p;
            System.out.println("오케이, 하향 타입 변환");
        }
    }
}