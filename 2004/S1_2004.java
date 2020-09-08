// Problem name: Fix
// Written by: Arnav Pal
// Accepted by DMOJ: 5/5, 0.711s, 53.80 MB
import java.util.*;
public class S1_2004 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    ArrayList<String>answer = new ArrayList<>();
    for (int a = 0; a < n; a++)
    {
      ArrayList<String>words = new ArrayList<>();
      ArrayList<String>prefix = new ArrayList<>();
      ArrayList<String>suffix = new ArrayList<>();
      int counter1 = 0;
      int counter2 = 0;
      words.add(input.nextLine());
      words.add(input.nextLine());
      words.add(input.nextLine());
      for (int i = 0; i < words.size(); i++)
      {
        for (int j = 0; j < words.get(i).length(); j++)
        {
          prefix.add(words.get(i).substring(0, j+1));
        }
      }
      for (int i = 0; i < words.size(); i++)
      {
        for (int j = words.get(i).length()-1; j > -1; j--)
        {
          suffix.add(words.get(i).substring(j, words.get(i).length()));
        }
      }
      for (int i = 0; i < words.size(); i++)
      {
        for (int j = 0; j < prefix.size(); j++)
        {
          if (words.get(i).equals(prefix.get(j)))
          {
            counter1++;
          }
        }
      }
      for (int i = 0; i < words.size(); i++)
      {
        for (int j = 0; j < suffix.size(); j++)
        {
          if (words.get(i).equals(suffix.get(j)))
          {
            counter2++;
          }
        }
      }
      counter1 = counter1 - 3;
      counter2 = counter2 - 3;
      int finalCounter = counter1 + counter2;
      if (finalCounter > 0)
      {
        answer.add("No");
      }
      else
      {
        answer.add("Yes");
      }
    }
    for (int i = 0; i < answer.size(); i++)
    {
      System.out.println(answer.get(i));
    }  
  }
}