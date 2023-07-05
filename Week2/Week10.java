import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Week10 {

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public static String removeComment(String content) {
    return content
        .replaceAll("//.*\n", "")
        .replaceAll("/\\*(.+)\\*/", "")
        .replaceAll("(?s)/\\*.*?\\*/", "");
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public static List<String> getAllImports(String content) {
    content = removeComment(content);

    Pattern pattern = Pattern.compile("(?<=import (?:static )?+)[^;]+");
    Matcher matcher = pattern.matcher(content);

    List<String> imports = new ArrayList<>();

    while (matcher.find()) {
      String packageName = matcher.group();
      if (packageName.endsWith("*")) {
        continue;
      }
      imports.add(packageName);
    }
    return imports;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public static List<String> getAllFunctions(String contentfile) {
    contentfile = removeComment(contentfile);
    Pattern pattern = Pattern.compile("[^*a-z]+static +[\\w<,? >\\[\\]]+\\s+(\\w+)"
        + " *\\(([^)]*)\\) *(\\{?|[^;])");
    Matcher matcher = pattern.matcher(contentfile);
    List<String> list = new ArrayList<>();
    List<String> imports = Week10.getAllImports(contentfile);
    List<String> classes = Week10.getAllClasses(contentfile);
    imports.addAll(classes);
    String idk = "getMstConnect(), getRmsConnect(), getConfig()";

    while (matcher.find()) {
      String methodName = matcher.group(1);
      if (idk.contains(methodName)) {
        continue;
      }
      String params = matcher.group(2);
      if (!params.isEmpty()) {
        params = Arrays.stream(params.split(","))
            .map(Week10::getType)
            .map(str -> getFullName(imports, str))
            .collect(Collectors.joining(","));
      }
      list.add(String.format("%s(%s)", methodName, params));
    }
    return list;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public static String getType(String definition) {
    Pattern pattern = Pattern.compile("\\s*([\\w\\[\\]<?>]+)[\\s.]+\\w+\\s*");
    Matcher matcher = pattern.matcher(definition);
    if (matcher.find()) {
      return matcher.group(1);
    } else {
      return "";
    }
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public static String getFullName(List<String> imports, String type) {
    List<String> normalImport = imports.stream().filter(str -> !str.endsWith("*"))
        .collect(Collectors.toList());
    Pattern typeMatch = Pattern.compile("\\W*([A-Z]+\\w+)\\W*");
    Matcher matcher = typeMatch.matcher(type);
    while (matcher.find()) {
      boolean founded = false;
      String group = matcher.group(1);
      for (String base : normalImport) {
        if (base.endsWith("." + group)) {
          founded = true;
          type = type.replaceAll(group, base);
        }
      }

      if (!founded) {
        type = type.replaceAll(group, String.format("java.lang.%s", group));
      }
    }
    return type;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public static List<String> getAllClasses(String content) {
    List<String> fullClasses = new ArrayList<>();
    content = removeComment(content);
    Pattern packagePattern = Pattern.compile("package + ([^;]+);");
    Matcher matcher = packagePattern.matcher(content);
    String packageName = "";
    if (matcher.find()) {
      packageName = matcher.group(1);
    }

    Pattern classPattern = Pattern.compile("\\s*(public|private)*\\s+"
        + "\\s*(static|abstract|final)*\\s*"
        + "(class|interface|enum)\\s+(\\w+)(<[\\w?\\s]>)*"
        + "\\s+((extends\\s+\\w+)"
        + "|(implements\\s+\\w+( ,\\w+)*))?\\s*\\{");
    Matcher classMatcher = classPattern.matcher(content);
    while (classMatcher.find()) {
      fullClasses.add(String.format("%s.%s", packageName, classMatcher.group(4)));
    }
    return fullClasses;
  }
}
