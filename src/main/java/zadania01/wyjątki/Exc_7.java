package zadania01.wyjątki;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utwórz listę ArrayList przechowującą liczby całkowite.
 * a. Dodaj 5 liczb do listy.
 * b. Pobierz 6 element z listy.
 * c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
 * d. Zabezpiecz kod za pomocą klauzuli try catch.
 * e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.
 */

public class Exc_7 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //a.
    for (int i = 0; i < 5; i++) {
      System.out.print("Podaj " + (i + 1) + " liczbę: ");
      list.add(scanner.nextInt());
    }

    //b.
    //list.get(6);

    //c.
    /**
     * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
     * 	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
     * 	at java.util.ArrayList.get(ArrayList.java:433)
     * 	at zadania01.wyjątki.Exc_7.main(Exc_7.java:27)
     */

    //d + e.
    try {
      list.get(6);
    } catch (Exception e) {
      System.out.println("Przekroczony zakres listy");
    }
  }
}
