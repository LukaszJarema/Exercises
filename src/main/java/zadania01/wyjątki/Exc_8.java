package zadania01.wyjątki;

/**
 * Utwórz zmienną typu String, a następnie przypisz do niej imię “Olgierd”.
 * a. Wyświetl imię tak aby imię było wyświetlone dużymi literami
 * b. Wyświetl imię tak aby imię było wyświetlone małymi literami
 * c. Wyświetl długość imienia wykorzystująć odpowiednią metodę klasy String.
 * d. Korzystając z odpowiedniej metody sprawdź czy imię rozpoczyna się od litery
 * “O”
 * e. Korzystając z odpowiedniej metody sprawdź czy imię zawiera literę “e”.
 * f. Korzystając z odpowiedniej metody usuń litery “i” oraz “e” z imienia, a
 * następnie wyświetl imię po zmianach.
 * g. Wykorzystując pętlę for wyświetl kolejno litery imienia wraz z ich indeksem.
 * Spodziewany rezultat wygląda następująco
 * [1] = O
 * [2] = l
 * [3] = g
 * [4] = i
 * [5] = e
 * [6] = r
 * [7] = d
 */

public class Exc_8 {
  public static void main(String[] args) {
    String variable = "Olgierd";

    //a.
    System.out.println(variable.toUpperCase());

    //b.
    System.out.println(variable.toLowerCase());

    //c.
    System.out.println("Długość imienia: " + variable.length());

    //d.
    System.out.println("Czy imię rozpoczyna się od litery O? " + variable.startsWith("O"));

    //e.
    System.out.println("Czy imię zawiera literę e? " + variable.contains("e"));

    //f.
    String newVariable = variable.replaceAll("ie", "");
    System.out.println(newVariable);

    //g.
    for (int i = 0; i < variable.length(); i++) {
      System.out.println("[" + (i + 1) + "] = " + variable.charAt(i));
    }
  }
}
