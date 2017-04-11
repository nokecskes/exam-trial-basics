package pirates;

import java.util.*;

public class PirateCounter {

  static class Pirate {

    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold

    ArrayList<String> sortedPirates = new ArrayList<>();
    sortedPirates = sortPirates(pirates);
    System.out.println(sortedPirates);
  }

  public static ArrayList<String> sortPirates(ArrayList<Pirate> pirates) {
    ArrayList<String> sortedPirates = new ArrayList<>();
    for (Pirate pirate : pirates) {
      if (pirate.hasWoodenLeg == true && pirate.gold > 15) {
        sortedPirates.add(pirate.name);
      }
    }
    return sortedPirates;
  }
}
