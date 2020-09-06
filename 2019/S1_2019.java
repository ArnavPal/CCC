// Problem name: Flipper
// Written by: Arnav Pal
// Accepted by DMOJ: 15/15, 3.605s, 65.93 MB
import java.util.*;
public class S1_2019 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.nextLine();
    input.close();
    int [][] matrix = {
    {1, 2}, 
    {3, 4}
    };
    for (int i = 0; i < s1.length(); i++)
    {
      if (s1.charAt(i) == 'H')
      {
        int temp = matrix[0][0];
        matrix[0][0] = matrix[1][0];
        matrix[1][0] = temp;
        int temp2 = matrix[0][1];
        matrix[0][1] = matrix[1][1];
        matrix[1][1] = temp2;
      }
      else if (s1.charAt(i) == 'V')
      {
        int temp = matrix[0][0];
        matrix[0][0] = matrix[0][1];
        matrix[0][1] = temp;
        int temp2 = matrix[1][0];
        matrix[1][0] = matrix[1][1];
        matrix[1][1] = temp2;
      }
    }
    for (int r = 0; r < matrix.length; r++)
    {
      for (int c = 0; c < matrix[r].length; c++)
      {
        System.out.print(matrix[r][c] + " ");
      }
      System.out.println();
    }
  }
}