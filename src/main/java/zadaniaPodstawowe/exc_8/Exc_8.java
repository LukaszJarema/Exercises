package zadaniaPodstawowe.exc_8;

import java.util.Scanner;

/**
 * Przygotuj program, który pobierze od użytkownika długość podstawy oraz wysokość trójkąta, a
 * następnie obliczy jego pole powierzchni
 */

public class Exc_8 {
  public static void main(String[] args) {

    double height = 0;
    double base = 0;
    boolean resultBase = false;
    boolean resultHeight = false;

    while (!resultBase | base <= 0) {
      try {
        System.out.print("Podaj długość podstawy trójkąta: ");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextDouble();
        if (base <= 0) {
          System.out.println("Podałeś niewłaściwą wartość");
        }
        resultBase = true;
      } catch (Exception e) {
        System.out.println("Nie podałeś wartości liczbowej");
      }
    }

    while (!resultHeight | height <= 0)
      try {
        System.out.print("Podaj długość wysokości trójkąta: ");
        Scanner scanner1 = new Scanner(System.in);
        height = scanner1.nextDouble();
        if (height <= 0) {
          System.out.println("Podałeś niewłaściwą wartość");
        }
        resultHeight = true;
      } catch (Exception e) {
        System.out.println("Nie podałeś wartości liczbowej");
      }

    System.out.println("Pole trójkąta wynosi: " + Area.area(base, height));
  }
}
