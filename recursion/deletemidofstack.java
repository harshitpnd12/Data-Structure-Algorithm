import java.util.Scanner;
import java.util.Stack;

public class deletemidofstack {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int sizeOfStack = sc.nextInt();
      Stack<Integer> myStack = new Stack<>();
      for (int i = 0; i < sizeOfStack; i++) {
        int x = sc.nextInt();
        myStack.push(x);
      }
      Solution obj = new Solution();
      obj.deleteMid(myStack, sizeOfStack);
      while (!myStack.isEmpty()) {
        System.out.println(myStack.peek() + " ");
        myStack.pop();
      }
      System.out.println();
    }

  }
}

class Solution {
  public void deleteMid(Stack<Integer> s, int sizeOfStack) {
    if (sizeOfStack <= 0) {
      return;
    }
    int mid = (sizeOfStack / 2) + 1;
    int top = s.pop();
    if (mid == 1) {
      return;
    }
    deleteMid(s, sizeOfStack - 1);
    s.push(top);
  }
}