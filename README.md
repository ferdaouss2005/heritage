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
J’ai testé plusieurs animaux et l’agrandissement automatique du tableau. J’ai aussi testé les méthodes spécifiques de chaque animal pour voir si tout fonctionne correctement.
Exercice 3 
<img width="434" height="143" alt="image" src="https://github.com/user-attachments/assets/d506366c-29cd-4c7d-9ae2-3e2946132aa2" />
au debut j ai trouve ce probleme
mais c est resolu , ce exercice etait amusant et besoin de concentration a la fois 
<img width="656" height="273" alt="image" src="https://github.com/user-attachments/assets/6228033b-ac4c-4a26-ad21-3bc32fc1e03e" />

 Exercice 4: 
 resultat 
 <img width="407" height="191" alt="image" src="https://github.com/user-attachments/assets/a718f16c-454b-4e5a-b343-2b31d1fd05cd" />


