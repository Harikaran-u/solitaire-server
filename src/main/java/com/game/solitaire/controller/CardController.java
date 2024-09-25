package com.game.solitaire.controller;
import com.game.solitaire.model.Card;
import com.game.solitaire.model.Deck;
import com.game.solitaire.model.GameRoom;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;

@Controller
public class CardController {

    @MessageMapping("/cards")
    @SendTo("/topic/cardList")
    public HashMap<Integer, List<Card>> sendCardList() throws Exception {
        return new GameRoom().getPilesCardList();
    }

}
