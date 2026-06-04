public class Average {
  public static void main(String[] args) {
    int[] arr = { 45, 78, 98, 75, 85 };
    double avg = avg(arr);
    System.out.println("Average of array:- " + avg);
  }

  public static double avg(int arr[]) {
    double sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    double avg = sum / arr.length;
    return avg;
  }
}
