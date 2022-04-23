package study.chapter10;

public class TryCatch3Demo {
    public static void main(String[] args) {
        int[] array = {0,1,2};
        try{
            int x = array[3];
        } catch (Exception e){
            System.out.println("어이쿠!!!");
        } /*catch (ArrayIndexOutOfBoundsException e){ //Exception 객체를 처리하는 catch 블록에서 모든 예외를 처리하므로 이 catch 블록은 도달할 수 없다.
            System.out.println("원소가 존재하지 않습니다.");
        }*/
        System.out.println("종료");
    }
}
