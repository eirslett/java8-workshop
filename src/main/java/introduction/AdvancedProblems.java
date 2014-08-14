package introduction;

import java.util.List;
import java.util.stream.Collectors;

public final class AdvancedProblems {
    // I en liste med tall, finn det høyeste tallet. (Bruk "reduce"-metoden)
    public static Long findHighestNumber(List<Long> numbers){
        return null;
    }

    // Finn summen av en liste med tall. (Bruk "reduce"-metoden)
    public static Long sum(List<Long> numbers){
        return null;
    }

    // Lag en timed-funksjon. Denne skal fungere sånn:
    // Den tar inn en funksjon som skal kjøres. Før funksjonen kjøres, så sjekker vi klokka,
    // så kjører vi funksjonen, etter at funksjonen har kjørt så sjekker vi klokka på nytt.
    // Etter at den er ferdig å kjøre, skal den skrive ut hvor lang tid det tok i millisekunder:
    // timed("Gjøre ting som tar lang tid", () -> doStuffThatTakesALongTime());
    // Resultat: "Gjøre ting som tar lang tid: Det tok 1200 ms å kjøre."
    private static void timed(String description, Runnable task) {

    }

    // Returner liste med alle primtall (bruk "isPrime"-metoden til hjelp).
    // F.eks. (2, 5, 7, 9, 11, 13, 15) -> (2, 5, 7, 11, 13)
    // Du skal bruke timed-funksjonen som du lagde i stad.
    public static List<Integer> getPrimesOneByOne(List<Integer> numbers) {
        return null;
    }

    // Returner liste med alle primtall, slik som i forrige oppgave.
    // Dette skal gjøres i parallell (bruk "parallelStream"-metoden), for at det skal gå raskere.
    public static List<Integer> getPrimesParallel(List<Integer> numbers) {
        return null;
    }

    // Bruk getPrimesOneByOne-metoden til å skrive ut alle partall fra ei liste.
    // Du skal bruke timed-metoden for å måle hvor lang tid det tok.
    // (bruk beskrivelse "Primtall en og en" i timeren)
    public static void printPrimesOneByOne(List<Integer> numbers) {

    }

    // Bruk getPrimesParallel-metoden til å skrive ut alle partall fra ei liste.
    // Du skal bruke timed-metoden for å måle hvor lang tid det tok.
    // Sjekk at det går raskere å kjøre i parallell!
    // (bruk beskrivelse "Primtall i parallell" i timeren)
    public static void printPrimesParallel(List<Integer> numbers) {

    }

    private static boolean isPrime(Integer n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
