package introduction;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class AdvancedProblemsTest {

    @Test
    public void testFindHighestNumber() throws Exception {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        Long result = AdvancedProblems.findHighestNumber(numbers);
        assertThat("Should find highest number", result, is(3L));
    }

    @Test
    public void testFindSum() throws Exception {
        List<Long> numbers = Arrays.asList(1L,2L,3L);
        Long result = AdvancedProblems.sum(numbers);
        assertThat("Should find sum", result, is(6L));
    }

    @Test
    public void getPrimesOneByOneTest() {
        List<Integer> numbers = Arrays.asList(2, 5, 7, 9, 11, 13, 15);
        List<Integer> result = AdvancedProblems.getPrimesOneByOne(numbers);
        assertThat("Should find primes", result, is(Arrays.asList(2, 5, 7, 11, 13)));
    }

    private static final List<Integer> maybePrimeNumbers =
            Arrays.asList(790743993, 790744021, 790744057, 790744091, 790744137, 790744151);

    @Test
    public void printPrimesOneByOneTest() {
        List<Integer> numbers = maybePrimeNumbers;
        AdvancedProblems.printPrimesOneByOne(numbers);
    }

    @Test
    public void printPrinesParallelTest() {
        List<Integer> numbers = maybePrimeNumbers;
        AdvancedProblems.printPrimesParallel(numbers);
    }
}
