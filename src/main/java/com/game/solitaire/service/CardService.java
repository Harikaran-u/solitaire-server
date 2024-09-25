package com.game.solitaire.service;

import com.game.solitaire.model.Card;
import com.game.solitaire.model.Deck;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    public List<Card> getCards(){
        return new Deck().getCardsList();
    }
}
