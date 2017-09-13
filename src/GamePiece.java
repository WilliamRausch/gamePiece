public class GamePiece {
    public static void main(String[] args) {
    Piece gamepiece = new Piece();
    gamepiece.move(1,1);
    gamepiece.freeze();
    gamepiece.move(2,1);
    gamepiece.unfreeze();
    gamepiece.getPositionX();
    gamepiece.getPositionY();
    gamepiece.move(1,2);
    }
}