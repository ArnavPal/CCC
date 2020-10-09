// Problem name: High Tide, Low Tide
// Written by: Arnav Pal
// Passes only some cases on DMOJ (not sure why): 9/15, 2.967s, 57.57 MB
import java.util.*;
public class S2_2017 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    ArrayList<Integer>tides = new ArrayList<>();
    ArrayList<Integer>low = new ArrayList<>();
    ArrayList<Integer>high = new ArrayList<>();
    int temp;
    for (int i = 0; i < n; i++)
    {
      int t = input.nextInt();
      tides.add(t);
    }
    input.close();
    for (int i = 0; i < tides.size(); i++)
    {
      for (int j = i + 1; j < tides.size(); j++)
      {
        if (tides.get(i) < tides.get(j))
        {
            temp = tides.get(i);
            tides.set(i,tides.get(j) );
            tides.set(j, temp);
        }
      }
    }
    for (int i = n/2; i < tides.size(); i++)
    {
      low.add(tides.get(i));
    }
    for (int i = (n/2) - 1; i > -1; i--)
    {
      high.add(tides.get(i));
    }
    for (int i = 0; i < low.size(); i++)
    {
      System.out.print(low.get(i) + " " + high.get(i) + " ");
    }
  }
}