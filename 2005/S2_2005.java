import java.util.*;
import java.io.*;
public class S2_2005 {
  public static int x = 0;
  public static int y = 0;
  public static void solver (ArrayList<Integer>things, int c, int r, int i, boolean b) {
    boolean changedx = false;
    boolean changedy = false;
    if (things.get(i) + x > c) {
      x = c; 
      changedx = true;
      b = false;
    }
    if (things.get(i) + x < 0) {
      x = 0;
      changedx = true;
      b = false;
    }
    if (things.get(i+1) + y > r) {
      y = r;
      changedy = true;
      b = false;
    } 
    if (things.get(i+1) + y < 0) {
      y = 0;
      changedy = true;
      b = false;
    }
    if (changedx && !changedy) {
      y += things.get(i+1);
      b = false;
    }
    if (changedy  && !changedx) {
      x += things.get(i);
      b = false;
    }
    if (b) {
      x += things.get(i);
      y += things.get(i+1);
    }
    things.remove(0);
    things.remove(0);
  }
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    ArrayList<String>pairs = new ArrayList<>();
    ArrayList<Integer>things = new ArrayList<>();
    while (true) {
      String s = in.nextLine();
      pairs.add(s);
      if (s.equals("0 0")) break;
    }
    in.close();
    for (int i = 0; i < pairs.size(); i++) {
      String[] splitted = pairs.get(i).split("\\s+");
      int x2 = Integer.parseInt(splitted[0]);
      int y2 = Integer.parseInt(splitted[1]);
      things.add(x2);
      things.add(y2);
    }
    System.out.println();
    int c = things.get(0);
    int r = things.get(1);
    things.remove(0);
    things.remove(0);
    int i = 0;
    while (things.size() != 0) {
      boolean b = true;
      if (i == things.size() - 4) {
        solver(things, c, r, i, b);
        System.out.println(x + " " + y);
        break;
      } else {
        solver(things, c, r, i, b);
        System.out.println(x + " " + y);
      }
    }
  }
}
