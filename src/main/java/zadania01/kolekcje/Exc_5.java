package zadania01.kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utwórz tablicę ArrayList przechowującą imiona
 * a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
 * liście.
 * b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
 * liście.
 */

public class Exc_5 {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //a.
    for (int i = 0; i < 5; i++) {
      System.out.print("Podaj " + (i + 1) + " imię: ");
      name.add(scanner.next());
    }

    //b.
    int i = 0;
    while (i < name.size()) {
      System.out.println("Imię " + (i + 1) + " : " + name.get(i));
      i++;
    }
  }
}
