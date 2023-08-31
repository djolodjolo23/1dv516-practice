import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int [] array = {24, 36, 48, 5};

    System.out.println(getFactors(array));

  }
  public static List<List<Integer>> getFactors(int[] arr) {
    List<List<Integer>> outerList = new ArrayList<>();
    for (int num : arr) {
      int primeNum = 2;
      List<Integer> factors = new ArrayList<>();
      while (num % primeNum != 0) {
        primeNum += 1;
      }
      int powerCount = 0;
      while (num % primeNum == 0) {
        num /= primeNum;
        powerCount += 1;
        // need to check when to raise the num to +1
        if (num % primeNum == 1) {
          primeNum += 1;
          factors.add(powerCount);
          powerCount = 0;
        }
        if (num == 1) {
          factors.add(powerCount);
          outerList.add(factors);
          break;
        }
      }
    }

    return outerList;
  }
}
