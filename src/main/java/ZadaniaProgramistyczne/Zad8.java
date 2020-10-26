package ZadaniaProgramistyczne;

import java.util.Scanner;

/**
 * Program Sprzedaż Oprogramowania.
 * Producent oprogramowania sprzedaje pakiet w cenie detalicznej 99 złotych. Rabaty za liczbę sztuk są przyznawane
 * zgodnie z następującą tabelą:
 * Sztuk        Rabat
 * 10-19        20%
 * 20-49        30%
 * 50-99        40%
 * 100 i więcej 50%
 * Program wyświetla prośbę o podanie liczby zakupionych pakietów. Następnie wyświetla poziom rabatu i łączną kwotę
 * zakupu po rabacie.
 */

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile pakietów oprogramowania chcesz kupić: ");
        int howManyPackage = scanner.nextInt();
        double priceForPackage = 99.0;

        if (howManyPackage < 10) {
            double price = priceForPackage * howManyPackage;
            String output = String.format ("Cena za " + howManyPackage + " sztuk wynosi:  %.2f zł", price);
            System.out.println(output);
        } else if (howManyPackage < 20) {
            double price = (priceForPackage * 0.8) * howManyPackage;
            System.out.printf("Cena za %d sztuk wynosi %.2f zł", howManyPackage, price);
        } else if (howManyPackage < 50) {
            double price = (priceForPackage * 0.7) * howManyPackage;
            System.out.printf("Cena za %d sztuk wynosi %.2f zł", howManyPackage, price);
        } else if (howManyPackage < 100) {
            double price = (priceForPackage * 0.6) * howManyPackage;
            System.out.printf("Cena za %d sztuk wynosi %.2f zł", howManyPackage, price);
        } else {
            double price = (priceForPackage * 0.5) * howManyPackage;
            System.out.printf("Cena za %d sztuk wynosi %.2f zł", howManyPackage, price);
        }
    }
}
