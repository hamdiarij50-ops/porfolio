public class produit {
    private int id,jour,mois,annee;
    private String libelle,marque;
    private float prix;
    public produit(int id,String libelle,String marque,float prix){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
    }
    public void afficher(){
        System.out.println("les donnes sont:"+id+", "+libelle+", "+marque+"et" +prix);
    }
    public void setdate(int jour,int mois,int annee){
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;
    }
    public String getdate(){
        return "jour"+jour;
   }
   public void setId(int id){
        this.id=id;}
    public int getId(){
        return +this.id;
    }
   }
