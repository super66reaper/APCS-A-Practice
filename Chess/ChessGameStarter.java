public class ChessGameStarter {
    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        game.placeRook(4, 4);
        game.drawBoard();

        // ChessGame game1 = new ChessGame();
        // game1.placeKnight(1, 1);
        // game1.drawBoard();
    }
}