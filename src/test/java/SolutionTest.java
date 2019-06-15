import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void addTest() {
        Assertions.assertEquals(Solution.add(1, 1), 2);
        Assertions.assertEquals(Solution.add(1, 2), 3);
        Assertions.assertEquals(Solution.add(-1, 1), 0);
        Assertions.assertEquals(Solution.add(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
}
