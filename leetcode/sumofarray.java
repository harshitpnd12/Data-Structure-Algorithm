import java.util.Scanner;

public class sumofarray {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int target = sc.nextInt();
    int[] nums = new int[size];
    System.out.println("Enter " + size + " elements:");
    System.out.print("enter the sum to check");

    // Loop to take input for each element of the array
    for (int i = 0; i < size; i++) {
      nums[i] = sc.nextInt();
    }
  }
}

class Solution {
  public int[] twoSum(int[] nums, int target) {

  }
}