package com.teachmeskills.lesson10;

public class Client {
    private Card[] cards;
    public Client(String cardNumber, int cvc, double balanceOnCard) {
    }

    public Client(Card[] cards) {
        this.cards = cards;
    }

    int countDuplicateCards = 0;

    public int getCountDuplicateCards() {
        if (cards.length == 0) {
            System.out.println("There are no duplicates");
            return 0;
        }

        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].CVC() == cards[j].CVC() &&
                        cards[i].cardNumber().equals(cards[j].cardNumber())) {
                    countDuplicateCards++;
                    break;
                }
            }
        }

        if (countDuplicateCards == 0) {
            System.out.println("There are no duplicates");
        } else {
            System.out.println("Client has " + countDuplicateCards + " duplicate cards");
        }
        return countDuplicateCards;
    }

}
