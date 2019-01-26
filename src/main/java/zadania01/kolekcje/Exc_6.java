package zadania01.kolekcje;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

/**
 * Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
 * a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
 * b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random z zakresu <1,100> i dodaj je do kolejki.
 * c. Wyświetl kolejno liczby występujące w kolejce.
 */

public class Exc_6 {
  public static void main(String[] args) {
    PriorityQueue queue = new PriorityQueue();
    Scanner scanner = new Scanner(System.in);

    //a.
    System.out.print("Ile liczb ma zostać wylosowanych: ");
    int howMany = scanner.nextInt();

    //b.
    for (int i = 0; i < howMany; i++) {
      Random random = new Random();
      queue.add(random.nextInt(100) + 1);
    }

    //c.
    System.out.println("Wylosowane liczby: " + queue);
  }
}
