class Student{
  String name = "Damian";
  public void calculateAvg(int math,int english){
    System.out.println((math + english)/2);
  }
}

public class Lesson13_01 {
  public static void main(String[] args){
    Student a001 = new Student();
    a001.name = "Damian";

    System.out.println(a001.name);
  }

}
