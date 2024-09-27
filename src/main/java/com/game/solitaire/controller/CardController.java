package com.game.solitaire.controller;
import com.game.solitaire.model.Card;
import com.game.solitaire.model.GameRoom;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;

@Controller
public class CardController {

    @MessageMapping("/cards/piles")
    @SendTo("/topic/cardList")
    public HashMap<Integer, List<Card>> sendCardList() throws Exception {
        return new GameRoom().getPilesCardList();
    }

    @MessageMapping("/cards/extra")
    @SendTo("/topic/extraCards")
    public List<Card> sendExtraCards() throws Exception {
        return new GameRoom().getExtraCards();
    }

    @MessageMapping("/cards/updated")
    @SendTo("/topic/updatedCards")
    public HashMap<Integer, List<Card>> getUpdatedCards(HashMap<Integer, List<Card>> updatedPiles) throws Exception {
        GameRoom newGameRoom = new GameRoom();
        newGameRoom.setPilesCardList(updatedPiles);
        return newGameRoom.getPilesCardList();
    }
}
