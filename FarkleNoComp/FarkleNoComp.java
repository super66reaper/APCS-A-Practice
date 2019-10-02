import java.util.*;

public class FarkleNoComp {
    public static void main(String[] args) {
        //https://www.wikihow.com/Play-Farkle
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int playerOneDiceRoll = 0;
        int playerTwoDiceRoll = 0;
        int playerOnePoints = 0;
        int playerTwoPoints = 0;
        int playerFirst = 0;

        //Who goes first
        System.out.println("Lets roll to see who should go first");
        while(playerOneDiceRoll == playerTwoDiceRoll) {
            System.out.println("Rolling again");
            playerOneDiceRoll = rand.nextInt(6) + 1;
            playerTwoDiceRoll = rand.nextInt(6) + 1;
        }
        System.out.println("Player one got a " + playerOneDiceRoll);
        System.out.println("Player two got a " + playerTwoDiceRoll);
        if (playerOneDiceRoll > playerTwoDiceRoll) {
            System.out.println("Player one will go first");
            playerFirst = 1;
        }else if (playerTwoDiceRoll > playerOneDiceRoll){
            System.out.println("Player two will go first");
            playerFirst = 2;
        }

        //Rolling
        while(playerOnePoints <= 10000 && playerTwoPoints <= 10000) {
            
        }
    }
}