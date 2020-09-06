// Problem name: Keeping Score
// Written by: Arnav Pal
// Passes 3/4 test cases on DMOJ (not sure why): 30/40, 0.579s, 58.27 MB
import java.util.*;
public class S1_2001 {
  private static Integer diamondPointer;
  private static Integer heartPointer;
  private static Integer spadePointer;
  private static Integer acePoints = 4;
  private static Integer kingPoints = 3;
  private static Integer queenPoints = 2;
  private static Integer jackPoints = 1;
  private static Integer totalPoints = 0;
  private static Integer length1;
  private static Integer length2;
  private static Integer length3;
  private static Integer length4;
  private static Integer clubPoints = 0;
  private static Integer diamondPoints = 0;
  private static Integer heartPoints = 0;
  private static Integer spadePoints = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String hand = input.nextLine();
    input.close();
    char [] array = hand.toCharArray();
    // Finding length value from clubs to diamonds
    for (int i = 0; i < array.length; i++)
    {
      if (array[i]=='D')
      {
        diamondPointer = i;
        length1 = diamondPointer - 1;
        if (length1 == 0)
        {
          clubPoints = clubPoints + 3;
          totalPoints = totalPoints + 3;
        }
        else if (length1 == 1)
        {
          clubPoints = clubPoints + 2;
          totalPoints = totalPoints + 2;
        }
        else if (length1 == 2)
        {
          clubPoints = clubPoints + 1;
          totalPoints = totalPoints + 1;
        }
      }
    }
    System.out.print("Cards Dealt");
    System.out.printf("%30s", "Points");
    System.out.printf("%n%-10s", "Clubs");
    // Finding point value within segment 1
    for (int j = 1; j < diamondPointer; j++)
    {
      System.out.print(array[j] + " ");
      
      if (array[j] == 'A')
      {
        clubPoints = clubPoints + acePoints;
        totalPoints = totalPoints + acePoints;
      }
      else if (array[j] == 'K')
      {
        clubPoints = clubPoints + kingPoints;
        totalPoints = totalPoints + kingPoints;
      }
      else if (array[j] == 'Q')
      {
        clubPoints = clubPoints + queenPoints;
        totalPoints = totalPoints + queenPoints;
      }
      else if (array[j] == 'J')
      {
        clubPoints = clubPoints + jackPoints;
        totalPoints = totalPoints + jackPoints;
      }
    }
    System.out.printf("%2d", clubPoints);
    // Finding length value from diamonds to hearts
    for (int i = diamondPointer; i < array.length; i++)
    {
      if (array[i] == 'H')
      {
        heartPointer = i;
        length2 = heartPointer - (diamondPointer + 1);
        if (length2 == 0)
        {
          diamondPoints = diamondPoints + 3;
          totalPoints = totalPoints + 3;
        }
        else if (length2 == 1)
        {
          diamondPoints = diamondPoints + 2;
          totalPoints = totalPoints + 2;
        }
        else if (length2 == 2)
        {
          diamondPoints = diamondPoints + 1;
          totalPoints = totalPoints + 1;
        }
      }
    }
     System.out.printf("%n%-10s", "Diamonds");
    // Finding point value within segment 2
    for (int j = diamondPointer + 1; j < heartPointer; j++)
    {
      System.out.print(array[j] + " ");
      if (array[j] == 'A')
      {
        diamondPoints = diamondPoints + acePoints;
        totalPoints = totalPoints + acePoints;
      }
      else if (array[j] == 'K')
      {
        diamondPoints = diamondPoints + kingPoints;
        totalPoints = totalPoints + kingPoints;
      }
      else if (array[j] == 'Q')
      {
        diamondPoints = diamondPoints + queenPoints;
        totalPoints = totalPoints + queenPoints;
      }
      else if (array[j] == 'J')
      {
        diamondPoints = diamondPoints + jackPoints;
        totalPoints = totalPoints + jackPoints;
      } 
    }
    System.out.printf("%2d", diamondPoints);
    // Finding length value from hearts to spades
    for (int i = heartPointer; i < array.length; i++)
    {
      if (array[i] == 'S')
      {
        spadePointer = i;
        length3 = spadePointer - (heartPointer + 1);
        if (length3 == 0)
        {
          heartPoints = heartPoints + 3;
          totalPoints = totalPoints + 3;
        }
        else if (length3 == 1)
        {
          heartPoints = heartPoints + 2;
          totalPoints = totalPoints + 2;
        }
        else if (length3 == 2)
        {
          heartPoints = heartPoints + 1;
          totalPoints = totalPoints + 1;
        }
      }
    }
    System.out.printf("%n%-10s", "Hearts");
    // Finding point value within segment 3
    for (int j = heartPointer + 1; j < spadePointer; j++)
    {
      System.out.print(array[j] + " ");
      if (array[j] == 'A')
      {
        heartPoints = heartPoints + acePoints;
        totalPoints = totalPoints + acePoints;
      }
      else if (array[j] == 'K')
      {
        heartPoints = heartPoints + kingPoints;
        totalPoints = totalPoints + kingPoints;
      }
      else if (array[j] == 'Q')
      {
        heartPoints = heartPoints + queenPoints;
        totalPoints = totalPoints + queenPoints;
      }
      else if (array[j] == 'J')
      {
        heartPoints = heartPoints + jackPoints;
        totalPoints = totalPoints + jackPoints;
      } 
    }
    System.out.printf("%2d", heartPoints);
   // Finding length value from spades to end 
    length4 = array.length - spadePointer;
    if (length4 == 0)
        {
          spadePoints = spadePoints + 3;
          totalPoints = totalPoints + 3;
        }
        else if (length4 == 1)
        {
          spadePoints = spadePoints + 2;
          totalPoints = totalPoints + 2;
        }
        else if (length4 == 2)
        {
          spadePoints = spadePoints + 1;
          totalPoints = totalPoints + 1;
        }
    System.out.printf("%n%-10s", "Spades");
    // Finding point value within segment 4
    for (int j = spadePointer + 1; j < array.length; j++)
    {
      System.out.print(array[j] + " ");
      if (array[j] == 'A')
      {
        spadePoints = spadePoints + acePoints;
        totalPoints = totalPoints + acePoints;
      }
      else if (array[j] == 'K')
      {
        spadePoints = spadePoints + kingPoints;
        totalPoints = totalPoints + kingPoints;
      }
      else if (array[j] == 'Q')
      {
        spadePoints = spadePoints + queenPoints;
        totalPoints = totalPoints + queenPoints;
      }
      else if (array[j] == 'J')
      {
        spadePoints = spadePoints + jackPoints;
        totalPoints = totalPoints + jackPoints;
      } 
    }
    System.out.printf("%2d", spadePoints);
    System.out.printf("%n%s%d", "Total ", totalPoints);
  }
}
