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
}
