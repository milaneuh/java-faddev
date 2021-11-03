package batailleGame;

public class Card implements  Comparable<Card> {

    //Compare TO
    @Override
    public int compareTo(Card pCard) {
        int lCompute = this.mCardName.ordinal() - pCard.mCardName.ordinal();
        return (lCompute < 0) ? -1: (lCompute>0)? 1:0 ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Card)){
            Card lCard = (Card) obj;
            return (lCard.mColor.equals(this.mColor) && lCard.mCardName.equals(this.mCardName));
        }
        return false;
    }

    enum CardName {
        deux,
        trois,
        quatre,
        cinq,
        six,
        sept,
        huit,
        neuf,
        dix,
        valet,
        dame,
        roi,
        as
    };

    enum Color {
        coeur,
        carreau,
        trèfle,
        pique
    }
    private final Color mColor;
    private final CardName mCardName;

    // CONSTRUCTEUR
    public Card(Color pColor, CardName pCardName)
    {
        // creation de nouvelle carte
        this.mCardName=pCardName;
        this.mColor=pColor;
    }

    // Fonction nous permettant de consulter le nom de la carte
    public CardName getName()
    {
        return this.mCardName;
    }

    // Fonction nous permettant de consulter la valeur de la carte
    public int getValue()
    {
        return this.mCardName.ordinal();
    }

    // Fonction nous permettant de consulter la couleur de la carte
    public Color getColor()
    {
        return this.mColor;
    }

}
