// Written by: Arnav Pal
// Passed all cases: 15/15

import java.util.*;
public class S2_2021 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int m = in.nextInt();
    in.nextLine();
    int n = in.nextInt();
    in.nextLine();
    int k = in.nextInt();
    in.nextLine();
    HashMap <Integer, Integer> rowHashMap = new HashMap<>();
    HashMap <Integer, Integer> columnHashMap = new HashMap<>();
    ArrayList <Integer> removeRow = new ArrayList<>();
    ArrayList <Integer> removeColumn = new ArrayList<>();
    boolean [][] canvas = new boolean [m][n];

    for (int i = 0; i < k; i++) {
      String choice = in.nextLine();
      String [] splitted = choice.split("\\s+");
      String rc = splitted[0];
      int val = Integer.parseInt(splitted[1]) - 1;

      if (rc.equals("R")) {
        if (rowHashMap.containsKey(val)) rowHashMap.put(val, rowHashMap.get(val) + 1);
        else rowHashMap.put(val, 1);
      }
      else {
        if (columnHashMap.containsKey(val)) columnHashMap.put(val, columnHashMap.get(val) + 1);
        else columnHashMap.put(val, 1);
      }
    }
    in.close();

    for (int i : rowHashMap.keySet()) if (rowHashMap.get(i) % 2 == 0) removeRow.add(i);
    for (int i : columnHashMap.keySet()) if (columnHashMap.get(i) % 2 == 0) removeColumn.add(i);
    for (int i = 0; i < removeRow.size(); i++) rowHashMap.remove(removeRow.get(i));
    for (int i = 0; i < removeColumn.size(); i++) columnHashMap.remove(removeColumn.get(i));
    for (int i : rowHashMap.keySet()) for (int j = 0; j < n; j++) canvas[i][j] = !canvas[i][j];
    for (int i : columnHashMap.keySet()) for (int j = 0; j < m; j++) canvas[j][i] = !canvas[j][i];
    
    int count = 0;
    for (int row = 0; row < canvas.length; row++) for (int col = 0; col < canvas[row].length; col++) if (canvas[row][col]) count++;

    System.out.println(count);
  }
}
