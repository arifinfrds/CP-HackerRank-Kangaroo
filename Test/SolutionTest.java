import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

  @Test
  public void Test_SolutionSampleInput0() {

    String actualResult = Solution.kangaroo(0, 3, 4, 2);
    String expectedResult = "YES";

    Assert.assertSame(expectedResult, actualResult);
  }

  @Test
  public void Test_SolutionSampleInput1() {

    String actualResult = Solution.kangaroo(0, 2, 5, 3);
    String expectedResult = "NO";

    Assert.assertSame(expectedResult, actualResult);
  }

}
