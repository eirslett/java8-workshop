package introduction;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntroProblemsTest {

    @Test
    public void printElementsTest() {
        List<String> elements = Arrays.asList("a","b","c");
        IntroProblems.printElements(elements);
    }

    @Test
    public void printPersonsWithUppercaseFirstNamesTest() {
        List<Person> persons = Arrays.asList(
                new Person("Arne", "Skogen"),
                new Person("Håkon", "Solstad"),
                new Person("Halvard", "Knutsen")
        );
        IntroProblems.printUppercaseFirstNames(persons);
    }

    @Test
    public void getUppercaseFirstNamesUsingMapTest() {
        List<Person> persons = Arrays.asList(
                new Person("Arne", "Skogen"),
                new Person("Håkon", "Solstad"),
                new Person("Halvard", "Knutsen")
        );
        List<String> result = IntroProblems.getUppercaseFirstNamesUsingMap(persons);
        assertThat(result, is(Arrays.asList("ARNE","HÅKON","HALVARD")));
    }

    @Test
    public void findEvenNumbersTest() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = IntroProblems.findEvenNumbers(numbers);
        assertThat("Should find the even numbers", result, is(Arrays.asList(2,4,6)));
    }

    @Test
    public void computeSquareOnAllNumbersTest() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = IntroProblems.computeSquareOnAllNumbers(numbers);
        assertThat("Should find the even numbers", result, is(Arrays.asList(1,4,9,16,25,36)));
    }

    @Test
    public void sortByLastNameTest() throws Exception {
        Person smith = new Person("John", "Smith");
        Person obama = new Person("Barack", "Obama");
        Person norris = new Person("Chuck", "Norris");
        List<Person> persons = Arrays.asList(
                smith,
                obama,
                norris
        );
        List<Person> sortedList = Arrays.asList(
                norris,
                obama,
                smith
        );
        List<Person> result = IntroProblems.sortByLastName(persons);
        assertThat("List should be sorted by last name", result, is(sortedList));
    }

    @Test
    public void findSublistFromPredicateTest() throws Exception {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> shouldBeOddNumber = n -> n % 2 == 1;
        List<Integer> result = IntroProblems.findSublistFromPredicate(numbers, shouldBeOddNumber);
        assertThat("Should find the odd numbers", result, is(Arrays.asList(1,3,5)));
    }

    @Test
    public void makeIsNotEmptyPredicateTest() {
        Predicate<String> notEmptyPredicate = IntroProblems.makeIsNotEmptyPredicate();
        assertThat(notEmptyPredicate.test(""), is(false));
        assertThat(notEmptyPredicate.test("hei"), is(true));
    }
}
