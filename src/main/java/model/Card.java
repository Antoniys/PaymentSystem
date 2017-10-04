package model;


public class Card {
    private boolean status;   //активная или уже закончился срок
    private int numberCard;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;

        Card card = (Card) obj;

        if (this.status != card.status)
            return false;
        return numberCard == card.numberCard;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + numberCard;
        return result;
    }
}
