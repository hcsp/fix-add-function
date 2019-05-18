import static org.junit.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void addTest() {
        assertEquals(Solution.add(1, 1), 2);
        assertEquals(Solution.add(1, 2), 3);
        assertEquals(Solution.add(-1, 1), 0);
        assertEquals(Solution.add(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
}
