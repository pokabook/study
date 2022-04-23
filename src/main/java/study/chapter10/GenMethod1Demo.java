package study.chapter10;

public class GenMethod1Demo {
    static class Utils {
        public static <T/*타입 매개변수*/> void showArray(T[]/*매개변수의 타입*/ a){
            for (T t: a)
                System.out.printf("%s ", t);
            System.out.println();
        }

        public static <T> T /*반환 타입이다.*/ getList(T[] a) {
            return a[a.length -1];
        }
    }

    public static void main(String[] args) {
        Integer[] ia = {1,2,3,4,5};
        Character[] ca = {'H', 'E', 'L', 'L', 'O'};

        Utils.showArray(ia); //제네릭 메서드의 구체적 타입을 생략해도 된다
        Utils.<Character>showArray(ca); //호출할 때 구체적인 타입을 명시해도 된다.

        System.out.println(Utils.getList(ia));
    }
}
