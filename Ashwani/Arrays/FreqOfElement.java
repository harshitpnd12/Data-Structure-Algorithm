public class FreqOfElement {
  public static void main(String[] args) {
    int[] arr = { 1, 10, 3, 1, 22, 1, 22, 1, 1 };
    int a = freq(arr);
    System.out.println("The number of times 1 is:- " + a);
  }

  public static int freq(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count++;
      }
    }
    return count;
  }
}
