public class Square extends Rectangle {

  public Square() {
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public Square(Point o, double side, String color, boolean filled) {
    super(o, side, side, color, filled);
  }

  public double getSide() {
    return super.width;
  }

  public void setSide(double side) {
    super.width = side;
    super.length = side;
  }

  public void setLength(double side) {
    super.setLength(side);
  }

  public void setWidth(double side) {
    super.setWidth(side);
  }

  @Override
  public String toString() {
    return "Square[" + "topLeft=" + super.topLeft.toString() + ",side=" + super.width
        + ",color=" + super.color + ",filled=" + super.filled + "]";
  }

  @Override
  public double getArea() {
    return super.getArea();
  }

  public boolean equals(Object o) {
    return super.equals(o);
  }

}
