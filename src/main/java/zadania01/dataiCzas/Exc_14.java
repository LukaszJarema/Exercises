package zadania01.dataiCzas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Wyświetl bieżącą datę i godzinę w Tokyo.
 */

public class Exc_14 {
  public static void main(String[] args) {
    System.out.println("Aktualnie w Tokio jest: " + ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
  }
}
