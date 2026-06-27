import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Vitaliy");
        namen.add("Anna");
        namen.add("Max");
        namen.add("Zimko");
        namen.add("Lola");
        namen.remove("Anna");

        System.out.println("Erster Name: " + namen.get(0));
        System.out.println("Anzahl Namen: " + namen.size());

        for (String name : namen) {
            System.out.println("Hallo, " + name + "!");
        }

        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(10);
        zahlen.add(25);
        zahlen.add(7);
        zahlen.add(42);

        int summe = 0;
        for (int zahl : zahlen) {
            summe = summe + zahl;
        }

        System.out.println("Summe: " + summe);
    }
}