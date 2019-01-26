package zadania01.dataiCzas;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
 * LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
 * czasu upłynęło pomiędzy godzinami.
 */

public class Exc_13 {
  public static void main(String[] args) {
    LocalTime firstTime = LocalTime.of(14, 11);
    LocalTime secondTime = LocalTime.of(18, 41);

    System.out.println("Od godziny 14:11, do godziny 18:41 minęło: " + Duration.between(firstTime, secondTime));
  }
}
