package box;

public class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume

  int a, b, c;

  public Cuboid(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getSurface() {
    int surface = 2 * ((a * b) + (b * c) + (c * a));
    return surface;
  }

  public int getVolume() {
    int volume = a * b * c;
    return volume;
  }

  public static void main(String[] args) {
    Cuboid testCuboid = new Cuboid(2, 4, 5);
    int testSurface = testCuboid.getSurface();
    int testVolume = testCuboid.getVolume();
    System.out.println("Surface is: " + testSurface + ", volume is: " + testVolume);
  }
}
