// Problem name: Fraction Action
// Written by: Arnav Pal
// Accepted by DMOJ: 100/100, 0.766s, 57.00 MB
import java.util.*;
public class S2_2002 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int d = input.nextInt();
     input.close();
     int rn = 1;
     int rd = 1;
     int answer;
     int counter = 0;
     int n2 = n;
     int d2 = d;
     int d3 = d;
     ArrayList<Integer>divisors1 = new ArrayList<>();
     ArrayList<Integer>divisors2 = new ArrayList<>();
     ArrayList<Integer>finalDivisors = new ArrayList<>();
     if (n%d == 0)
     {
       answer = n/d;
       System.out.println(answer);
     }
     else
     {
        while (rn < n)
        {
          rn++;
          if (n%rn==0)
          {
            divisors1.add(rn);
          }
        }
        while (rd < d)
        {
          rd++;
          if (d%rd==0)
          {
            divisors2.add(rd);
          }
        }
        for (int i = 0; i < divisors1.size(); i++)
        {
            int left = 0;
            int right = divisors2.size()-1;
            int target = divisors1.get(i);
            while (left <= right)
            {
              int middle = (left+right)/2;
              if (divisors2.get(middle) == target)
              {
                finalDivisors.add(divisors1.get(i));
                break;
              }
              else if (divisors2.get(middle) > target)
              {
                right = middle -1;
              }
              else if (divisors2.get(middle) < target)
              {
                left = middle + 1;
              }
            }
        }
        if (finalDivisors.isEmpty() == true)
        {
          if ((n/d) >= 1)
          {
            while (d3 < n2)
            {
              counter++;
              d3 = d2 * counter;
            }
            int c = counter-1;
            n = n - (c*d);
            System.out.println(c + " " + n + "/" + d);
          }
          else
          {
            System.out.println(n + "/" + d);
          }
        }
        else
        {
            int divisor = finalDivisors.get(finalDivisors.size()-1);
            n = n / divisor;
            d = d / divisor;
            if ((n/d) >= 1)
            {
              while (d3 < n2)
              {
                counter++;
                d3 = d2 * counter;
              }
              int c = counter-1;
              n = n - (c*d);
              System.out.println(c + " " + n + "/" + d);
            }
            else
            {
              System.out.println(n + "/" + d);
            }  
        } 
     }
  }
}
