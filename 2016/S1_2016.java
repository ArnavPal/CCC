// Problem name: Ragaman
// Written by: Arnav Pal
// Accepted by DMOJ: 15/15, 2.762s, 51.40 MB
import java.util.*;
import java.util.Arrays;
public class S1_2016 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String n1 = input.nextLine();
      String n2 = input.nextLine();
      input.close();
      List<Character>newn1 = new ArrayList<>();
      List<Character>newn2 = new ArrayList<>();
      int counter = 0;
      for (int i = 0; i < n2.length(); i++)
      {
        newn2.add(n2.charAt(i));
      }
      for (int i = 0; i < n1.length(); i++)
      {
        newn1.add(n1.charAt(i));
      }
      if (n2.contains("*") == true)
      {
        for (int i = 0; i < newn2.size(); i++)
        {
          if (newn2.get(i) == '*')
          {
            newn2.remove(i);
            i = -1;
            counter++;
          }
        }
        for (int i = 0; i < newn1.size(); i++)
        {
          for (int j = 0; j < newn2.size(); j++)
          {
            if (newn1.get(i) == newn2.get(j))
            {
              newn1.remove(i);
              newn2.remove(j);
              i = 0;
              j = 0;
            }
          }
        }
        if (newn2.isEmpty() == true && counter == newn1.size())
        {
          System.out.println("A");
        }
        else
        {
          System.out.println("N");
        }
      }
      else
      {
        for (int i = 0; i < newn1.size(); i++)
        {
          for (int j = 0; j < newn2.size(); j++)
          {
            if (newn1.get(i) == newn2.get(j))
            {
              newn1.remove(i);
              newn2.remove(j);
              i = 0;
              j = -1;
            }
          }
        }
        if (newn1.isEmpty() == true && newn2.isEmpty() == true)
        {
          System.out.println("A");
        }
        else
        {
          System.out.println("N");
        }
      } 
  }
}