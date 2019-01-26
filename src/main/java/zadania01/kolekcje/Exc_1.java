package zadania01.kolekcje;

/**
 * Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
 * a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
 * b. Wyświetl długość tablicy
 * c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
 * d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i zapisz go ponownie w tablicy.
 * e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
 */

public class Exc_1 {
  public static void main(String[] args) {
    int[] table = new int[10];

    //a.
    for (int i = 0; i < table.length; i++) {
      table[i] = (i + 1);
    }

    //b.
    System.out.println("Długoś tablicy wynosi: " + table.length);

    //c.
    for (int i = 0; i < table.length; i++) {
      System.out.println("Element " + i + " tablicy wynosi: " + table[i]);
    }

    //d.
    for (int i = 0; i < table.length; i++) {
      table[i] *= 2;
    }

    //e.
    for (int i = 0; i < table.length; i++) {
      System.out.println("Element " + i + " tablicy wynosi: " + table[i]);
    }
  }
}
