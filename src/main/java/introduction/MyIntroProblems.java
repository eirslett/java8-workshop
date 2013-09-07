package introduction;

import java.util.List;
import java.util.stream.Collectors;

public class MyIntroProblems {
    public static List<Integer> findEvenNumbers(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> computeSquareOnAllNumbers(List<Integer> numbers){
        return numbers.stream().map(n -> n*n).collect(Collectors.toList());
    }
}
