import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void addTest() {
        assertEquals(Solution.add(1, 1), 2);
        assertEquals(Solution.add(1, 2), 3);
        assertEquals(Solution.add(-1, 1), 0);
        assertEquals(Solution.add(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
}
