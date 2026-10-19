
package entities;

public class Bibliotheque {
    private Document[] documents;
    private int nbDocuments;

    public Bibliotheque(int capacite) {
        if (capacite < 0) {
            throw new IllegalArgumentException("Capacité invalide");
        }

        documents = new Document[capacite];
        nbDocuments = 0;
    }

    public boolean ajouter(Document doc) {
        if (doc == null || nbDocuments == documents.length) {
            return false;
        }

        documents[nbDocuments++] = doc;
        return true;
    }

    public boolean supprimer(Document doc) {
        if (doc == null) {
            return false;
        }

        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == doc.getNumEnreg()) {
                for (int j = i; j < nbDocuments - 1; j++) {
                    documents[j] = documents[j + 1];
                }

                documents[--nbDocuments] = null;
                return true;
            }
        }

        return false;
    }

    public Document document(int numEnrg) {
        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }

        return null;
    }

    public void afficherDocuments() {
        if (nbDocuments == 0) {
            System.out.println("La bibliothèque est vide.");
            return;
        }

        for (int i = 0; i < nbDocuments; i++) {
            System.out.println(documents[i]);
        }
    }

    public void afficherAuteurs() {
        boolean trouve = false;

        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i] instanceof Livre) {
                Livre livre = (Livre) documents[i];
                System.out.println(livre.getAuteur());
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun auteur trouvé.");
        }
    }
}
