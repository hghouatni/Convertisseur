import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Menu de Conversion ===");
            System.out.println("1. Convertir Celsius en Fahrenheit");
            System.out.println("2. Convertir Kilomètres en Miles");
            System.out.println("3. Convertir Euros en Dollars");
            System.out.println("4. Convertir Kilogrammes en Livres");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option (1-5) : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    //convertirCelsiusEnFahrenheit(scanner);
                    break;
                case "2":
                    //convertirKilometresEnMiles(scanner);
                    break;
                case "3":
                    //convertirEurosEnDollars(scanner);
                    break;
                case "4":
                    //convertirKilogrammesEnLivres(scanner);
                    break;
                case "5":
                    System.out.println("Merci d'avoir utilisé le programme. À bientôt !");
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez entrer un chiffre entre 1 et 5.");
            }
        }

        scanner.close();
    }
}