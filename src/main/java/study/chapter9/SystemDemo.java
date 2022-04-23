package study.chapter9;

public class SystemDemo {
    public static void main(String[] args) {
        int [] src = new int[] {1, 2, 3, 4, 5, 6};
        int [] dst = { 100, 200, 300, 400, 500, 600, 700};

        System.arraycopy(src, 2, dst, 3, 4);//배열 src의 2~5번 원소 4개 배열 dst의 3~6번 원소에 복사 한다. 배열은 0번부터 시작된다.
        for (int i = 0;i < dst.length; i++){
            System.out.print(dst[i] + " ");
        }
        System.out.println();

        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.nanoTime());
    }
}
