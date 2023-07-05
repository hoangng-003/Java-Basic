import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
  public static int arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
    int[] a = new int[10];
    return a[9];
  }

  public static String arrayIndexOutOfBoundsExTest() {
    return "Lỗi Array Index Out of Bounds";
  }

  public static Object nullPointerEx() {
    Object a = null;
    return a;
  }

  public static String nullPointerExTest() {
    return "Lỗi Null Pointer";
  }

  public static double arithmeticEx() throws ArithmeticException {
    return 5 / 0;
  }

  public static String arithmeticExTest() {
    return "Lỗi Arithmetic";
  }

  public static void fileNotFoundEx() throws FileNotFoundException {
    FileReader fr = new FileReader("gg.txt");
  }

  public static String fileNotFoundExTest() {
    return "Lỗi File Not Found";
  }

  public static void ioEx() throws IOException {
    FileReader fr = new FileReader("gg.txt");
    fr.read();
  }

  public static String ioExTest() {
    return "Lỗi IO";
  }

}
