import java.util.ArrayList;
import java.util.Scanner;

public class CarnetContacts {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void ajouterContact() {
        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Téléphone : ");
        String telephone = scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

        Contact contact = new Contact(nom, prenom, telephone, email);
        contacts.add(contact);
        System.out.println("✅ Contact ajouté !");
    }

    public void afficherContacts() {
        if (contacts.isEmpty()) {
            System.out.println("📭 Aucun contact trouvé.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    public void supprimerContact() {
        afficherContacts();
        System.out.print("Entrez le numéro du contact à supprimer : ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("🗑️ Contact supprimé.");
        } else {
            System.out.println("❌ Numéro invalide.");
        }
    }

    public void rechercherContact() {
        System.out.print("Entrez un nom ou prénom à rechercher : ");
        String recherche = scanner.nextLine().toLowerCase();
        boolean trouve = false;

        for (Contact c : contacts) {
            if (c.getNom().toLowerCase().contains(recherche) ||
                    c.getPrenom().toLowerCase().contains(recherche)) {
                System.out.println(c);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("🔍 Aucun contact trouvé.");
        }
    }
}
