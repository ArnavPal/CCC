// Written by: Arnav Pal
// Passed all cases: 15/15

import java.util.*;
public class S1_2021 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int N = in.nextInt();
    in.nextLine();
    String h = in.nextLine();
    String w = in.nextLine();
    String [] splitted1 = h.split("\\s+");
    String [] splitted2 = w.split("\\s+");
    in.close();
    ArrayList <Integer> heights = new ArrayList<>();
    ArrayList <Integer> bases = new ArrayList<>();
    double area = 0;

    for (int i = 0; i <= N; i++) heights.add(Integer.parseInt(splitted1[i]));
    for (int i = 0; i < N; i++) bases.add(Integer.parseInt(splitted2[i]));
    for (int i = 0; i < bases.size(); i++) area += ((heights.get(i) + heights.get(i + 1)) / 2.0) * bases.get(i);
    
    System.out.println(area);
  }
}
