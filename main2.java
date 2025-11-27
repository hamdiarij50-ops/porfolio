public class main2 {
    magasin m1=new magasin(1,"@a");
    magasin m2=new magasin(2,"@b");
    magasin m3=new magasin(3,"@c");
    m1.remplir(2);
    m1.afficher();
}
static  int n_p(){
    Scanner input=new Scanner(System.in);
    System.out.println("donner le nombre des magasin:");
    int n=input.nextInt();
    return n;
}
