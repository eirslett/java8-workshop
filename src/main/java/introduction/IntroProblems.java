package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroProblems {
    // For hvert element i ei liste ("a", "b", "c"), skriv ut elementet.
    // Bruk "forEach"-metoden.
    public static void printElements(List<String> elements) {
        elements.forEach(e -> System.out.println(e));
    }

    // For hver person (Arne Skogen, Håkon Solstad, Halvard Knutsen), skriv ut fornavet i store bokstaver
    // Bruk bun "forEach"-metoden
    public static void printUppercaseFirstNames(List<Person> persons) {
        persons.forEach(p -> System.out.println(p.firstName.toUpperCase()));
    }

    // For hver person (Arne Skogen, Håkon Solstad, Halvard Knutsen), skriv ut fornavet i store bokstaver
    // Bruk først "stream", så "map" for å finne fornavn i store bokstaver, og så "collect"-metoden for å gjøre om til liste.
    public static List<String> getUppercaseFirstNamesUsingMap(List<Person> persons) {
        return persons
                .stream()
                .map(p -> p.firstName.toUpperCase())
                .collect(Collectors.toList());
    }

    // Fra en liste med tall (1, 2, 3, 4, 5, 6) skal man finne alle partall (2, 4, 6) og returnere denne lista.
    // Bruk først "stream", så "filter" og til slutt "collect".
    public static List<Integer> findEvenNumbers(List<Integer> numbers){
        return numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
    }

    // Fra en liste med tall skal man regne ut alle potenser (1, 2, 3) -> (1*1, 2*2, 3*3) = (1, 4, 9)
    // Denne lista skal så returneres.
    public static List<Integer> computeSquareOnAllNumbers(List<Integer> numbers){
        return numbers.stream().map(n -> n*n).collect(Collectors.toList());
    }

    // Man skal sortere personer etter etternavn.
    // (Johan Svendsen, Arne Pettersen, Silje Langeland) -> (Silje Langeland, Arne Pettersen, Johan Svendsen)
    // Tips: sort() muterer den originale listen, så hvis det ikke er ønskelig
    // må man lage en ny kopi av listen man skal sortere:
    // List<Person> listToSort = new ArrayList<>(persons);
    public static List<Person> sortByLastName(List<Person> persons){
        List<Person> listToSort = new ArrayList<>(persons);
        listToSort.sort((x,y) -> x.lastName.compareTo(y.lastName));
        return listToSort;
    }

    // En mer generell versjon av filtrering: gitt et predikat, finn alle tall i lista som matcher dette predikatet.
    // (f.eks. hvis lista er (1, 2, 3, 4, 5) og predikatet er "skal være oddetall" så blir lista (1, 3, 5)
    public static List<Integer> findSublistFromPredicate(List<Integer> numbers, Predicate<Integer> predicate){
       return numbers.stream().filter(predicate).collect(Collectors.toList());
    }

    // Returner et predikat som skal matche hvis en string ikke er tom. (Anta at den aldri vil være null)
    public static Predicate<String> makeIsNotEmptyPredicate() {
        Predicate<String> notEmptyPredicate = str -> !str.isEmpty();
        return notEmptyPredicate;
    }
}
