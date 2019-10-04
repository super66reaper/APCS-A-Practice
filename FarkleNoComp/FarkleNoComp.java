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

        int i = 0;
        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;
        int dice4 = 0;
        int dice5 = 0;
        int dice6 = 0;

        //Who goes first
        System.out.println("Lets roll to see who should go first");
        while(playerOneDiceRoll == playerTwoDiceRoll) {
            playerOneDiceRoll = rand.nextInt(6) + 1;
            playerTwoDiceRoll = rand.nextInt(6) + 1;
        }
        System.out.println("Player one got a " + playerOneDiceRoll);
        System.out.println("Player two got a " + playerTwoDiceRoll);
        if (playerOneDiceRoll > playerTwoDiceRoll) {
            System.out.println("Player one will go first");
            playerFirst = 1;
        }else if (playerTwoDiceRoll > playerOneDiceRoll){
            System.out.println("Player two will go first\n");
            playerFirst = 2;
        }


        int diceKept = 0;
        int usrDiceNum = 1;

        //Rolling
        while(playerOnePoints <= 10000 && playerTwoPoints <= 10000) {
            usrDiceNum = 1;
            System.out.println("Rolling");
            if (dice1 < 7) {
                dice1 = rand.nextInt(6) + 1;
            }else {
                dice1 -= 6;
            }
            if (dice2 < 7) {
                dice2 = rand.nextInt(6) + 1;
            }
            if (dice3 < 7) {
                dice3 = rand.nextInt(6) + 1;
            }
            if (dice4 < 7) {
                dice4 = rand.nextInt(6) + 1;
            }
            if (dice5 < 7) {
                dice5 = rand.nextInt(6) + 1;
            }
            if (dice6 < 7) {
                dice6 = rand.nextInt(6) + 1;
            }
            System.out.println("Die1: " + dice1);
            System.out.println("Die2: " + dice2);
            System.out.println("Die3: " + dice3);
            System.out.println("Die4: " + dice4);
            System.out.println("Die5: " + dice5);
            System.out.println("Die6: " + dice6);
            while(usrDiceNum != 0) {
                System.out.println("\nType the number of the dice to keep it and type 0 to reroll");
                usrDiceNum = scan.nextInt();

                if (usrDiceNum == 1 && isPointDice(dice1)) {
                    dice1 += 6;
                    diceKept += 1;
                } else if(usrDiceNum == 1){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 2 && isPointDice(dice2)) {
                    dice2 += 6;
                    diceKept += 1;
                } else if(usrDiceNum == 2){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 3 && isPointDice(dice3)) {
                    dice3 += 6;
                    diceKept += 1;
                } else if(usrDiceNum == 3){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 4 && isPointDice(dice4)) {
                    dice4 += 6;
                    diceKept += 1;
                } else if(usrDiceNum == 4){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 5 && isPointDice(dice5)) {
                    dice5 += 6;
                    diceKept += 1;
                } else if(usrDiceNum == 5){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 6 && isPointDice(dice6)) {
                    dice6 += 6;
                    diceKept += 1;
                } else if(usrDiceNum == 6){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
            }
        }
    }

    public static boolean isPointDice(int diceNum) {

        if (diceNum == 1 || diceNum == 5) {
            return true;
        }else {
            return false;
        }
    }
    

    public static boolean isThreeOfKind(int dice1, int dice2, int dice3, int dice4, int dice5, int dice6) {
        if (dice1 == dice2) {
            return true;
        }else {
            return false;
        }
    }
}