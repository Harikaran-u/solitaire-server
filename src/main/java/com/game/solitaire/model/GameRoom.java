package com.game.solitaire.model;

import com.game.solitaire.utils.HelperFunctions;

import java.util.HashMap;
import java.util.List;

//whole game logics here only
public class GameRoom {
    private HashMap<Integer, List<Card>> pilesCardList;

    public GameRoom() {
        pilesCardList.put(1, HelperFunctions.getRandomCards(6));
    }

    public HashMap<Integer, List<Card>> getPilesCardList() {
        return pilesCardList;
    }

    public void setPilesCardList(HashMap<Integer, List<Card>> pilesCardList) {
        this.pilesCardList = pilesCardList;
    }
}