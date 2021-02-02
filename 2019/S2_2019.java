// Problem name: Pretty Average Primes
// Written by: Arnav Pal
// Overtime on DMOJ (6/15): Needs Work
import java.util.*;
public class S2_2019 {
  public static boolean checker(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
  public static int[] finder (int n) {
    int [] f = new int [2];
    int lp = n;
    int rp = n;
    while (true) {
      if (checker(rp) && checker(lp)) {
        f[0] = lp;
        f[1] = rp;
        return f;
      }
      rp++;
      lp--;
    }
  }
  public static void main(String[] args) {
    ArrayList<Integer>answer = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int n = 0;
    int u = in.nextInt();
    for (int i = 1; i <= u; i++) {
      n = in.nextInt();
      int [] ans = finder(n);
      answer.add(ans[0]);
      answer.add(ans[1]);
      //System.out.println(ans[0] + " " + ans[1]);
      //in.nextLine();
      }
      for (int i = 0; i < answer.size(); i+=2) {
        System.out.println(answer.get(i) + " " + answer.get(i+1));
      }


      //System.out.println(answer);
      //int [] ans = finder(n);
      //System.out.println(ans[0] + " " + ans[1]);
    }

} 