public class Main {

  // Complete the kangaroo function below.
  static String kangaroo(int x1, int v1, int x2, int v2) {
    if (v2 > v1 && x2 > x1) {
      return "NO";
    }

    if ((v1 == v2) && !(x1 != x2)) {
      return "NO";
    }

    boolean isAtTheSamePlace = false;

    int currentX1 = x1;
    int currentX2 = x2;
    int i = 0;
    while (!isAtTheSamePlace) {
      currentX1 += v1;
      currentX2 += v2;
      i++;

      int loopLimit = 1999999999;
      if (currentX1 == loopLimit || currentX2 == loopLimit) {
        return "NO";
      }

      if (currentX1 == currentX2) {
        return "YES";
      }

    }
    return "NO";
  }

  static String kangaroo2(int x1, int v1, int x2, int v2) {
    if (v2 > v1 && x2 > x1) {
      return "NO";
    }
    int currentX1 = x1;
    int currentX2 = x2;

    int difference = Math.abs(currentX1 - currentX2);
    while (difference != 0) {
      currentX1 += v1;
      currentX2 += v2;

      difference = Math.abs(currentX1 - currentX2);
    }

    if (difference == 0) {
      return "YES";
    }
    return "NO";

  }

  static String kangaroo3(int x1, int v1, int x2, int v2) {
    if ((x2 > x1) && (v2 > v1)) {
      return "NO";
    }
    if ((x1 - x2) % (v2 - v1) == 0) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) {
    System.out.println(kangaroo3(21, 6, 47, 3));
  }

}
