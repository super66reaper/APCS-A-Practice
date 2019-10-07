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

        boolean dice1Held = false;
        boolean dice2Held = false;
        boolean dice3Held = false;
        boolean dice4Held = false;
        boolean dice5Held = false;
        boolean dice6Held = false;

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
            if (!dice1Held) {
                dice1 = rand.nextInt(6) + 1;
            }
            if (!dice2Held) {
                dice2 = rand.nextInt(6) + 1;
            }
            if (!dice3Held) {
                dice3 = rand.nextInt(6) + 1;
            }
            if (!dice4Held) {
                dice4 = rand.nextInt(6) + 1;
            }
            if (!dice5Held) {
                dice5 = rand.nextInt(6) + 1;
            }
            if (!dice6Held) {
                dice6 = rand.nextInt(6) + 1;
            }
            
            PrintingRolls(dice1, dice2, dice3, dice4, dice5, dice6, dice1Held, dice2Held, dice3Held, dice4Held, dice5Held, dice6Held);

            //asking player to hold off dice
            while(usrDiceNum != 0) {
                System.out.println("\nType the number of the dice to keep it and type 0 to reroll");
                usrDiceNum = scan.nextInt();

                if (usrDiceNum == 1 && isPointDice(dice1)) {
                    diceKept += 1;
                    dice1Held = true;
                } else if(usrDiceNum == 1){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 2 && isPointDice(dice2)) {
                    diceKept += 1;
                    dice2Held = true;
                } else if(usrDiceNum == 2){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 3 && isPointDice(dice3)) {
                    diceKept += 1;
                    dice3Held = true;
                } else if(usrDiceNum == 3){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 4 && isPointDice(dice4)) {
                    diceKept += 1;
                    dice4Held = true;
                } else if(usrDiceNum == 4){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 5 && isPointDice(dice5)) {
                    diceKept += 1;
                    dice5Held = true;
                } else if(usrDiceNum == 5){
                    System.out.println("This dice is not a point dice and cannot be kept");
                }
                if (usrDiceNum == 6 && isPointDice(dice6)) {
                    diceKept += 1;
                    dice6Held = true;
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

    public static void PrintingRolls(int dice1, int dice2, int dice3, int dice4, int dice5, int dice6, boolean dice1Held, boolean dice2Held, boolean dice3Held, boolean dice4Held, boolean dice5Held, boolean dice6Held) {
        if (dice1Held) {
            System.out.println("(Held Off)Die1: " + dice1);
        }else {
            System.out.println("Die1: " + dice1);
        }
        if (dice2Held) {
            System.out.println("(Held Off)Die2: " + dice2);
        }else {
            System.out.println("Die2: " + dice2);
        }
        if (dice3Held) {
            System.out.println("(Held Off)Die3: " + dice3);
        }else {
            System.out.println("Die3: " + dice3);
        }
        if (dice4Held) {
            System.out.println("(Held Off)Die4: " + dice4);
        }else {
            System.out.println("Die4: " + dice4);
        }
        if (dice5Held) {
            System.out.println("(Held Off)Die5: " + dice5);
        }else {
            System.out.println("Die5: " + dice5);
        }
        if (dice6Held) {
            System.out.println("(Held Off)Die6: " + dice6);
        } else {
            System.out.println("Die6: " + dice6);
        }
    }
}