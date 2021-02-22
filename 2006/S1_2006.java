import java.util.*;
public class S1_2006 {
  public static StringBuilder reformat (String t) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < t.length(); i+=2) {
      char t1 = t.charAt(i);
      char t2 = t.charAt(i+1);

      if (t1 == t2) {
        if (Character.toLowerCase(t1) == t1) {
          str.append(t1);
        }
        else {
          str.append(Character.toUpperCase(t1));
        }
      }
      else {
        str.append(Character.toUpperCase(t1));
      }
    }
    return str;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String m = sc.nextLine();
    String d = sc.nextLine();
    int x = sc.nextInt();
    sc.nextLine();
    m = reformat(m).toString();
    d = reformat(d).toString();
    ArrayList<String> answers = new ArrayList<>();

    for (int i = 0; i < x; i++) {
      String c = sc.nextLine();
      boolean child = true;
      for (int j = 0; j < c.length(); j++) {
        if (c.charAt(j) != m.charAt(j) && c.charAt(j) != d.charAt(j)) {
          child = false;
          break;
        }
      }
      if (child) answers.add("Possible baby.");
      else answers.add("Not their baby!");
    }
    for (int i = 0; i < answers.size(); i++) {
      System.out.println(answers.get(i));
    }
    sc.close();
  }
}