public class Addition extends BinaryExpression {
  public Addition(Expression left, Expression right) {
    super(left, right);
  }

  public String toString() {
    return "(" + super.left.toString() + " + " + super.right.toString() + ")";
  }

  public double evaluate() {
    return super.left.evaluate() + super.right.evaluate();
  }
}
