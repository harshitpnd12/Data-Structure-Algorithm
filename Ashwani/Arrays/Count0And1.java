public class Count0And1 {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 0, 0, 0, 0, 1, 1 };
    int count1 = freqof0and1(arr);
    int count0 = arr.length - count1;
    System.out.println("The number of times 1 is:- " + count1);
    System.out.println("The number of times 0 is:- " + count0);
  }

  public static int freqof0and1(int[] arr) {
    int count1 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count1++;
      }
    }
    return count1;
  }
}
