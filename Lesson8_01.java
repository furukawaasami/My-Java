class Lesson8_01 {
  public static void main(String[] args) {
    String[] arr;
    arr = new String[3];
    arr[0] = "Nana";
    arr[1] = "Asami";
    arr[2] = "Nako";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // まとめて記入もできる↓

    String[] arr_01 = { "Nana", "Asami", "Nako" };

    arr_01[1] = "edit Asami";

    System.out.println(arr_01[0]);
    System.out.println(arr_01[1]);
    System.out.println(arr_01[2]);

    String[][] arr_02;
    arr_02 = new String[2][2];

    arr_02[0][0] = "Tony";
    arr_02[0][1] = "Anton";
    arr_02[1][0] = "George";
    arr_02[1][1] = "Henry";

    System.out.println(arr_02[0][0]);
    System.out.println(arr_02[0][1]);
    System.out.println(arr_02[1][0]);
    System.out.println(arr_02[1][1]);

    // 省略できる！
    String[][] arr_03 = { { "Tony", "Anton" }, { "George", "Henry" } };
    System.out.println(arr_03[0][0]);
    System.out.println(arr_03[0][1]);
    System.out.println(arr_03[1][0]);
    System.out.println(arr_03[1][1]);

  }
}