public class Interface {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen moves up, dow, left, right and diagonally in all 4 directions");
    }
}
class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("Rook moves up, down, left and right");
    }
}
class King implements ChessPlayer{
    public void moves() {
        System.out.println("King moves up, down, left and right");
    }
}