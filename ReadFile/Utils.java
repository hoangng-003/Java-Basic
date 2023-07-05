import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Utils {
  public static String readContentFromFile(String path) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(path));
    String str = in.readLine();
    if (in.readLine() != null) {
      str = in.readLine();
    }
    return str;
  }

  public static void writeContentToFile(String path) throws IOException {
    FileWriter myWriter = new FileWriter(path);
    myWriter.write("Files in Java might be tricky, but it is fun enough!");
    myWriter.close();
  }

  public static void continueWriteContentToFile(String path) throws IOException {
    FileWriter fw = new FileWriter(path, true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Files in Java might be tricky, but it is fun enough!");
    bw.close();
  }

  public static File findFileByName(String folderPath, String fileName) {
    File dir = new File(folderPath);
    File file = new File(fileName);
    String[] list = dir.list();
    for (String child : list) {
      if (fileName == child) {
        file = new File(fileName);
      }
    }
    return file;
  }
}
