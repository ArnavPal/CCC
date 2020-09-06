// Problem name: Don't pass me the ball!
// Written by: Arnav Pal
// Accepted by DMOJ: 50/50, 0.695s, 57.51 MB
import java.util.*;
public class S1_2012 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int j = input.nextInt();
    input.close();
    int ans = (j-1)*(j-2)*(j-3)/6;
    System.out.println(ans);
  }
}