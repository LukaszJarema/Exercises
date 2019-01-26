package zadania01.kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utwórz listę ArrayList przechowującą liczby całkowite.
 * a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
 * b. Wyświetl pierwszy element zapisany w liście.
 * c. Wyświetl ostatni element zapisany w liście
 */

public class Exc_2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    //a.
    for (int i = 0; i < 3; i++) {
      System.out.print("Dodaj " + (i+1) + " liczbę: ");
      Scanner scanner = new Scanner(System.in);
      list.add(scanner.nextInt());
    }

    //b.
    System.out.println("Pierwszy element w liście: " + list.get(0));

    //c.
    System.out.println("Ostatni element w liście: " + list.get(list.size() - 1));
  }
}
