package zadania01.dataiCzas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Wyświetl bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
 * wyświetlić datę w następującym formacie
 * 3 lutego 2018 roku, sobota 22:12:27
 */

public class Exc_15 {
  public static void main(String[] args) {
    LocalDateTime bydgoszcz = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY 'roku,' EEEE HH:MM:SS");
    String text = bydgoszcz.format(formatter);
    System.out.println(text);
  }
}
