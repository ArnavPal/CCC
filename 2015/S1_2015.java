// Problem name: Zero That Out
// Written by: Arnav Pal
// Accepted by DMOJ: 15/15, 5.582s, 69.52 MB
import java.util.*;
public class S1_2015 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int a = input.nextInt();
    ArrayList<Integer>list = new ArrayList<>();
    int answer = 0;
    for (int i = 0; i < a; i++)
    {
      list.add(input.nextInt());
    }
    while (list.contains(0) == true)
    {
      for (int i = 0; i < list.size(); i++)
      {
        if (list.get(i) == 0)
        {
          list.remove(i);
          list.remove(i - 1);
          i = 0;
        }
      }
    }
    if (list.isEmpty())
    {
      System.out.println("0");
    } 
    else 
    {
      for (int i = 0; i < list.size(); i++)
      {
        answer = answer + list.get(i);
      }
      System.out.println(answer);
    }
  }
}