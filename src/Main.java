public class Main {
    public static void main(String[] args) {
        String name = "Vitaliy";
        int alter = 30;
        double gewicht = 85.5;

        begruesse(name);
        zeigeAlter(alter);
        zeigeGewicht(gewicht);

        int summe = addiere(10, 25);
        System.out.println("Summe: " + summe);

        double verhältnis = berechneVerhältnis(85.5, 190.0);
        System.out.println("Verhältnis: " + verhältnis);
    }

    static int addiere(int a, int b) {
        return a + b;
    }

    static double berechneVerhältnis(double gewicht, double größe) {
        return gewicht / größe;
    }

    static void begruesse(String name) {
        System.out.println("Hallo, " + name + "!");
    }

    static void zeigeAlter(int alter) {
        System.out.println("Du bist " + alter + " Jahre alt.");
    }

    static void zeigeGewicht(double gewicht) {
        System.out.println("Du wiegst " + gewicht + " kg.");
    }
}