import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = scanner.nextLine();

        System.out.print("Wie alt bist du? ");
        int alter = scanner.nextInt();

        if (alter >= 18) {
            System.out.println("Hallo " + name + ", du bist volljährig!");
        }
        else {
            System.out.println("Hallo " + name + ", du bist noch minderjährig.");
        }

        System.out.print("Wie groß bist du? ");
        double groeße = scanner.nextDouble();

        if (groeße > 180.0) {
            System.out.println("Du bist groß!");
        } else {
                System.out.println("Du bist durchschnittlich groß.");
            }

        scanner.close();
    }
}