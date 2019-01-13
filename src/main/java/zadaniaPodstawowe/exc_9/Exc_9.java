package zadaniaPodstawowe.exc_9;

import java.util.Scanner;

/**
 * Przygotuj program, który pobierze od użytkownika temperaturę w o C a następnie
 * zamieni ją na temperaturę w o F
 */

public class Exc_9 {
  public static void main(String[] args) {

    double tempC = 0;
    boolean result = false;
    while (!result) {
      try {
        System.out.print("Podaj liczbę stopni Celciusza: ");
        Scanner scanner = new Scanner(System.in);
        tempC = scanner.nextDouble();
        result = true;
      } catch (Exception e) {
        System.out.println("Nie podałeś wartości liczbowej");
      }
    }
    System.out.println(tempC + " stopni Celciusza to: " + ConverterTempCtoTempF.converterTempCtempF(tempC) + " stopni Farenheita");
  }
}
