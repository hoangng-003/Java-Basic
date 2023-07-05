import java.util.List;

public class Layer {
  private List<Shape> shapes;

  public void addShape(Shape o) {
    shapes.add(o);
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public void removeCircles() {
    for (Shape child : shapes) {
      if (child instanceof Circle) {
        shapes.remove(child);
      }
    }
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public String getInfo() {
    String out = "Layer of crazy shapes:" + "\n";
    for (Shape child : shapes) {
      out += child.toString() + "\n";
    }

    return out;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public void removeDuplicates() {
    for (int i = 0; i < shapes.size(); i++) {
      for (int j = i + 1; j < shapes.size(); j++) {
        if (shapes.get(i).equals(shapes.get(j))) {
          shapes.remove(shapes.get(j));
          break;
        }
      }
    }
  }
}
