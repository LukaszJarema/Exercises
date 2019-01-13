package zadaniaPodstawowe.exc_7;

import java.util.Scanner;

/**
 * Przygotuj program, który pobierze od użytkownika długość boku kwadratu, a następnie
 * obliczy obwód kwadratu, oraz jego pole powierzchni.
 */

public class Exc_7 {
  public static void main(String[] args) {

    double sideA = 0;

    boolean result = false;

      while (!result | sideA <= 0) {
        try {
          System.out.print("Podaj długość boku kwadratu: ");
          Scanner scanner = new Scanner(System.in);
          sideA = scanner.nextDouble();
          if (sideA <= 0) {
            System.out.println("Podałeś niewłaściwą wartość");
          }
          result = true;
        } catch (Exception e) {
          System.out.println("Nie podałeś wartości liczbowej");
        }
      }

    System.out.println("Pole kwadratu wynosi: " + AreaCircuit.area(sideA));
    System.out.println("Obwód kwadratu wynosi: " + AreaCircuit.circuit(sideA));
  }
}
