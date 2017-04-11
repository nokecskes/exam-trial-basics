package countas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountAs {

  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result

    String filename = askUserInput();
    int aCounter = 0;

    try {
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
      aCounter = countAs(lines);
    } catch (Exception e) {
      System.out.println("0");
    }

    System.out.println(aCounter);


  }

  public static String askUserInput() {
    System.out.println("Please give me the name of the file you want to use: ");
    Scanner scanner = new Scanner(System.in);
    String filename = scanner.nextLine();
    return filename;
  }

  public static int countAs(List<String> text) {
    HashMap<String, Integer> aCounter = new HashMap<>();
    aCounter.put("a", 0);

    for (String line : text) {
      for (int i = 0; i < line.length(); i++) {
        if (line.charAt(i) == 'a') {
          aCounter.put("a", aCounter.get("a") + 1);
        }
      }
    }

    return aCounter.get("a");
  }


}
