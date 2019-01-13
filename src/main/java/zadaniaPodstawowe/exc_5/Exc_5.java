package zadaniaPodstawowe.exc_5;

/**
 * Przygotuj program, który wyświetli na konsoli liczby od 1 do 49. Użyj w tym celu pętli
 * do ... while
 */

public class Exc_5 {
  public static void main(String[] args) {
    int i = 1;
    do {
      System.out.println("Liczba " + i);
      i++;
    } while (i <= 49);
  }
}
