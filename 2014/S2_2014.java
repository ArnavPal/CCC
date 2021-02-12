import java.util.*;
public class S2_2014 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    ArrayList<String>students = new ArrayList<>();
    ArrayList<String>rstudents = new ArrayList<>();
    int counter = 0;
    int i = 0;

    for (int j = 0; j < n; j++)
      {
        String s = input.next();
        students.add(s);
      }
      input.nextLine();
      for (int j = 0; j < n; j++)
      {
        String s = input.next();
        rstudents.add(s);
      }
      input.close();

    if (n%2 != 0)
    {
      System.out.println("bad");
    }
    else 
    {
      while (i < rstudents.size())
      {
        int a = students.indexOf(rstudents.get(i));
        if (a%2 != 0)
        {
          if (rstudents.get(i+1).equals(students.get(a-1)))
          {
            counter++;
          }
          i+=2;
        }
        else
        {
          if (rstudents.get(i+1).equals(students.get(a+1)))
          {
            counter++;
          }
          i+=2;
        }
      }
      if (counter == n/2)
      {
        System.out.println("good");
      }
      else
      {
        System.out.println("bad");
      }
    } 
  }
}
