package ru.sf;

public class check {

    public static String ifClear(String opinion){

        if (opinion.equals("clear")) {
            return "Nice!";
        }
        else{
            return "Nope";
        }
    }
}
