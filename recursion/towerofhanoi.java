import java.util.Scanner;

public class towerofhanoi {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Hanoi obj = new Hanoi();
      int n;
      n = sc.nextInt();

      System.out.println(obj.toh(n, 1, 3, 2));
    }
  }
}

// n (number of discs), from (The rod number from which we move the disc), to
// (The rod number to which we move the disc), aux (The rod that is used as an
// auxiliary rod)

// n = 2
// Output:
// move disk 1
// from rod 1
// to rod 2
// move disk 2
// from rod 1
// to rod 3
// move disk 1
// from rod 2
// to rod 3 3

class Hanoi {

  public long toh(int n, int from, int to, int aux) {
    if (n == 1) {
      System.out.println("move disk 1 from rod " + from + " to rod " + to);
      return 1;
    }
    long count = toh(n - 1, from, aux, to);
    System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
    count += 1;
    count += toh(n - 1, aux, to, from);

    return count;
  }
}