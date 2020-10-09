// Problem name: Multiple Choice 
// Written by: Arnav Pal
// Accepted by DMOJ: 100/100, 0.877s, 65.39 MB
import java.util.*;
public class S2_2011 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    input.nextLine();
    ArrayList<String>t = new ArrayList<>();
    ArrayList<String>s = new ArrayList<>();
    int counter = 0;
    for (int i = 0; i < n; i++)
    {
      String tans = input.nextLine();
      t.add(tans);
    }
    for (int i = n-1; i < n*2-1; i++)
    {
      String sans = input.nextLine();
      s.add(sans);
    }
    for (int i = 0; i < t.size(); i++)
    {
      if (t.get(i).equals(s.get(i)))
      {
        counter++;
      }
    }
    if (counter > 0)
    {
      System.out.println(counter);
    }
    else
    {
      System.out.println("0");
    }
  }
}