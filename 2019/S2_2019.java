// Problem name: Pretty Average Primes
// Written by: Arnav Pal
// Overtime on DMOJ: Needs Work
import java.util.*;
public class S2_2019 {
  private static Integer n;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    for (int i = 0; i < a; i++)
    {
      n = input.nextInt();
    }
    input.close();
    int p1 = n;
    int p2 = n;
    int counter = 0;
    ArrayList<String>bool1 = new ArrayList<>();
    ArrayList<String>bool2 = new ArrayList<>();
    while (counter == 0)
    {
      p1--;
      p2++;
      for (int i = 2; i < p1; i++)
      {
        if (p1%i != 0)
        {
          bool1.add("not divisible");
        }
        else
        {
          bool1.add("divisible");
        }
      }
      for (int i = 2; i < p2; i++)
      {
        if (p2%i != 0)
        {
          bool2.add("not divisible");
        }
        else
        {
          bool2.add("divisible");
        }
      }
      if (bool1.contains("divisible")==false && bool2.contains("divisible")==false)
      {
        counter = 1;
        break;
      }
    }
    System.out.println(p1 + " " + p2);
  }
}