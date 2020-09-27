// Problem name: Federal Voting Age
// Written by: Arnav Pal
// Accepted by DMOJ: 40/40, 0.545s, 55.60 MB
import java.util.*;
public class S1_2007 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    final int yearR = 2007;
    int a = input.nextInt();
    ArrayList<String> answers = new ArrayList<>();
    for (int i = 0; i < a; i++)
    {
      int year = input.nextInt();
      int month = input.nextInt();
      int day = input.nextInt();
      int result = yearR - year;
      if (result > 18)
      {
        answers.add("Yes");
      }
      else if (result == 18)
      {
        if (month < 2)
        {
          answers.add("Yes");
        }
        else if (month > 2)
        {
          answers.add("No");
        }
        else if (month == 2 && day <= 27)
        {
          answers.add("Yes");
        }
        else
        {
          answers.add("No");
        }
      }
      else
      {
        answers.add("No");
      }
    } 
    for (int i = 0; i < answers.size(); i++)
    {
      System.out.println(answers.get(i));
    }
  }
}