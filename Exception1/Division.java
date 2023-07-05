public class Division extends BinaryExpression {
  public Division(Expression left, Expression right) {
    super(left, right);
  }

  public String toString() {
    return "(" + super.left.toString() + " / " + super.right.toString() + ")";
  }

  public static double divide(double a, double b) throws ArithmeticException {
    return a / b;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public double evaluate() {
    double value = 1;
    try {
      value = divide(super.left.evaluate(), super.right.evaluate());
    } catch (ArithmeticException e) {
      System.out.println("Lỗi chia cho 0");
    }
    return value;
  }
}
