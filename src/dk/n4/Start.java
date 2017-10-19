/***** BUNDEN FORUDSÆTNING *****
Dette projekt indeholder fire klasser, der alle i nogen udstrækning kan associeres med hinanden.
I denne klasse er vores main(), der bringer de tre klasser "Studerende.java", "DatHoldet.java" og "MineMetoder" i spil.
Udarbejdet af Daniel Lyck, oktober 2017, EASJ Næstved. GitHub @dani832m */

package dk.n4; //Angiver navn og location på min package

public class Start { //Angiver navnet og access modifier på klassen

    public static void main(String[] args) { //Programeksekvering (Main Method)

        System.out.println("--- BUNDEN FORUDSÆTNING #1 ---\n");

        DatHoldet mitHold = new DatHoldet(); //Jeg opretter et nyt hold (objekt) ud fra min class "DatHoldet"
        mitHold.holdInfo(); //Jeg kalder min metode "holdInfo", der indeholder alle de oprettede studerende-objekter

        System.out.println("\n-------------------------------\n");

        MineMetoder methods = new MineMetoder(); //Jeg opretter et nyt objekt ud fra min class "MineMetoder"
        methods.showOff(); //Jeg kalder min metode "showOff", der indeholder lidt forskellige ting og sager

    }

}
