import java.util.Scanner;

public class magasin {
    Scanner input=new Scanner(System.in);
    int identifiant;
    String adresse;
    private int Capacite=1;
    produit[] ensemble=new produit[Capacite];
    int nombre;
    static int total=0;
    public magasin(int identifiant,String adresse){
        this.identifiant=identifiant;
        this.adresse=adresse;}
    public int get_Capacite(){
        return Capacite;}
    public void remplir(int nombre) {
        while (nombre > Capacite) {
            System.out.println("donner la nombre des produits inerieur a 50:");
        }
        nombre = input.nextInt();
    }
    this.nombre=nombre;
    for(int i=0;i<nombre;i++){
        System.out.println("donner l'id:");
        int x =input.nextInt();
        System.out.println("donner le produit:");
        String y= input.next();
        System.out.println("donner le prix:");
    }
}
