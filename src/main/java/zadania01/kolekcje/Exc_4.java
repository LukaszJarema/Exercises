package zadania01.kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utwórz listę ArrayList przechowującą imiona.
 * a. Dodaj 5 imion do listy,
 * b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
 * c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
 * zaczynając od ostatniego, a kończąc na pierwszym.
 */

public class Exc_4 {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //a.
    for (int i = 0; i < 5; i++) {
      System.out.print("Wpisz " + (i + 1) + " imię: ");
      name.add(scanner.next());
    }

    //b.
    for (int i = 0; i < name.size(); i++) {
      System.out.println((i + 1) + " imię: " + name.get(i));
    }

    //c.
    for (int i = name.size() - 1; i >= 0; i--) {
      System.out.println((i + 1) + " imię: " + name.get(i));
    }
  }
}
