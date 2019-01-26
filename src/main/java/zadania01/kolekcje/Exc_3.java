package zadania01.kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
 * liczb do listy.
 * a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
 * b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
 * c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
 */

public class Exc_3 {
  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.print("Dodaj " + (i + 1) + " liczbę: ");
      list.add(scanner.nextDouble());
    }

    //a.
    System.out.println("Suma pierwszego i ostatniego elementu: " + (list.get(0) + list.get(list.size() - 1)));

    //b.
    System.out.println("Iloczyn pierwszego i ostatniego elementu: " + (list.get(0) * list.get(list.size() - 1)));

    //c.
    System.out.println("Iloraz drugiego i przedostatniego elementu: " + (list.get(1) / list.get(list.size() - 2)));
  }
}
