public class compte {
    int solde=0;
    void deposer(int montant){
        solde = solde + montant;
    }
    void retirer(int montant){
        solde = solde - montant;
    }
    void viererVers(int montant,compte destination) {
        this.retirer(montant);
        destination.deposer(montant);
    }
    void afficher(){
        System.out.println("solde ="+solde +"euro"):
    }
}
