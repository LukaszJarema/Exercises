package ZadaniaProgramistyczne;

import java.util.Scanner;

/**
 * Program Opłaty za transport.
 * Firma "Szybkie Dostawy" nalicza następujące opłaty:
 * Waga Przesyłki:                  Stawka za 500km:
 * Kilogram lub mniej               1,10zł
 * Powyżej kg do 3kg                2,20zł
 * Powyżej 3kg do 5kg               3,70zł
 * Powyżej 5kg                      3,80zł
 * Opłaty za 500km nie są naliczane proporcjonalnie. Jeśli np. kilogramowa przesyłka zostanie przesłana na 550km, opłata
 * wyniesie 2,20 złotego. Napisz program, który wyświetla prośbę o wprowadzenie wagi i odległości przesyłki, a następnie
 * wyświetli koszt.
 */

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wagę przesyłki w kilogramach: ");
        double weight = scanner.nextDouble();
        System.out.println("Wprowadź na jaką odległość chcesz wysłać przesyłkę: ");
        int distance = scanner.nextInt();

        if (weight <= 1) {
            double priceFor500km = 1.10;
            double price = priceFor500km + priceFor500km * (distance / 500);
            System.out.printf("Cena za przesyłkę o wadze %.2f kg na odległość %d km wynosi %.2f zł", weight, distance, price);
        } else if (weight <= 3) {
            double priceFor500km = 2.20;
            double price = priceFor500km + priceFor500km * (distance / 500);
            System.out.printf("Cena za przesyłkę o wadze %.2f kg na odległość %d km wynosi %.2f zł", weight, distance, price);
        } else if (weight <= 5) {
            double priceFor500km = 3.70;
            double price = priceFor500km + priceFor500km * (distance / 500);
            System.out.printf("Cena za przesyłkę o wadze %.2f kg na odległość %d km wynosi %.2f zł", weight, distance, price);
        } else {
            double priceFor500km = 3.80;
            double price = priceFor500km + priceFor500km * (distance / 500);
            System.out.printf("Cena za przesyłkę o wadze %.2f kg na odległość %d km wynosi %.2f zł", weight, distance, price);
        }
    }
}
