package zadaniaPodstawowe.exc_10;

import java.util.Scanner;

/**
 * Dodaj do poprzedniego zadania możliwość wyboru czy chcesz wykonać konwersję
 * o C=> o F czy o F => o C
 */

public class Exc_10 {
  public static void main(String[] args) {

    boolean result = false;

    System.out.println("Jeśli chcesz dokonać konwersji temperatury z C do F wybierz 1");
    System.out.println("Jeśli chcesz dokonać konwersji temperatury z F do C wybierz 2 \n");
    System.out.print("Wybieram: ");

    Scanner scanner = new Scanner(System.in);
    int convert;

    do {
      convert = scanner.nextInt();
      if (convert == 1) {
        System.out.println("Podana ilość to: " + ConvertTemp.cToF() + " stopni Farenheita");
        result = true;

      } else if (convert == 2) {
        System.out.println("Podana ilość to: " + ConvertTemp.fToC() + " stopni Celciusza");
        result = true;

      } else {
        System.out.println("Podałeś złą wartość podaj ją jeszce raz: ");
      }

    } while (!result);
  }
}
