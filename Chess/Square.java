import java.awt.Color;

public class Square {

    private int rank, file;
    private Color color = Color.BLACK;
    private boolean isHighlighted = false;
    private String piece = null;

    public Square(int rank, int file, Color color) {
        this.rank = rank;
        this.file = file;
        this.color = color;
    }

    public void toggleHighlight() {
        this.isHighlighted = !this.isHighlighted;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }

    public int getRank() {return this.rank;}
    public int getFile() {return this.file;}
    public Color getColor() {return this.color;}
    public String getPiece() {return this.piece;}

    public void setPiece(String piece) {

        //"p" "r" "b" "k" "q" "K"
        this.piece = piece;
    }

}