
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void addTest() {
        org.junit.jupiter.api.Assertions.assertEquals(Solution.add(1, 1), 2);
org.junit.jupiter.api.Assertions.assertEquals(Solution.add(1, 2), 3);
org.junit.jupiter.api.Assertions.assertEquals(Solution.add(-1, 1), 0);
org.junit.jupiter.api.Assertions.assertEquals(Solution.add(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);

    }
}