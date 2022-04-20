package study.chapter6;

class Chess{
    enum ChessPlayer{
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
}

class WorldChess extends Chess{
    //ChessPlayer getFirstPlayer() {}  getFirstPlayer()는 final 메서드이기 때문에 오버라이딩 하면 오류가 발생한다.
}
public class FinalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
