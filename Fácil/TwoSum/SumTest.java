import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SumTest {
    @Test
    public void testTwoSum() {
        int[] nums = {2, 4, 7, 3};
        int target = 9;
        int[] expected = {0, 2};
        Sum s = new Sum();
        int[] result = s.twoSum(nums, target);  
        assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 9;
        int[] expected = {};
        Sum s = new Sum();
        int[] result = s.twoSum(nums, target);  
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 3, 2};
        int target = 9;
        int[] expected = {};
        Sum s = new Sum();
        int[] result = s.twoSum(nums, target);  
        assertArrayEquals(expected, result);
    }
}

