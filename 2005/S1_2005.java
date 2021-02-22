import java.util.*;
public class S1_2005 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int t = sc.nextInt();
    ArrayList<StringBuffer> answers = new ArrayList<>();
    sc.nextLine();

    for (int i = 0; i < t; i++) {
      String tel = sc.nextLine();
      tel = tel.replaceAll("-", "");

      for (int j = 0; j < tel.length(); j++) {
        char l = tel.charAt(j);
        if (l == 'A' || l == 'B' || l == 'C') tel = tel.replace(l, '2');
        else if (l == 'D' || l == 'E' || l == 'F') tel = tel.replace(l, '3');
        else if (l == 'G' || l == 'H' || l == 'I') tel = tel.replace(l, '4');
        else if (l == 'J' || l == 'K' || l == 'L') tel = tel.replace(l, '5');
        else if (l == 'M' || l == 'N' || l == 'O') tel = tel.replace(l, '6');
        else if (l == 'P' || l == 'Q' || l == 'R' || l == 'S') tel = tel.replace(l, '7');
        else if (l == 'T' || l == 'U' || l == 'V') tel = tel.replace(l, '8');
        else if (l == 'W' || l == 'X' || l == 'Y' || l == 'Z') tel = tel.replace(l, '9');
      }
      tel = tel.substring(0, 10);
      StringBuffer str = new StringBuffer(tel);
      str.insert(3, '-');
      str.insert(7, '-');
      answers.add(str);
    }
    for (int i = 0; i < answers.size(); i++) {
      System.out.println(answers.get(i));
    }
    sc.close();
  }
}