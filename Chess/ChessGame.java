public class ChessGame {

    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public void drawBoard() {
        board.drawBoard();
    }

    public void placeRook(int rank, int file) {
        board.getSquare(rank, file).setPiece("r");
        // for(int row = 1; row <= 8; row++) {
        //     for(int col = 1; col <= 8; col++) {
                
        //         if((row == rank && col != file) || (row != rank && col == file)) {
        //             board.getSquare(row, col).toggleHighlight();
        //             //System.out.println("Highlighted Square");
        //         }
        //     }
        // }
        //second way to do problem

        for(int i = 1; i <= 8; i++) {
            board.getSquare(rank, i).toggleHighlight();
            board.getSquare(i, file).toggleHighlight();
        }
    }

    public void placeKnight(int rank, int file) {
        board.getSquare(rank, file).setPiece("k");
        for(int row = 1; row <= 8; row++) {
            for(int col = 1; col <= 8; col++) {
                if((row == rank + 2 || row == rank - 2) && (col == file - 1 || col == file + 1)) {
                    board.getSquare(row, col).toggleHighlight();
                }
                if((row == rank + 1 || row == rank - 1) && (col == file - 2 || col == file + 2)) {
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }
    }
}