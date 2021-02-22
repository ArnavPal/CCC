// Written by: Arnav Pal
// Scores 4/15 (TLE)

import java.util.*;
public class S3_2021 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    in.nextLine();
    ArrayList <Long> p = new ArrayList<>();
    ArrayList <Long> w = new ArrayList<>();
    ArrayList <Long> d = new ArrayList<>();
    ArrayList <Long> times = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String person = in.nextLine();
      String [] splitted = person.split("\\s+");
      p.add(Long.parseLong(splitted[0]));
      w.add(Long.parseLong(splitted[1]));
      d.add(Long.parseLong(splitted[2]));
    }
    in.close();
    if (n == 1) System.out.println("0");
    else {
      long maxPos = Collections.max(p);
      long minPos = Collections.min(p);
      for (long c = minPos; c < maxPos; c++) {
        long time = 0;
        for (int i = 0; i < p.size(); i++) {
          if (c > p.get(i)) {
            if (c - (p.get(i) + d.get(i)) > 0) time += Math.abs((p.get(i) + d.get(i)) - c)* w.get(i);
          }
          else if (c < p.get(i)) {
            if ((p.get(i) - d.get(i)) - c > 0) time += Math.abs((p.get(i) - d.get(i)) - c) * w.get(i);
          }
        }
        times.add(time);
      }
      long ans = Collections.min(times);
      System.out.println(ans);
    }
  }
}