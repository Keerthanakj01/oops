public class Throws {
  public static int divide(int a, int b) throws ArithmeticException {
      return a / b;
  }

  public static void main(String[] args) {
      try {
          System.out.println(divide(10, 0));
      } catch (ArithmeticException e) {
          System.out.println(e.getMessage());
      }
  }
}