package com.game.solitaire.model;

import com.game.solitaire.utils.HelperFunctions;

import java.util.HashMap;
import java.util.List;

//whole game logics here only
public class GameRoom {
    private HashMap<Integer, List<Card>> pilesCardList = new HashMap<>();
    private List<Card> extraCards;

    public GameRoom() {
        for(int i = 1; i < 11; i++){
            if(i < 5){
                pilesCardList.put(i, HelperFunctions.getRandomCards(6));
            }else{
                pilesCardList.put(i, HelperFunctions.getRandomCards(5));
            }
        }
        extraCards = HelperFunctions.getExtraCards();
    }

    public HashMap<Integer, List<Card>> getPilesCardList() {
        return pilesCardList;
    }

    public void setPilesCardList(HashMap<Integer, List<Card>> pilesCardList) {
        this.pilesCardList = pilesCardList;
    }

    public List<Card> getExtraCards() {
        return extraCards;
    }

    public void setExtraCards(List<Card> extraCards) {
        this.extraCards = extraCards;
    }
}
