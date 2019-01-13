package zadaniaPodstawowe.exc_1;

import java.util.Scanner;

/**
 * Przygotuj program, który pobierze od użytkownika 2 liczby oraz wyświetli wynik
 * podstawowych działań matematycznych (dodawania, odejmowania, dzielenia,
 * mnożenia)
 */

public class Exc_1 {
  public static void main(String[] args) {

    double firstNumber = 0;
    double secondNumber = 0;

    boolean resultA = false;
    while (!resultA)
      try {
        System.out.print("Podaj pierwszą liczbę: ");
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextDouble();
        resultA = true;
      } catch (Exception e) {
        System.out.println("Nie wpisałeś liczby, podaj jeszcze raz: ");
      }

    boolean resultB = false;
    while (!resultB)
      try {
        System.out.print("Podaj drugą liczbę: ");
        Scanner scanner1 = new Scanner(System.in);
        secondNumber = scanner1.nextDouble();
        resultB = true;
      } catch (Exception e) {
        System.out.println("Nie wpisałeś liczby, podaj jeszcze raz: ");
      }

    System.out.println("Dodawanie: " + Calculate.addition(firstNumber, secondNumber));
    System.out.println("Odejmowanie: " + Calculate.subtraction(firstNumber, secondNumber));
    System.out.println("Dzielenie: " + Calculate.division(firstNumber, secondNumber));
    System.out.println("Mnożenie: " + Calculate.multiplication(firstNumber, secondNumber));
  }
}
