public class TestTableauCompte {
    public static void main(String[]largs){
        compte[]compte=new compte[10];
        for(int i=0;i<compte.length; i++) {
            compte[i] = new compte();
            compte[i].deposer(200 + 100 * i);
        }
        for(int i=0;i<compte.length; i++)
            for ((int j=i + 1;j<=i + 3 && j<compte.length;j++){
                compte[i].virerVers(20,compte[j]);
        }
    }
    for(int i=0;i<compte.length; i++){
        System.out.println("compte"+i+"");
        compte[i].afficher();
    }
}
