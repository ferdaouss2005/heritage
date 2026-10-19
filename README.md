exercice 1
# heritage
J’ai réalisé cet exercice pour pratiquer l’héritage et le polymorphisme en Java. J’ai suivi les consignes et testé les différentes classes. J’ai aussi ajouté un `@Override` de ma propre initiative pour que l’affichage soit correct. 
voila le code changer :
@Override
public void retirer(double montant) {
    if (montant > 0 && solde >= montant) {
        solde -= montant;
        System.out.println("CompteEpargne #" + getNumero()
                + " : retrait de " + montant);
    } else {
        System.out.println("CompteEpargne #" + getNumero()
                + " : retrait impossible (solde insuffisant)");
    }
}
que j ai ecris apres afficherDetails() dans la classe CompteEpargne
