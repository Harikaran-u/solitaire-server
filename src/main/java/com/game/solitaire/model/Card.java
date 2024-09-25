package com.game.solitaire.model;

public class Card {
    private String type;
    private String rank;
    private String cardImgUrl;
    private boolean isFlipped;

    public Card(String type, String rank, String cardImgUrl, boolean isFlipped) {
        this.type = type;
        this.rank = rank;
        this.cardImgUrl = cardImgUrl;
        this.isFlipped = isFlipped;
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

