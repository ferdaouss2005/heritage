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
<img width="473" height="472" alt="image" src="https://github.com/user-attachments/assets/e8f776d5-a7c7-4d30-aedc-941cebb79e33" />


Exercice2: 
<img width="388" height="181" alt="image" src="https://github.com/user-attachments/assets/630a1745-5d50-4d3e-8430-3b99cdb0a18a" />

