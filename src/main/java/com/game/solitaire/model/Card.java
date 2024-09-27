package com.game.solitaire.model;


import java.util.UUID;

public class Card {
    private String cardId;
    private String type;
    private String rank;
    private String cardImgUrl;
    private boolean isFlipped;

    public Card(String type, String rank, String cardImgUrl, boolean isFlipped) {
        this.cardId = UUID.randomUUID().toString();
        this.type = type;
        this.rank = rank;
        this.cardImgUrl = cardImgUrl;
        this.isFlipped = isFlipped;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCardImgUrl() {
        return cardImgUrl;
    }

    public void setCardImgUrl(String cardImgUrl) {
        this.cardImgUrl = cardImgUrl;
    }

    public boolean getIsFlipped() {
        return isFlipped;
    }

    public void setIsFlipped(boolean isFlipped) {
        this.isFlipped = isFlipped;
    }
}

