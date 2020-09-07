import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
public class S1_2020 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numInputs = input.nextInt();
    double [] time1 = new double [numInputs];
    double [] distance1 = new double [numInputs];

    for (int i = 0; i < numInputs; i++)
    {
      time1[i] = input.nextDouble();
      distance1[i] = input.nextDouble();
    }
    input.close();

    ArrayList<Double>time2 = new ArrayList<>();
    ArrayList<Double>distance2 = new ArrayList<>();
    ArrayList<Double>results = new ArrayList<>();
    for (int i = 0; i < time1.length; i++)
    {
      for (int j = i+1; j < time1.length; j++)
      {
        time2.add(Math.abs(time1[i] - time1[j]));
      }
    }
    for (int i = 0; i < distance1.length; i++)
    {
      for (int j = i + 1; j < distance1.length; j++)
      {
        distance2.add(Math.abs(distance1[i] - distance1[j]));
      }
    }
    for (int i = 0; i < time2.size(); i++)
    {
      results.add(distance2.get(i)/time2.get(i));
    }
    double ans = Collections.max(results);
    System.out.println(ans);
  }
}