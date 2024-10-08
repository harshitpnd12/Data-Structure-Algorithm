import java.util.Scanner;

class countsss {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    System.out.println(countSetBits(n));
  }

  // Function to return sum of count of set bits in the integers from 1 to n.
  public static int countSetBits(int n) {
    int i = 1;
    int count = 0;
    while (i <= n) {
      while (i > 0) {
        if ((n & 1) != 0) {
          count++;
        }
        i = i >> 1;
      }

      i++;
    }
    return count;
  }
}