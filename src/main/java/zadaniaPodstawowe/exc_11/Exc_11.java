package zadaniaPodstawowe.exc_11;

import java.util.Scanner;

/**
 * Przygotuj program, który oblicza średnią arytmetyczną 2 podanych liczb i wyświetla ją
 * na ekranie.
 */

public class Exc_11 {
  public static void main(String[] args) {

    boolean resultFirst = false;
    boolean resultSecond = false;
    double firstNumber = 0;
    double secondNumber = 0;
    System.out.println("Program po podaniu dwóch liczb obliczy ich średnią \n");
    while (!resultFirst) {
      try {
        System.out.print("Podaj pierwszą liczbę: ");
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextDouble();
        resultFirst = true;
      } catch (Exception e) {
        System.out.println("Nie podałeś liczby!");
      }

      while (!resultSecond) {
        try {
          System.out.print("Podaj drugą liczbę: ");
          Scanner scanner = new Scanner(System.in);
          secondNumber = scanner.nextDouble();
          resultSecond = true;
        } catch (Exception e) {
          System.out.println("Nie podałeś liczby!");
        }
      }

      System.out.println("\nŚrednia podanych liczb: " + ((firstNumber + secondNumber) /2));

    }
  }
}
