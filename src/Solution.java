public class Solution {

  // Complete the kangaroo function below.
  public static String kangaroo(int x1, int v1, int x2, int v2) {
    String result = "NO";

    if ((x1 > x2) && (v1 > v2) || (x2 > x1) && (v2 > v1)) {
      return result;
    } else {
      int xDifference = Math.abs(x1 - x2);
      int vDifference = Math.abs(v1 - v2);

      if (vDifference == 0) {
        return result;
      }

      if (xDifference % vDifference == 0) {
        result = "YES";
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(kangaroo(43, 2, 70, 2));
  }

}
