public class SecondMaxMin {
  public static void main(String[] args) {
    int[] arr = { 20, 40, 10, 80, 100 };
    int a = SecondMax(arr);
    int b = SecondMin(arr);
    System.out.println("Second Max Element of array:- " + a);
    System.out.println("Second Min Element of array:- " + b);
  }

  public static int SecondMax(int[] arr) {
    int max = arr[0];
    int secmax = arr[1];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (secmax < arr[i] && arr[i] != max) {
        secmax = arr[i];
      }
    }
    return secmax;
  }

  public static int SecondMin(int[] arr) {
    int min = arr[0];
    int secmin = arr[1];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (secmin > arr[i] && arr[i] != min) {
        secmin = arr[i];
      }
    }
    return secmin;
  }
}
