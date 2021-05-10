import java.util.*;
public class Bruteforce {
    public int[] twoSum(int[] n, int a) {
          for (int i = 0; i < n.length; i++) {
        for (int j = i + 1; j < n.length; j++) {
            if (n[j] == a - n[i]) {
                return new int[] { i, j };
            }
        }
    }
      throw new IllegalArgumentException("No two sum solution");
    }
}