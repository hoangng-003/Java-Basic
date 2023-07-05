public abstract class Shape {
  protected String color;
  protected boolean filled;

  public Shape() {
  }

  public Shape(boolean filled) {
    this.filled = filled;
  }

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return this.filled;
  }

  public boolean getFilled() {
    return this.filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public double getArea() {
    return 0;
  }

  public double getPerimeter() {
    return 0;
  }

  public String toString() {
    return "Shape[" + "color=" + getColor() + ",filled=" + isFilled() + "]";
  }

}
