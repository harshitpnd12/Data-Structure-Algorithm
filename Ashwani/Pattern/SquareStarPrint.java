class SquareStarPrint {
  public static void main(String[] args) {
    int k = 5;
    SquarePrint(k);
  }

  public static void SquarePrint(int k) {
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < k; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}