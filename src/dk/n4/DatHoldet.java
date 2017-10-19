package dk.n4; //Angiver navn og location på min package

public class DatHoldet { //Angiver navnet og access modifier på klassen

    public void holdInfo() { //Metode hvori jeg opretter alle studerende, så jeg let kan kalde en komplet liste i main()

        // Jeg opretter herunder nogle fiktive elever som objekter i klassen "Studerende" med forskellige constructors
        Studerende stud1 = new Studerende(23,"Mads Hansen"); //Ny elev i class "Studerende" oprettes
        stud1.setAdress("Kongensgade 123"); //Kalder metoden "setAdress" og tildeler en adresse til objektet
        stud1.getAdress(); //Printer selv adressen uden jeg behøver lave SOUT pga. "adressString" i "Studerende"
        stud1.setZipcode(4700); //Kalder metoden "setZipcode" og tildeler et postnummer til objektet
        System.out.print(stud1.getZipcode() + " "); //"getZipcode" returnerer postnummer, skal sættes i SOUT for udprint
        stud1.setCity("Næstved"); //Kalder metoden "setCity" og tildeler objektet en by
        System.out.println(stud1.getCity() + "."); //"getCity" returnerer by. Skal sættes i SOUT for udprint

        Studerende stud2 = new Studerende(29,"Mathias Nielsen", 'M'); //Ny elev i class "Studerende"
        stud2.setAdress("Femøvej 3"); //Kalder metoden "setAdress" og tildeler en adresse til objektet
        stud2.getAdress(); //Printer selv adressen uden jeg behøver lave SOUT pga. "adressString" i "Studerende"
        stud2.setZipcode(2200); //Kalder metoden "setZipcode" og tildeler et postnummer til objektet
        System.out.print(stud2.getZipcode() + " "); //"getZipcode" returnerer postnummer, skal sættes i SOUT for udprint
        stud2.setCity("København"); //Kalder metoden "setCity" og tildeler objektet en by
        System.out.println(stud2.getCity() + "."); //"getCity" returnerer by. Skal sættes i SOUT for udprint

        Studerende stud3 = new Studerende(); //Ny elev i class "Studerende" oprettes ud fra default constructoren
        stud3.setAdress("Anonymvej 1"); //Kalder metoden "setAdress" og tildeler en adresse til objektet
        stud3.getAdress(); //Printer selv adressen uden jeg behøver lave SOUT pga. "adressString" i "Studerende"
        stud3.setZipcode(1234); //Kalder metoden "setZipcode" og tildeler et postnummer til objektet
        System.out.print(stud3.getZipcode() + " "); //"getZipcode" returnerer postnummer, skal sættes i SOUT for udprint
        stud3.setCity("Anonym By"); //Kalder metoden "setCity" og tildeler objektet en by
        System.out.println(stud3.getCity() + "."); //"getCity" returnerer by. Skal sættes i SOUT for udprint

        Studerende stud4 = new Studerende(19,"Louise Madsen", 'K'); //Ny elev i class "Studerende"
        stud4.setAdress("Vordingborgvej 40"); //Kalder metoden "setAdress" og tildeler en adresse til objektet
        stud4.getAdress(); //Printer selv adressen uden jeg behøver lave SOUT pga. "adressString" i "Studerende"
        stud4.setZipcode(4700); //Kalder metoden "setZipcode" og tildeler et postnummer til objektet
        System.out.print(stud4.getZipcode() + " "); //"getZipcode" returnerer postnummer, skal sættes i SOUT for udprint
        stud4.setCity("Næstved"); //Kalder metoden "setCity" og tildeler objektet en by
        System.out.println(stud4.getCity() + "."); //"getCity" returnerer by. Skal sættes i SOUT for udprint

        Studerende stud5 = new Studerende(21,"John Doe"); //Ny elev i class "Studerende" oprettes
        stud5.setAdress("Hurlumhejvej 9"); //Kalder metoden "setAdress" og tildeler en adresse til objektet
        stud5.getAdress(); //Printer selv adressen uden jeg behøver lave SOUT pga. "adressString" i "Studerende"
        stud5.setZipcode(4700); //Kalder metoden "setZipcode" og tildeler et postnummer til objektet
        System.out.print(stud5.getZipcode() + " "); //"getZipcode" returnerer postnummer, skal sættes i SOUT for udprint
        stud5.setCity("Næstved"); //Kalder metoden "setCity" og tildeler objektet en by
        System.out.println(stud5.getCity() + "."); //"getCity" returnerer by. Skal sættes i SOUT for udprint

    }

}
