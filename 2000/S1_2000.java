// Problem name: Slot Machines
// Written by: Arnav Pal
// Passes only 3/5 test cases on DMOJ (not sure why): 30/50, 0.805s, 56.92 MB
import java.util.*;
public class S1_2000 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numQuarters = input.nextInt();
    int machine1 = input.nextInt();
    int machine2 = input.nextInt();
    int machine3 = input.nextInt();
    int counter = 0;
    input.close();
    while(numQuarters > 0)
    {
      numQuarters--;
      machine1++;
      counter++;
      if (machine1 == 35)
      {
        numQuarters = numQuarters + 30;
        machine1 = 0;
      }
      numQuarters--;
      machine2++;
      counter++;
      if (machine2 == 100)
      {
        numQuarters = numQuarters + 60;
        machine2 = 0;
      }
      numQuarters--;
      machine3++;
      counter++;
      if (machine3 == 10)
      {
        numQuarters = numQuarters + 9; 
        machine3 = 0;
      }
    }
    System.out.println("Martha plays " + counter + " times before going broke.");
  }
}