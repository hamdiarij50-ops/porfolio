public class Collection {
        public static void main(String[] args) {

            Ustensile[] ust = new Ustensile[5];

            ust[0] = new AssietteRonde(1943, 10);
            ust[1] = new AssietteCarree(1943, 5);
            ust[2] = new Cuillere(1943, 15);
            ust[3] = new AssietteRonde(2000, 8);
            ust[4] = new Cuillere(2010, 12);

            for (Ustensile u : ust) {
                System.out.println("---------------------------");
                System.out.println("Année fabrication : " + u.getAnneeFabrication());
                System.out.println("Valeur : " + u.calculerValeur() + " francs");

                if (u instanceof Assiette) {
                    System.out.println("Surface : " + ((Assiette) u).calculerSurface());
                }
            }
        }
    }
}
