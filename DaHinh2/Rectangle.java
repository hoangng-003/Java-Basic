public class Rectangle extends Shape {
  protected Point topLeft;
  protected double width;
  protected double length;

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
    super(color, filled);
    this.topLeft = topLeft;
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getArea() {
    return width * length;
  }

  public double getPerimeter() {
    return 2 * (width + length);
  }

  public Point getTopLeft() {
    return this.topLeft;
  }

  public void setTopLeft(Point topLeft) {
    this.topLeft = topLeft;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Rectangle)) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return topLeft.equals(rectangle.getTopLeft())
        && width == rectangle.getWidth() && length == rectangle.getLength();
  }

  // public int hashCode() {
  // return Objects.hash(topLeft, width, length);
  // }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public String toString() {
    return "Rectangle[" + "topLeft=" + topLeft.toString()
        + ",width=" + width + ",length=" + length
        + ",color=" + super.color + ",filled=" + super.filled + "]";
  }

}
