package batailleGame;

public class Main {
    public static void main(String[] args) {
        // creation des joueurs
        Player P1 = new Player("Le bon");
        Player P2 = new Player("La brute");

        // initialisation du deck du joueur
        P1.initPlayerDeck();
        P2.initPlayerDeck();

            // On tire une carte pour le joueur
            Card currentCardP1 = new Card(Card.Color.carreau, Card.CardName.as);
            Card currentCardP2 = new Card(Card.Color.carreau, Card.CardName.as);

            if (currentCardP1.equals(currentCardP2)){
                System.out.println("même cartes");
            }else System.out.println("pas mêmes cartes ");

            // on compare les cartes tirées pour savoir qui gagne
            switch (currentCardP1.compareTo(currentCardP2)) {
                case 1 : System.out.println(P1.getName() + " à gagné ");
                case -1 :System.out.println(P2.getName() + " à gagné");
                case 0 : System.out.println("égalité");
            }

            //Check condition de victoire
            if (P1.getDeckPlayer().length == 0) {
                System.out.println("Le joueur gagnant est :" + P1.getName());
            } else if (P2.getDeckPlayer().length == 0) {
                System.out.println("Le joueur gagnant est :" + P2.getName());
            }
        }

}
