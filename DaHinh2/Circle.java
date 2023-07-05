import java.lang.Math;

public class Circle extends Shape {
  protected Point center;
  protected double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public Circle(Point center, double radius, String color, boolean filled) {
    super(color, filled);
    this.center = center;
    this.radius = radius;
  }

  public Point getCenter() {
    return this.center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String toString() {
    return "Circle[" + "center=" + center.toString() + ",radius=" + radius
        + ",color=" + super.color + ",filled=" + super.filled + "]";
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2 * Math.PI * radius;
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
    if (!(o instanceof Circle)) {
      return false;
    }
    Circle circle = (Circle) o;
    return center.equals(circle.getCenter()) && radius == circle.getRadius();
  }

  // public int hashCode() {
  // return Objects.hash(center, radius);
  // }

}
