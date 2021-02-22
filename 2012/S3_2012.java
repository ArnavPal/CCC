import java.util.*;
public class S3_2012 {
  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int R = sc.nextInt();
      if (map.containsKey(R)) map.put(R, map.get(R) + 1);
      else map.put(R, 1);
    }
    sc.close();
    int highestFrequency = -1;
    int mostFrequentElement = -1;

    for (int i : map.keySet()) {
      if (map.get(i) > highestFrequency || (map.get(i) == highestFrequency && i > mostFrequentElement)) {
        highestFrequency = map.get(i);
        mostFrequentElement = i;
      }
    }
    map.remove(mostFrequentElement);

    int secondFrequentElement = map.keySet().iterator().next();
    int secondHighestFrequency = map.get(secondFrequentElement);
    int valueDiff = 0;

    for (int i : map.keySet()) {
      if (map.get(i) > secondHighestFrequency || (map.get(i) == secondHighestFrequency && Math.abs(mostFrequentElement - i) > valueDiff)) {
        secondHighestFrequency = map.get(i);
        secondFrequentElement = i;
        valueDiff = Math.abs(mostFrequentElement - i);
      }
    }
    int ans = Math.abs(mostFrequentElement - secondFrequentElement);
    System.out.println(ans);
  }
}