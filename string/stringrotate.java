import java.util.*;

class stringrotate {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    @SuppressWarnings("unused")
    String s12 = sc.nextLine();
    for (int i = 0; i < t; i++) {
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();

      Solution obj = new Solution();

      @SuppressWarnings("static-access")
      boolean flag = obj.isRotated(s1, s2);

      if (flag == true)
        System.out.println("1");
      else
        System.out.println("0");

    }
  }
}

class Solution {
  public static boolean isRotated(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    if (str1.length() == 1) {
      return str1.equals(str2);
    }
    String clockwiseRotation = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);
    String antiClockwiseRotation = str1.substring(2) + str1.substring(0, 2);
    return str2.equals(clockwiseRotation) || str2.equals(antiClockwiseRotation);
  }
}