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
        int pointsToAdd = 0;
        int usrDiceNum = 1;
        int diceWith1 = 0;
        int diceWith2 = 0;
        int diceWith3 = 0;
        int diceWith4 = 0;
        int diceWith5 = 0;
        int diceWith6 = 0;

        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;
        int dice4 = 0;
        int dice5 = 0;
        int dice6 = 0;
        int diceKept = 0;

        boolean dice1Held = false;
        boolean dice2Held = false;
        boolean dice3Held = false;
        boolean dice4Held = false;
        boolean dice5Held = false;
        boolean dice6Held = false;
        boolean nextTurn = false;
        boolean finalTurn = false;
        boolean gameFinished = false;
        boolean dice1Points = false;
        boolean dice2Points = false;
        boolean dice3Points = false;
        boolean dice4Points = false;
        boolean dice5Points = false;
        boolean dice6Points = false;

        //Who goes first
        System.out.println("Lets roll to see who should go first");
        while(playerOneDiceRoll == playerTwoDiceRoll) {
            playerOneDiceRoll = rand.nextInt(6) + 1;
            playerTwoDiceRoll = rand.nextInt(6) + 1;
        }
        System.out.println("Player one got a " + playerOneDiceRoll);
        System.out.println("Player two got a " + playerTwoDiceRoll);
        if (playerOneDiceRoll > playerTwoDiceRoll) {
            System.out.println("Player one will go first\n");
            playerFirst = 1;
        }else if (playerTwoDiceRoll > playerOneDiceRoll){
            System.out.println("Player two will go first\n");
            playerFirst = 2;
        }
        
        //Rolling
        while(!gameFinished) {
            if (finalTurn) {
                gameFinished = true;
                if (playerFirst == 1) {
                    System.out.println("Player Two has won\nPlayer One has one chance to redeem themself");
                }else if(playerFirst == 2){
                    System.out.println("Player One has won\nPlayer Two has one chance to redeem themself");
                }
            }
            diceKept = 0;
            usrDiceNum = 1;
            System.out.println("\nRolling");
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
            
            printingRolls(dice1, dice2, dice3, dice4, dice5, dice6, dice1Held, dice2Held, dice3Held, dice4Held, dice5Held, dice6Held);

            //Sets if dice have value
            if(isPointDice(dice1)) {
                dice1Points = true;
            }else {
                dice1Points = false;
            }
            if(isPointDice(dice2)) {
                dice2Points = true;
            }else {
                dice2Points = false;
            }
            if(isPointDice(dice3)) {
                dice3Points = true;
            }else {
                dice3Points = false;
            }
            if(isPointDice(dice4)) {
                dice4Points = true;
            }else {
                dice4Points = false;
            }
            if(isPointDice(dice5)) {
                dice5Points = true;
            }else {
                dice5Points = false;
            }
            if(isPointDice(dice6)) {
                dice6Points = true;
            }else {
                dice6Points = false;
            }

            //Checks three of a kind
            diceWith1 = threeOfKind(1, dice1, dice2, dice3, dice4, dice5, dice6);
            diceWith2 = threeOfKind(2, dice1, dice2, dice3, dice4, dice5, dice6);
            diceWith3 = threeOfKind(3, dice1, dice2, dice3, dice4, dice5, dice6);
            diceWith4 = threeOfKind(4, dice1, dice2, dice3, dice4, dice5, dice6);
            diceWith5 = threeOfKind(5, dice1, dice2, dice3, dice4, dice5, dice6);
            diceWith6 = threeOfKind(6, dice1, dice2, dice3, dice4, dice5, dice6);

            if(diceWith1 >= 3) {
            }
            if(diceWith2 >= 3) {
            }
            if(diceWith3 >= 3) {
            }
            if(diceWith4 >= 3) {
            }
            if(diceWith5 >= 3) {
            }
            if(diceWit6 >= 3) {
            }

            //Checks if Farkle
            if(!isFarkle (dice1Points, dice2Points, dice3Points, dice4Points, dice5Points, dice6Points)) {
                //asking player to hold off dice
                while(usrDiceNum != 0 && usrDiceNum != 7) {
                    System.out.println("\nType the number of the dice to keep it, type 0 to reroll and type 7 to end turn");
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

                    if((diceKept == 0 && usrDiceNum == 0) || (diceKept == 0 && usrDiceNum == 7)) {
                        usrDiceNum = 1;
                        System.out.println("You need to at least set aside 1 dice");
                    }
                }
            }else if(isHotDice(dice1Points, dice2Points, dice3Points, dice4Points, dice5Points, dice6Points, dice1Held, dice2Held, dice3Held, dice4Held, dice5Held, dice6Held)){
                System.out.println("\nHot Dice!\n");
                dice1Held = false;
                dice2Held = false;
                dice3Held = false;
                dice4Held = false;
                dice5Held = false;
                dice6Held = false;
                pointsToAdd = 0;
                nextTurn = false;
            }else {
                System.out.println("\nFarkle!\n");
                nextTurn = true;
            }

            //adding points
            if (usrDiceNum == 7) {
                if (dice1Held) {
                    pointsToAdd += addPoints(dice1);
                }
                if (dice2Held) {
                    pointsToAdd += addPoints(dice2);
                }
                if (dice3Held) {
                    pointsToAdd += addPoints(dice3);
                }
                if (dice4Held) {
                    pointsToAdd += addPoints(dice4);
                }
                if (dice5Held) {
                    pointsToAdd += addPoints(dice5);
                }
                if (dice6Held) {
                    pointsToAdd += addPoints(dice6);
                }

                nextTurn = true;
            }

            //reseting for next turn
            if(nextTurn) {
                if (playerFirst == 1) {
                    playerOnePoints += pointsToAdd;
                    playerFirst = 2;
                    System.out.println("\nPlayer Two is up\n");
                }else if(playerFirst == 2){
                    playerTwoPoints += pointsToAdd;
                    playerFirst = 1;
                    System.out.println("\nPlayer One is up\n");
                }

                dice1Held = false;
                dice2Held = false;
                dice3Held = false;
                dice4Held = false;
                dice5Held = false;
                dice6Held = false;
                pointsToAdd = 0;
                nextTurn = false;

                System.out.println("Player One: " + playerOnePoints);
                System.out.println("Player Two: " + playerTwoPoints);

                if (playerOnePoints >= 10000 || playerTwoPoints >= 10000){
                    finalTurn = true;
                }
            }
        }
        if(playerOnePoints > playerTwoPoints) {
            System.out.println("Player One Wins!");
        }else {
            System.out.println("Player Two Wins!");
        }
    }

    public static boolean isPointDice(int diceNum) {
        if (diceNum == 1 || diceNum == 5) {
            return true;
        }else {
            return false;
        }
    }

    public static int threeOfKind(int numToCheck, int dice1, int dice2, int dice3, int dice4, int dice5, int dice6) {
        int result = 0;
        result = singleThreeOfKind(numToCheck, dice1, dice2, dice3, dice4, dice5, dice6);
        return result;
    }

    public static int singleThreeOfKind(int diceNum, int dice1, int dice2, int dice3, int dice4, int dice5, int dice6) {
        int result = 0;
        for(int times = 0; times < 6; times++) {
            if(dice1 == diceNum) {
                result += 1;
            }
            if(dice2 == diceNum) {
                result += 1;
            }
            if(dice3 == diceNum) {
                result += 1;
            }
            if(dice4 == diceNum) {
                result += 1;
            }
            if(dice5 == diceNum) {
                result += 1;
            }
            if(dice6 == diceNum) {
                result += 1;
            }
        }
        return result;
    }

    public static void printingRolls(int dice1, int dice2, int dice3, int dice4, int dice5, int dice6, boolean dice1Held, boolean dice2Held, boolean dice3Held, boolean dice4Held, boolean dice5Held, boolean dice6Held) {
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

    public static int addPoints(int pointDiceNum) {
        if (pointDiceNum == 1) {
            return 100;
        }else if(pointDiceNum == 5) {
            return 500;
        }else {
            return 0;
        }
    }

    public static boolean isFarkle(boolean dice1, boolean dice2, boolean dice3, boolean dice4, boolean dice5, boolean dice6) {
        if (dice1 || dice2 || dice3 || dice4 || dice5 || dice6){
            return false;
        }else {
            return true;
        }
    }

    public static boolean isHotDice(boolean dice1, boolean dice2, boolean dice3, boolean dice4, boolean dice5, boolean dice6, boolean dice1Held, boolean dice2Held, boolean dice3Held, boolean dice4Held, boolean dice5Held, boolean dice6Held) {
        if(!dice1Held) {
            if (dice1) {
                return false;
            }
        }
        if(!dice2Held) {
            if (dice2) {
                return false;
            }
        }
        if(!dice3Held) {
            if (dice3) {
                return false;
            }
        }
        if(!dice4Held) {
            if (dice4) {
                return false;
            }
        }
        if(!dice5Held) {
            if (dice5) {
                return false;
            }
        }
        if(!dice6Held) {
            if (dice6) {
                return false;
            }
        }
        return true;
    }
}