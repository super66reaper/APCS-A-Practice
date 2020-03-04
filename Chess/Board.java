import java.awt.Color;

public class Board {
    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        for(int row = 0; row < squares.length; row++) {
            boolean isBlack = (row % 2 == 0) ? true : false;

            for(int col = 0; col < squares[row].length; col++) {
                int rank = squares.length - row;
                int file = col + 1;
                Color color = Color.WHITE;

                if(isBlack) {
                    color = Color.BLACK;
                }

                squares[row][col] = new Square(rank, file, color);
                isBlack = !isBlack;
            }
        }
    }

    public void drawBoard() {
        //Piece == []
        //Highlighted piece == *

        for(Square[] squareRow : squares) {
            System.out.println("");
            for(Square square : squareRow) {
                if(square.getColor() == Color.BLACK) {
                    System.out.print("[");
                }else {
                    System.out.print("{");
                }

                if(square.getPiece() != null){
                    System.out.print(square.getPiece());
                }
                if(square.isHighlighted()) {
                    System.out.print("*");
                }else if(square.getPiece() == null){
                    System.out.print(" ");
                }

                if(square.getColor() == Color.BLACK) {
                    System.out.print("]");
                }else {
                    System.out.print("}");
                }
            }   
        }
    }

    public Square getSquare(int rank, int file) {
        int r = squares.length - rank;
        int f = file - 1;
        return squares[r][f];
    }

    public void clearBoard(){
        for(Square[] squareRow : squares) {
            for(Square square : squareRow) {
                if(square.isHighlighted()) {
                    square.toggleHighlight();
                }
                square.setPiece(null);
            }   
        }
    }
}