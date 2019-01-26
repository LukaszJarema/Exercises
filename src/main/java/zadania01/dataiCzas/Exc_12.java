package zadania01.dataiCzas;

import java.time.LocalDate;
import java.time.Period;

/**
 * Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
 * LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
 * Wyświetl ile czasu minęło pomiędzy datami.
 */

public class Exc_12 {
  public static void main(String[] args) {
    LocalDate firstDate = LocalDate.of(2017, 1, 1);
    LocalDate secondDate = LocalDate.of(2017, 5, 5);

    System.out.println("Pomiędzy datą 1.01.2017, a 5.05.2017 minęło: " + Period.between(firstDate, secondDate));
  }
}
