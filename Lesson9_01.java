public class Lesson9_01 {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;
    int z = 10;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);
    // %は剰余 割り算のあまりのこと

    System.out.println(x > y);
    System.out.println(x < y);

    System.out.println(x >= y);
    System.out.println(x <= y);
    System.out.println(x <= z);

    System.out.println(x == z);
    System.out.println(x != z);

    System.out.println(x >= 5 && x <= 10);
    System.out.println(y >= 0 && y <= 2);

    System.out.println(x == 2 || y == 2);
    System.out.println(x != 2 || y == 2);

    System.out.println(x += 2);
    System.out.println(y += 10);

    x++;
    y--;
    System.out.println(x);
    System.out.println(y);
  }
}
