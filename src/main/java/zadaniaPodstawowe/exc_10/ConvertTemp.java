package zadaniaPodstawowe.exc_10;

import java.util.Scanner;

public class ConvertTemp {

  public static double cToF() {
    boolean result = false;
    double temp = 0;
    while (!result) {
      try {
        System.out.print("Ile stopni chcesz przekonwertować: ");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextDouble();
        result = true;
      } catch (Exception e) {
        System.out.println("Podałeś złą wartość");
      }
    }
    return ((temp * 1.8) + 32);
  }

  public static double fToC() {
    boolean result = false;
    double temp = 0;
    while (!result) {
      try {
        System.out.print("Ile stopni chcesz przekonwertować: ");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextDouble();
        result = true;
      } catch (Exception e) {
        System.out.println("Podałeś złą wartość");
      }
    }
    return ((temp - 32) * 5 / 9);
  }
}
