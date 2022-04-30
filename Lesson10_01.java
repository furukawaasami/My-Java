class Lesson10_01 {
  public static void main(String[] args) {
    int age = 20;
    // int age = 18; 条件を満たさなのでなにも表示されない

    if (age > 20) {
      System.out.println("adult");
    } else if (age == 20) {
      System.out.println("just 20 years old!");
    } else {
      System.out.println("child");
    }
  }
}