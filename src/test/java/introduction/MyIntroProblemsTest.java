package introduction;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyIntroProblemsTest extends TestCase {
    @Test
    public void testFindEvenNumbers() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = MyIntroProblems.findEvenNumbers(numbers);
        assertThat("Should find the even numbers", result, is(Arrays.asList(2,4,6)));
    }

    @Test
    public void testComputeSquareOnAllNumbers() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = MyIntroProblems.computeSquareOnAllNumbers(numbers);
        assertThat("Should find the even numbers", result, is(Arrays.asList(1,4,9,16,25,36)));
    }

    @Test
    public void testSortByLastName() throws Exception {
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
        List<Person> result = MyIntroProblems.sortByLastName(persons);
        assertThat("List should be sorted by last name", result, is(sortedList));
    }

    @Test
    public void testFindSublistFromPredicate() throws Exception {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> result = MyIntroProblems.findSublistFromPredicate(numbers, n -> n % 2 == 1);
        assertThat("Should find the odd numbers", result, is(Arrays.asList(1,3,5)));
    }

    @Test
    public void testFindHighestNumber() throws Exception {
        List<Long> numbers = Arrays.asList(1L,2L,3L);
        Long result = MyIntroProblems.findHighestNumber(numbers);
        assertThat("Should find highest number", result, is(3L));
    }

    @Test
    public void testFindSum() throws Exception {
        List<Long> numbers = Arrays.asList(1L,2L,3L);
        Long result = MyIntroProblems.sum(numbers);
        assertThat("Should find sum", result, is(6L));
    }
}
