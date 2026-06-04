public class StringPalindrome {
  public static void main(String[] args) {
    String str = "abba";
    if (isPalindrome(str)) {
      System.out.println("The Given String is Palindrome");
    } else {
      System.out.println("The Given String is not Palindrome");
    }
  }

  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
