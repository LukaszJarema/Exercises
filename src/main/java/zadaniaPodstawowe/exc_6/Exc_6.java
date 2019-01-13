package zadaniaPodstawowe.exc_6;

import java.util.Scanner;

/**
 * Przygotuj program, który sprawdzi czy wprowadzona przez użytkownika liczba jest
 * parzysta. Wyświetl odpowiedni komunikat w zależności od tego czy liczba jest parzysta
 * czy nieparzysta Skorzystaj z instrukcji warunkowej if oraz operatora modulo %
 */

public class Exc_6 {
  public static void main(String[] args) {

    int integer = 0;
    boolean result = false;

    while (!result)
      try {
        System.out.print("Podaj liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        integer = scanner.nextInt();
        result = true;
      } catch (Exception e) {
        System.out.println("Nie podałeś liczby całkowitej");
      }

    if (integer % 2 == 0) {
      System.out.println("Liczba jest parzysta");
    }
    System.out.println("Liczba nie jest parzysta");
  }
}
