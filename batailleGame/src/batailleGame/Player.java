package batailleGame;

public class Player {
    /** Attribut de la class player*/
    private String mName; // nom
    private Card[] mDeckPlayer; //deck de notre joueur

    /* CONSTRUCTEUR */
    public Player(String pName)
    {
        this.mName=pName;
    }

    /**Méthodes de la class Player*/

    //Fonction nous permettant d'initialiser le deck de notre joueur
    public void initPlayerDeck()
    {
        Deck deckPlayer = new Deck(13);
        this.mDeckPlayer = deckPlayer.initDeck();
    }

    // Fonction nous permettant de consulter le nom de notre joueur
    public String getName()
    {
        return this.mName;
    }

    // Fonction qui tire la carte 0 du deck de notre joueur
    public Card pullACard()
    {
        return this.mDeckPlayer[0];
    }

    // Fonction nous permettant de modifier le nom de notre joueur
    public void setName(String name)
    {
        this.mName = name;
    }

    public Card[] getDeckPlayer() {
        return mDeckPlayer;
    }

    // Fonction nous permettant de tirer une cartes
   /*public card drawCard()
    {
        //A compléter
        return card;
    }*/
}
