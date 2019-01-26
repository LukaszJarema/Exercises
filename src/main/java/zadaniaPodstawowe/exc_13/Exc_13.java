package zadaniaPodstawowe.exc_13;

import java.util.Scanner;

/**
 * Zmodyfikuj program z poprzedniego zadania, tak aby użytkownik mógł wprowadzić
 * dowolną ilość liczb. Koniec wprowadzenia liczb powinien odbywać się poprzez
 * wpisanie słowa koniec.
 */

public class Exc_13 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String number;
    int counter = 0;
    double result = 0;

    System.out.print("Wpisz liczbę, jeśli chcesz zakończyć wprowadzanie wpisz koniec: ");

    while(!(number=scanner.nextLine()).equals("koniec")) {
      result += Integer.parseInt(number);
      counter ++;
    }
    System.out.println("Średnia arytmetyczna: " + (result / counter));
  }
}
