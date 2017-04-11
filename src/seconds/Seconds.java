package seconds;

import java.util.ArrayList;
import java.util.List;

public class Seconds {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the original list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

    ArrayList<Integer> testList = new ArrayList<>();
    testList = makeList(5);
    System.out.println(testList);
    testList = listSecondElts(testList);
    System.out.println(testList);

  }

  public static ArrayList<Integer> makeList (int listLength) {
    ArrayList<Integer> testList = new ArrayList<>();
    for (int i = 0; i < listLength; i++) {
      testList.add(i + 1);
    }
    return testList;
  }


  public static ArrayList<Integer> listSecondElts(ArrayList<Integer> inputList) {
    ArrayList<Integer> sortedList = new ArrayList<>();
    for (int i = 1; i < inputList.size(); i += 2) {
      sortedList.add(inputList.get(i));
    }
    return sortedList;
  }

}
