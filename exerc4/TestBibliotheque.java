

package test;

import java.util.Scanner;
import entities.*;

public class TestBibliotheque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacite;

        do {
            System.out.print("Capacité de la bibliothèque (minimum 2) : ");
            capacite = Integer.parseInt(sc.nextLine());
        } while (capacite < 2);

        Bibliotheque biblio = new Bibliotheque(capacite);

        // Initialisation avec deux documents
        biblio.ajouter(new Roman(
                "Le Petit Prince", "Antoine de Saint-Exupéry", 96, 45.0));

        biblio.ajouter(new Revue(
                "Science et Vie", "Octobre", 2026));

        int choix;

        do {
            System.out.println("\n===== MENU BIBLIOTHÈQUE =====");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Afficher tous les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Rechercher un document par numéro");
            System.out.println("5. Afficher les auteurs");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = Integer.parseInt(sc.nextLine());

            switch (choix) {
                case 1:
                    System.out.println("Type : 1.Document  2.Livre"
                            + "  3.Roman  4.Manuel"
                            + "  5.Revue  6.Dictionnaire");
                    System.out.print("Choisissez le type : ");
                    int type = Integer.parseInt(sc.nextLine());

                    System.out.print("Titre : ");
                    String titre = sc.nextLine();

                    Document doc = null;

                    if (type == 1) {
                        doc = new Document(titre);

                    } else if (type == 2) {
                        System.out.print("Auteur : ");
                        String auteur = sc.nextLine();
                        System.out.print("Nombre de pages : ");
                        int pages = Integer.parseInt(sc.nextLine());

                        doc = new Livre(titre, auteur, pages);

                    } else if (type == 3) {
                        System.out.print("Auteur : ");
                        String auteur = sc.nextLine();
                        System.out.print("Nombre de pages : ");
                        int pages = Integer.parseInt(sc.nextLine());
                        System.out.print("Prix : ");
                        double prix = Double.parseDouble(sc.nextLine());

                        doc = new Roman(titre, auteur, pages, prix);

                    } else if (type == 4) {
                        System.out.print("Auteur : ");
                        String auteur = sc.nextLine();
                        System.out.print("Nombre de pages : ");
                        int pages = Integer.parseInt(sc.nextLine());
                        System.out.print("Niveau : ");
                        String niveau = sc.nextLine();

                        doc = new Manuel(titre, auteur, pages, niveau);

                    } else if (type == 5) {
                        System.out.print("Mois : ");
                        String mois = sc.nextLine();
                        System.out.print("Année : ");
                        int annee = Integer.parseInt(sc.nextLine());

                        doc = new Revue(titre, mois, annee);

                    } else if (type == 6) {
                        System.out.print("Langue : ");
                        String langue = sc.nextLine();

                        doc = new Dictionnaire(titre, langue);
                    }

                    if (doc == null) {
                        System.out.println("Type invalide.");
                    } else if (biblio.ajouter(doc)) {
                        System.out.println("Document ajouté : " + doc);
                    } else {
                        System.out.println("Bibliothèque pleine.");
                    }
                    break;

                case 2:
                    biblio.afficherDocuments();
                    break;

                case 3:
                    System.out.print("Numéro du document à supprimer : ");
                    int numSup = Integer.parseInt(sc.nextLine());
                    Document aSupprimer = biblio.document(numSup);

                    if (biblio.supprimer(aSupprimer)) {
                        System.out.println("Document supprimé.");
                    } else {
                        System.out.println("Document introuvable.");
                    }
                    break;

                case 4:
                    System.out.print("Numéro du document recherché : ");
                    int num = Integer.parseInt(sc.nextLine());
                    Document resultat = biblio.document(num);

                    if (resultat != null) {
                        System.out.println(resultat);
                    } else {
                        System.out.println("Document introuvable.");
                    }
                    break;

                case 5:
                    biblio.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        sc.close();
    }
}

