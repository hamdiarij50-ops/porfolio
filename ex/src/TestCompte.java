public class TestCompte {
    public static void main(String[]largs){
        compte c1=new compte();
        compte c2=new compte();
        c1.deposer(500);
        c2.deposer(1000);
        c2.retirer(10);
        c1.retirer(75 , c2);
        System.out.println("premier compte");
        c1.afficher();
        System.out.println("second compte");
        c2.afficher();
    }
}
