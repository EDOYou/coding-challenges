package leetcode;

public class BackSpaceString {

  public boolean backspaceCompare(String s, String t) {
    StringBuilder sb1 = new StringBuilder(s);
    StringBuilder sb2 = new StringBuilder(t);

    processBackspaces(sb1);
    processBackspaces(sb2);

    return sb1.toString().equals(sb2.toString());
  }

  private void processBackspaces(StringBuilder sb) {
    int i = 0;
    while (i < sb.length()) {
      if (sb.charAt(i) == '#' && i == 0) {
        sb.delete(i, i + 1);
        i--;
      } else if (sb.charAt(i) == '#') {
        sb.delete(i - 1, i + 1);
        i -= 2;
      }
      i++;
    }
  }

  public static void main(String[] args) {
    BackSpaceString solution = new BackSpaceString();

    System.out.println(solution.backspaceCompare("ab#c", "ad#c")); // true
    System.out.println(solution.backspaceCompare("ab##", "c#d#")); // true
    System.out.println(solution.backspaceCompare("a##c", "#a#c")); // true
    System.out.println(solution.backspaceCompare("a#c", "b")); // false
    System.out.println(solution.backspaceCompare("#tp#", "tp")); // false
    System.out.println(solution.backspaceCompare("xy#z", "xzz#")); // true
  }
}
