//Denne klasse fungerer som skabelon (template) for de objekter, der bliver oprettet som studerende i "DatHoldet.java"

package dk.n4; //Angiver navn og location på min package

public class Studerende { //Angiver navnet og access modifier på klassen

    //Indkapslede klassevariabler
    private int age = -1; //Variabel deklareres og initialiseres. Access modifier sat til private
    private String name = "NONAME"; //Variabel deklareres og initialiseres. Access modifier sat til private
    private char gender = 0; //Variabel deklareres og initialiseres. Access modifier sat til private
    private String adress = "NOADRESS"; //Variabel deklareres og initialiseres. Access modifier sat til private
    private int zipcode = 0000; //Variabel deklareres og initialiseres. Access modifier sat til private
    private String city = "NOCITY"; //Variabel deklareres og initialiseres. Access modifier sat til private

    //Constructors
    public Studerende() { //Default constructor
    }

    public Studerende (int age, String name) { //Constructor der tager to parametre ind
        this.age = age; //Reference til sig selv. Angiver at "age" skal være denne alder (this.age)
        this.name = name; //Reference til sig selv. Angiver at "name" skal være dette navn (this.name)
        System.out.print(name + " er " + age + " år gammel og går på datamatikerholdet. ");
    }

    public Studerende(int age, String name, char gender) { //Constructor der tager tre parametre ind
        this.age = age; //Reference til sig selv. Angiver at "age" skal være denne alder (this.age)
        this.name = name; //Reference til sig selv. Angiver at "name" skal være dette navn (this.name)
        this.gender = gender; //Reference til sig selv. Angiver at "gender" skal være kønnet her (this.gender)
        System.out.print(name + " (" + gender + ") er " + age + " år gammel og går på datamatikerholdet. ");
    }

    //Metoder
    public void setAdress(String adress) { //Setter der tager et argument ind
        this.adress = adress; //Reference til sig selv
    }

    public void getAdress() { //Getter der ikke tager parametre ind, men som heller ikke returnerer noget
        String adressString = this.name + " bor på " + this.adress + ", ";
        System.out.print(adressString); //I stedet for at returnere adressen, laver jeg "adressString" og udskriver den
    }

    public void setZipcode(int zipcode) { //Setter der tager et argument ind
        this.zipcode = zipcode; //Reference til sig selv
    }

    public int getZipcode() { //Getter der ikke tager parametre ind, men returnerer variablen "zipcode"
        return zipcode; //Her er modsat "getAdress" ikke defineret nogen String til udprintning. Bare for adspredelse.
    }

    public void setCity(String city) { //Setter der tager et argument ind
        this.city = city; //Reference til sig selv
    }

    public String getCity() { //Getter der ikke tager parametre ind, men returnerer variablen "city"
        return city; //Lige som med "getZipcode" returneres værdien af setteren. Just showing skills :)
    }

}
