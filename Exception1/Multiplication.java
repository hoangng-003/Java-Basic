public class Multiplication extends BinaryExpression {
  public Multiplication(Expression left, Expression right) {
    super(left, right);
  }

  public String toString() {
    return "(" + super.left.toString() + " * " + super.right.toString() + ")";

  }

  public double evaluate() {
    return super.left.evaluate() * super.right.evaluate();
  }
}
