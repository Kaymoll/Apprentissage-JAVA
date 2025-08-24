import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarnetContacts carnet = new CarnetContacts();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Afficher les contacts");
            System.out.println("3. Supprimer un contact");
            System.out.println("4. Rechercher un contact");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            choix = Integer.parseInt(scanner.nextLine());

            switch (choix) {
                case 1:
                    carnet.ajouterContact();
                    break;
                case 2:
                    carnet.afficherContacts();
                    break;
                case 3:
                    carnet.supprimerContact();
                    break;
                case 4:
                    carnet.rechercherContact();
                    break;
                case 0:
                    System.out.println("👋 Au revoir !");
                    break;
                default:
                    System.out.println("❗ Choix invalide.");
            }
        } while (choix != 0);
    }
}
