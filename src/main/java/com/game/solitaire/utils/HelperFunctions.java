package com.game.solitaire.utils;

import com.game.solitaire.model.Card;
import com.game.solitaire.model.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HelperFunctions {

    public static List<Card> getCardsList(){
        List<Card> cardsList = new ArrayList<>();
        String[] cardRanks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        HashMap<String, String> cardMap = new HashMap<String, String>();
        cardMap.put("A", "https://upload.wikimedia.org/wikipedia/commons/5/5a/Ace_of_spades.svg");
        cardMap.put("2", "https://upload.wikimedia.org/wikipedia/commons/a/a4/2_of_spades.svg");
        cardMap.put("3", "https://upload.wikimedia.org/wikipedia/commons/e/eb/3_of_spades.svg");
        cardMap.put("4", "https://upload.wikimedia.org/wikipedia/commons/a/a4/4_of_spades.svg");
        cardMap.put("5", "https://upload.wikimedia.org/wikipedia/commons/8/8a/5_of_spades.svg");
        cardMap.put("6", "https://upload.wikimedia.org/wikipedia/commons/4/4e/6_of_spades.svg");
        cardMap.put("7", "https://upload.wikimedia.org/wikipedia/commons/f/f7/7_of_spades.svg");
        cardMap.put("8", "https://upload.wikimedia.org/wikipedia/commons/4/40/8_of_spades.svg");
        cardMap.put("9", "https://upload.wikimedia.org/wikipedia/commons/6/63/9_of_spades.svg");
        cardMap.put("10", "https://upload.wikimedia.org/wikipedia/commons/6/68/10_of_spades.svg");
        cardMap.put("J", "https://upload.wikimedia.org/wikipedia/commons/a/a9/Jack_of_spades2.svg");
        cardMap.put("Q", "https://upload.wikimedia.org/wikipedia/commons/d/d2/Queen_of_spades2.svg");
        cardMap.put("K", "https://upload.wikimedia.org/wikipedia/commons/2/22/King_of_spades2.svg");

        for(String rank:cardRanks){
            cardsList.add(new Card("Spade",rank, cardMap.get(rank), false));
        }
        return cardsList;
    }

    public static List<Card> getRandomCards(Integer size){
        List<Card> randomCardList =  new Deck().getCardsList();
        Collections.shuffle(randomCardList);
        List<Card> shuffledCards = new ArrayList<>(randomCardList.subList(0, size));
        Card lastCard = shuffledCards.get(size - 1);
        Card modifiedCard = new Card(lastCard.getType(), lastCard.getRank(), lastCard.getCardImgUrl(), true);
        shuffledCards.set(size - 1, modifiedCard);
        return shuffledCards;
    }

    public static List<Card> getExtraCards(){
        List<Card> newCards = new Deck().getCardsList();
        List<Card> extraCards = new ArrayList<>();
        extraCards.addAll(newCards);
        extraCards.addAll(newCards);
        extraCards.addAll(newCards);
        extraCards.addAll(newCards.subList(0, 11));
        Collections.shuffle(extraCards);
        return extraCards;
    }

}
