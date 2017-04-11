package random_number;

public class randomNumberGenerator {

  public static void main(String[] args) {

    int randomNumber = 0;

    for (int i = 0; i < 5 ; i++) {
      randomNumber = generateRandomNumber(1, 50);
      System.out.println(randomNumber);
    }
  }

  public static int generateRandomNumber(int min, int max){
    int random =(int)(min + Math.random() * max);
    return random;
  }

}
