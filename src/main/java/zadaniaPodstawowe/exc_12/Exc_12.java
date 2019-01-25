package zadaniaPodstawowe.exc_12;

import java.util.Scanner;

/**
 * Zmodyfikuj program z poprzedniego zadania, tak aby poprosił użytkownika o podanie
 * ilości liczb jakie chce wprowadzić do obliczenia średniej arytmetycznej.
 */

public class Exc_12 {
  public static void main(String[] args) {

    double sum = 0;
    System.out.print("Podaj ile liczb chcesz wprowadzić: ");
    Scanner scanner = new Scanner(System.in);
    int counter = scanner.nextInt();

    for (int i = 0; i < counter; i++) {
      System.out.print("Podaj " + (i+1) + " liczbę: ");
      double number = scanner.nextDouble();
      sum += number;
    }

    System.out.println("Średnia podanych liczb wynosi: " + (sum / counter));
    
  }
}
