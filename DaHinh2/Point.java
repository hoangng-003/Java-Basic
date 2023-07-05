import java.lang.Math;

public class Point {
  private double pointX;
  private double pointY;

  public Point() {
  }

  public Point(double pointX, double pointY) {
    this.pointX = pointX;
    this.pointY = pointY;
  }

  public double getPointX() {
    return this.pointX;
  }

  public void setPointX(double pointX) {
    this.pointX = pointX;
  }

  public double getPointY() {
    return this.pointY;
  }

  public void setPointY(double pointY) {
    this.pointY = pointY;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public double distance(Point o) {
    double temp = (this.pointX - o.pointX) * (this.pointX - o.pointX)
        + (this.pointY - o.pointY) * (this.pointY - o.pointY);
    return Math.sqrt(temp);
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
    if (!(o instanceof Point)) {
      return false;
    }
    Point point = (Point) o;
    return pointX == point.pointX && pointY == point.pointY;
  }

  // public int hashCode() {
  // return Object.hash(pointX, pointY);
  // }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public String toString() {
    double tempX = (double) Math.round(pointX * 10) / 10;
    double tempY = (double) Math.round(pointY * 10) / 10;
    return "(" + tempX + "," + tempY + ")";
  }

}
