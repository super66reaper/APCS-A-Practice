import java.time.LocalDateTime;
import java.util.Scanner;

public class TimeUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usrHours;
        int usrMins;
        int usrSecs;

        int hour = LocalDateTime.now().getHour();
        int min = LocalDateTime.now().getMinute();
        int sec = LocalDateTime.now().getSecond();

        System.out.println("Give me a time to find out how long it will be till then:");

        //asking for numbers
        System.out.println("Hours:");
        usrHours = scan.nextInt();
        if (usrHours > 24 || usrHours < 1) {
            System.out.println("Hours can't be above 24 or lower then 1");
            System.exit(0);
        }

        System.out.println("Minutes:");
        usrMins = scan.nextInt();
        if (usrMins > 60 || usrMins < 0) {
            System.out.println("Minutes can't be above 60 or lower then 0");
            System.exit(0);
        }

        System.out.println("Seconds:");
        usrSecs = scan.nextInt();
        if (usrSecs > 60 || usrSecs < 0) {
            System.out.println("Seconds can't be above 60 or lower then 0");
            System.exit(0);
        }

        //figures out hour
        int hourUntil = 0;
        int displayHour = 1;
        if (usrHours < hour) {
            hourUntil = (24 - hour) + usrHours - 1;
        }
        else if (hour == usrHours){
            displayHour = 0;
        }
        else {
            hourUntil = usrHours - hour;
        }

        //figures out min
        int minUntil = 0;
        int displayMin = 1;
        if (usrMins < min) {
            minUntil = (60 - min) + usrMins;
            hourUntil -= 1;
        }
        else if (min == usrMins){
            displayMin = 0;
        }
        else {
            minUntil = usrMins - min;
        }

        //figures out min
        int secUntil = 0;
        int displaySec = 1;
        if (usrSecs < sec) {
            secUntil = (60 - sec) + usrSecs;
            minUntil -= 1;
        }
        else if (sec == usrSecs){
            displaySec = 0;
        }
        else {
            secUntil = usrSecs - sec;
        }

        //gets string ready
        String tellHour = "";
        String tellMin = "";
        String tellSec = "";
        if (displayHour == 1) {
            tellHour = (hourUntil + " hours ");
        }

        if (displayMin == 1) {
            tellMin = (minUntil + " minutes ");
        }

        if (displaySec == 1) {
            tellSec = (secUntil + " seconds ");
        }

        //displays the message
        if (displayHour == 0 && displayMin == 0 && displaySec == 0) {
            System.out.println("It is that time");
        }
        else {
            System.out.println(tellHour + tellMin + tellSec + "until then");
        }
    }
}