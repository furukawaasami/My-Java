public class Lesson11_01 {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    int sum = 0;
    for (int i = 0; i <= 3; i++) {
      // if (i == 3) {
      // break;
      // continue;
      // }
      sum += arr[i];
      // System.out.println(arr[i]);
      System.out.println(sum);

    }

    for (int j = 0; j <= 2; j++) {
      for (int k = 0; k <= 4; k++) {
        System.out.println(j + "_" + k);

      }
    }

  }
}
