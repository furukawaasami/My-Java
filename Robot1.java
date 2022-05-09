class Robot1 {
  int currentPosition = 3;

  public static void main(String[] args) {
    Robot1 robot = new Robot1();
    robot.report();
    robot.moveForward();
    robot.report();
  }

  void report() {
    System.out.println("Current Position = " + currentPosition);
  }

  void moveForward() {
    currentPosition = currentPosition + 1;
  }
}
