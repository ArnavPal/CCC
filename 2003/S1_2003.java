// Problem name: Snakes and Ladders
// Written by: Arnav Pal
// Accepted by DMOJ: 100/100, 0.299s, 54.86 MB 
import java.util.Scanner;
public class S1_2003 {
  public static void main(String[] args) {
    int pointer = 1;
    Scanner input = new Scanner(System.in);
    while (true)
    {
      int dice = input.nextInt();
      if (dice == 0)
      {
        System.out.println("You Quit!");
        System.exit(0);
      }
      else
      {
        pointer  = pointer + dice;
        if (pointer == 9)
        {
          pointer = 34;
        }
        else if (pointer == 40)
        {
          pointer = 64;
        }
        else if (pointer == 67)
        {
          pointer = 86;
        }
        else if (pointer > 100)
        {
          pointer = pointer - dice;
        }
        else if (pointer == 54)
        {
          pointer = 19;
        }
        else if (pointer == 90)
        {
          pointer = 48;
        }
        else if (pointer == 99)
        {
          pointer  = 77;
        }
        System.out.println("You are now on square " + pointer);
        if (pointer == 100)
        {
          System.out.println("You Win!");
          System.exit(0);       
        }
      }
    }    
  }  
}