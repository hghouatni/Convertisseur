import java.util.*;

public class Conversion {

    private static final List<String> historique = new LinkedList<>();
    private static final int HISTORIQUE_LIMIT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Menu de Conversion ===");
            System.out.println("1. Convertir Celsius en Fahrenheit");
            System.out.println("2. Convertir Kilomètres en Miles");
            System.out.println("3. Convertir Euros en Dollars");
            System.out.println("4. Convertir Kilogrammes en Livres");
            System.out.println("5. Afficher l'historique des conversions");
            System.out.println("6. Effacer l'historique");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option (1-7) : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    convertirCelsiusEnFahrenheit(scanner);
                    break;
                case "2":
                    convertirKilometresEnMiles(scanner);
                    break;
                case "3":
                    convertirEurosEnDollars(scanner);
                    break;
                case "4":
                    convertirKilogrammesEnLivres(scanner);
                    break;
                case "5":
                    afficherHistorique();
                    break;
                case "6":
                    effacerHistorique();
                    break;
                case "7":
                    System.out.println("Merci d'avoir utilisé le programme. À bientôt !");
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez entrer un chiffre entre 1 et 7.");
            }
        }

        scanner.close();
    }

    private static void convertirCelsiusEnFahrenheit(Scanner scanner) {
        System.out.print("Entrez la température en Celsius : ");
        try {
            double celsius = Double.parseDouble(scanner.nextLine());
            double fahrenheit = (celsius * 9 / 5) + 32;
            String conversion = celsius + " °C = " + fahrenheit + " °F";
            System.out.println(conversion);
            ajouterHistorique("Celsius → Fahrenheit : " + conversion);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : veuillez entrer un nombre valide.");
        }
    }

    private static void convertirKilometresEnMiles(Scanner scanner) {
        System.out.print("Entrez la distance en kilomètres : ");
        try {
            double km = Double.parseDouble(scanner.nextLine());
            double miles = km * 0.621371;
            String conversion = km + " km = " + miles + " miles";
            System.out.println(conversion);
            ajouterHistorique("Kilomètres → Miles : " + conversion);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : veuillez entrer un nombre valide.");
        }
    }

    private static void convertirEurosEnDollars(Scanner scanner) {
        System.out.print("Entrez le montant en euros : ");
        try {
            double euros = Double.parseDouble(scanner.nextLine());
            double tauxConversion = 1.08; // Taux de conversion fixe
            double dollars = euros * tauxConversion;
            String conversion = euros + " € = " + dollars + " $";
            System.out.println(conversion);
            ajouterHistorique("Euros → Dollars : " + conversion);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : veuillez entrer un nombre valide.");
        }
    }

    private static void convertirKilogrammesEnLivres(Scanner scanner) {
        System.out.print("Entrez la masse en kilogrammes : ");
        try {
            double kg = Double.parseDouble(scanner.nextLine());
            double livres = kg * 2.20462;
            String conversion = kg + " kg = " + livres + " livres";
            System.out.println(conversion);
            ajouterHistorique("Kilogrammes → Livres : " + conversion);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : veuillez entrer un nombre valide.");
        }
    }

    private static void ajouterHistorique(String conversion) {
        if (historique.size() >= HISTORIQUE_LIMIT) {
            historique.remove(0); // Enlever le plus ancien si la limite est atteinte
        }
        historique.add(conversion);
    }

    private static void afficherHistorique() {
        if (historique.isEmpty()) {
            System.out.println("L'historique est vide.");
        } else {
            System.out.println("\n=== Historique des Conversions ===");
            for (String entry : historique) {
                System.out.println(entry);
            }
        }
    }

    private static void effacerHistorique() {
        historique.clear();
        System.out.println("L'historique a été effacé.");
    }
}
