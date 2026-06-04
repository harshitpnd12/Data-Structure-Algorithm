public class FindNumber {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40 };
    int i = findnumber(arr);
    System.out.println("The number is at index:-" + i);
  }

  // Finding The number
  public static int findnumber(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 30) {
        return i;
      }
    }
    return -1;
  }
}