// Problem name: English or French?
// Written by: Arnav Pal
// Accepted by DMOJ: 100/100, 1.474s, 66.72 MB
import java.util.*;
public class S1_2011 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int e = 0;
    int f = 0;
    input.nextLine();
    for (int i = 0; i < n; i++)
    {
      String s = input.nextLine();
      for (int j = 0; j < s.length(); j++)
      {
        if (s.charAt(j) == 't' || s.charAt(j) == 'T')
        {
          e++;
        }
        else if (s.charAt(j) == 's' || s.charAt(j) == 'S')
        {
          f++;
        }
      }
    }
    input.close();
    if (e > f)
    {
      System.out.println("English");
    }
    else if (f > e)
    {
      System.out.println("French");
    }
    else
    {
      System.out.println("French");
    }
  }
}