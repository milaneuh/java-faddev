public class main
{
    public static String helloWorld(){
        String world ="Hello World !";
        return world;
    }

    public static String quiEstLeMeilleurProf(){
        String meilleurProf = "Rodolphe !";
        return meilleurProf;
    }

    public static String retourneMonArgument(int a){
        String resultat = "";
        resultat += a;
        return resultat;
    }

    public static int somme(int nb1, int nb2){
        return nb1 + nb2;
    }

    public static int soustraction(int nb1, int nb2){
        return  nb1 - nb2;
    }

    public  static float multiplication(int nb1, int nb2){
        float resultat = nb1*nb2;
        return resultat;
    }

    public static float calculTTC(float nb1){
        float ttc = 1.055f*nb1;
        return ttc;
    }

    public static void afficherPlatDuJour(String entree,String plat,String dessert,float prixHtEntree,float prixHtPlat,float prixHtDessert){
        float prixTtcEntree = calculTTC(prixHtEntree);
        float prixTtcPlat = calculTTC(prixHtPlat);
        float prixTtcDessert = calculTTC(prixHtDessert);

        System.out.println("Le chef vous propose : \n -Entrée: "+ entree +" ("+String.format("%.2f",prixTtcEntree)+") \n -Plat: "+plat+" ("+String.format("%.2f",prixTtcPlat)+") \n -Dessert: "
                            +dessert+" ("+String.format("%.2f",prixTtcDessert)+") \n Nous remercions notre aimable clientèle de régler en Bitcoin");
    }
    public static void main(String[] args){
        System.out.println(helloWorld());
        quiEstLeMeilleurProf();
        retourneMonArgument(123);
        somme(5,5);
        soustraction(5,5);
        multiplication(5,5);
        System.out.format("%.2f --%f\n" ,(calculTTC(10)),5.12f);
        afficherPlatDuJour("Arepas","Katchapas","Banane",5,10,5);
    }
}