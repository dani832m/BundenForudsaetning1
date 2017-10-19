//Her vil jeg vise nogle af de ting, jeg indtil videre har lært i forhold til Java-programmering
//Kan køres via main() i "Start.java"

package dk.n4; //Angiver navn og location på min package

import java.util.Date; //Importerer Date-klassen fra "java.util"
import java.util.Scanner; //Importerer Scanner-klassen fra "java.util"

public class MineMetoder { //Angiver navnet og access modifier på ny klasse

    public void showOff() { //Metode hvori jeg skriver mine kodeeksempler, så jeg let kan kalde dem i main()

        System.out.println("SCANNER, ARRAY OG LOOPS:");

        //Her laver vi en ny array kaldet "mitArray"
        double[] mitArray = new double[10]; //Deklareres som double, og der gøres plads til 10 indexes

        //Vi laver et Scanner-objekt og udskriver en forklarende tekst
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast " + mitArray.length + " værdier herunder:"); //Antal indexes angives med .length

        //Vi laver et for-loop, der initialiserer vores array med brugerinputtet
        for (int i = 0; i < mitArray.length; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
            mitArray[i] = input.nextDouble(); //Tildeler i-værdien til "mitArray"

        System.out.print("Nu indeholder vores array disse værdier: ");

        // Her laver vi et for-loop, der printer hvert element i vores array
        for (int i = 0; i < mitArray.length; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
            System.out.print(mitArray[i] + " "); //"mitArray[i]" er naturligvis den værdi loopet initialiserer indexet

        // Vi laver et for-loop, der initialiserer vores array med et tilfældigt tal mellem 0 og 100, men mindre end 100
        for (int i = 0; i < mitArray.length; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
            mitArray[i] = Math.random() * 100; //Anvender Math.random til at generere et tilfældigt tal

        System.out.println("\n"); //Line break

        //Nu vil jeg demonstrere et while-loop
        int count = 1; //Deklarerer og initialiserer variablen "count"
        while (count < 7) { //Loopet kører så længe "count" er under 7
            System.out.println("Loopet har kørt " + count + " gange."); //Udskriver tekst i konsollen
            count++; //Lægger 1 til "count", og ser igen på loopets præmis
        }

        //Her er et do-while-loop. Forskellen er, at noget af koden eksekveres her uanset om loopets præmis overholdes
        int countAgain = 0; //Deklarerer og initialiserer variablen "countAgain", vi anvender i loopet
        do { //Dette eksekveres uanset om loopets præmis overholdes
            System.out.println("Lorem Ipsum #" + countAgain);
            countAgain++;
        } while (countAgain < 4); //Køres kun så længe "countAgain" er mindre end 4

        System.out.println("\nIF OG ELSE STATEMENTS:");

        /* Nu vil jeg demonstrere, hvordan man simpelt anvender if og else. Jeg bruger vores array fra tidligere
        for at opretholde en sammenhæng igennem koden */
        if(mitArray.length > 12) { //Hvis antal indexes i "mitArray" er større end 12, køres koden i de curly brackets
            System.out.println("Antallet af indexes i mitArray er større end 12."); //Udskrives i konsol if true
        }
        else if(mitArray.length < 12) { //Hvis den første "if" ikke var true, kigges der på denne præmis
            System.out.println("Antallet af indexes i mitArray er mindre end 12."); //Udskrives i konsol  if true
        } //Hvis ingen af de to præmisser var true, så afvikles "else"
        else System.out.println("Antallet af indexes i mitArray er præcis 12.");

        System.out.println("\nDATE-KLASSEN:");
        //Anvendelse af Class Date (https://docs.oracle.com/javase/7/docs/api/java/util/Date.html)

        Date dato = new Date(); //Opretter nyt objekt i klassen "Date" med default constructor

        //Default constructor i Date-klassen initialiserer automatisk et oprettet objekt med dagens dato
        System.out.println(dato); //Udprinter jeg objektet "dato", vil den derfor vise tid og dato for i dag

        //Date-klassen har også en metode kaldet "getTime()", som jeg kan kalde på vores oprettede Date-objekt
        System.out.println(dato.getTime()); //Udprinter millisekunder siden 1. januar 1970

        //I stedet for at udskrive objektet med default constructor, så kan jeg også kalde en metode med samme resultat
        System.out.println(dato.toString()); //Metode til at udprinte tid og dato for i dag

    }

}
