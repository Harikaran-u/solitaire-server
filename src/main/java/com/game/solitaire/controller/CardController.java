package com.game.solitaire.controller;
import com.game.solitaire.model.Card;
import com.game.solitaire.model.Deck;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CardController {

    @MessageMapping("/cards")
    @SendTo("/topic/cardList")
    public List<Card> sendCardList() throws Exception {
        return new Deck().getCardsList();
    }

}
