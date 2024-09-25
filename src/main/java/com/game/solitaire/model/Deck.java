package com.game.solitaire.model;

import com.game.solitaire.utils.HelperFunctions;

import java.util.List;

public class Deck {
    private List<Card> cardsList;

    public Deck() {
        this.cardsList = HelperFunctions.getCardsList();
    }

    public List<Card> getCardsList() {
        return cardsList;
    }

    public void setCardsList(List<Card> cardsList) {
        this.cardsList = cardsList;
    }
}
