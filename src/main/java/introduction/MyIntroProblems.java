package introduction;

import work.FactorNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyIntroProblems {
    public static List<Integer> findEvenNumbers(List<Integer> numbers){
        return numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> computeSquareOnAllNumbers(List<Integer> numbers){
        return numbers
                .stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // Tips: sort() muterer den originale listen, så hvis det ikke er ønskelig
    // må man lage en ny kopi av listen man skal sortere:
    // List<Person> listToSort = new ArrayList<>(persons);
    public static List<Person> sortByLastName(List<Person> persons){
        List<Person> sortedList = new ArrayList<>(persons);
        sortedList.sort((person1, person2) -> person1.lastName.compareTo(person2.lastName));
        return sortedList;
    }

    public static List<Integer> findSublistFromPredicate(List<Integer> numbers, Predicate<Integer> predicate){
        return numbers.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static Long findHighestNumber(List<Long> numbers){
        return numbers
                .stream()
                .reduce(Long.MIN_VALUE, Long::max);
    }

    public static Long sum(List<Long> numbers){
        return numbers
                .stream()
                .reduce(0L, Long::sum);
    }

    public static Long findSumOfAllMaxFactors(List<FactorNumber> numbers){
        return sum(numbers
                .stream()
                .map(FactorNumber::perform)
                .map(MyIntroProblems::findHighestNumber)
                .collect(Collectors.toList())
        );
    }
}
