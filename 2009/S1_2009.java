// Problem name: Cool Numbers
// Written by: Arnav Pal
// Accepted by DMOJ: 50/50, 0.768s, 56.90 MB
import java.util.*;
public class Main {
  public static ArrayList<Integer>squares = new ArrayList<>();
  public static ArrayList<Integer>cubes = new ArrayList<>();
  public static void square(int lb, int hb) {
    int i = (int) Math.ceil(Math.sqrt(lb));
    while (i*i >= lb && i*i <= hb) {
      squares.add(i*i);
      i++;
    }
  }
  public static void cube (int lb, int hb) {
    int i = (int) Math.ceil(Math.cbrt(lb));
    while (i*i*i >= lb && i*i*i <= hb) {
      cubes.add(i*i*i);
      i++;
    }
  }
  public static int ans (int lb, int hb) {
    square(lb, hb);
    cube(lb, hb);
    int counter = 0;
    for (int i = 0; i < squares.size(); i++) {
      if (cubes.contains(squares.get(i))) counter++;
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int lb = in.nextInt();
    int hb = in.nextInt();
    in.close();
    int ans = ans(lb, hb);
    System.out.println(ans);
  }
} 