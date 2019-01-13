package zadaniaPodstawowe.exc_2;

import java.util.Scanner;

/**
 * Zadeklaruj i zainicjalizuj 5 elementową tablicę przechowującą łańcuchy znaków
 * (String). Dodaj do każdego elementu tablicy jedno dowolne imię a następnie wyświetl
 * kolejno wszystkie imiona z tablicy.
 */

public class Exc_2 {
  public static void main(String[] args) {

    String[] name = new String[5];

    System.out.println("Musisz podać 5 imion");

    for (int i = 0; i < name.length; i++) {
      System.out.print("Podaj " + (i + 1) + " imię: ");
      Scanner scanner = new Scanner(System.in);
      name[i] = scanner.next();
    }

    for (int i = 0; i < name.length; i++) {
      System.out.println((i + 1) + " imię: " + name[i]);
    }
  }
}
