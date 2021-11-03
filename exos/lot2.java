public class lot2 {

    public static boolean estMajeur(int a)
    {
        {
            if(a < 18)
            {
                System.out.println("Cette personne est mineure");
                return false;
            }
            else 
            {
                System.out.println("Cette personne est majeure");
                return true;
            }
    }   

    public static void signe(float a)
    {
        if(a > 0)
        {
            System.out.println("Le chiffre est positif");
        }
        else if( a < 0)
        {
            System.out.println("Le chiffre est négatif");
        }
        else
        {
            System.out.println("Le ciffre est nul");
        }
    }

    public static boolean signe2(float a)
    {
        return a > 0 ? "positif":( a = 0? "null":"negatif");
    }

    public static int plusGrand2(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a+" est le plus grand");
            return a;
        }
        else if(b > a)
        {
            System.out.println(b+" est le plus grand");
            return b;
        }
        else
        {
            System.out.println("Les dexu chiffres sont égaux");
            return a+b;
        }
    }

    public static int plusPetit2(int a, int b)
    {
        if(a < b)
        {
            System.out.println(a+" est le plus petit");
            return a;
        }
        else if(b < a)
        {
            System.out.println(b+" est le plus petit");
            return b;
        }
        else
        {
            System.out.println("Les dexu chiffres sont égaux");
            return a+b;
        }
    }

    public static int plusPetit3(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            System.out.println(a+" est le plus petit");
            return a;
        }
        else if(b < a && b < c)
        {
            System.out.println(b+" est le plus petit");
            return b;
        }
        else
        {
            System.out.println(c+" est le plus petit");
            return c;
        }
    }

    public static int plusGrand3(int a, int b, int c)
    {
        if(a > b && a > c)
        {
            System.out.println(a+" est le plus grand");
            return a;
        }
        else if(b > a && b > c)
        {
            System.out.println(b+" est le plus grand");
            return b;
        }
        else if(c > a && c > b)
        {
            System.out.println(b+" est le plus grand");
            return c;
        }
        else
        {
            System.out.println("Les trois chiffres sont égaux");
            return a+b;
        }
    }
    
    public static void positifsOuPas(int a , int b, int c)
    {
        if( a >= 0 &&  b >= 0 && c >= 0)
        {
            System.out.println("Le chiffre est positif ! :)");
        }
    }
    public static void quelPermis(int a)
    {
        if(a < 16)
        {
            System.out.println("Passager");
        }
        else if( a >= 16 && a <18)
        {
            System.out.println("Conduite accompagnée");
        }
        else
        {
            System.out.println("Permis B");
        }
    }

    public static String capitale(String a)
    {
        switch(a)
        {
            case france:
            return "Paris";

            case espagne:
            return "Madrid";

            case allemagne:
            return "Berlin";

            case italie:
            return "Rome";
        }

    }
    

    public static int fonctionRecursive(int a , int b )
    {
        int r = a%b;
        if(r > 0)
        {
            return (int) fonctionRecursive(b, r);
        }

        else
        {
            return r;
        }
    }
    
    public static void main(String[] args) {
        System.out.print(fonctionRecursive(10, 5));
        System.out.print(fonctionRecursive(124, 89));
        

    }
}
