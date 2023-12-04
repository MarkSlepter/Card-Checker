package com.teachmeskills.lesson10;

public class Runner {
    
    public static void main(String[] args) {
        Card firstCard = new Card("1234567890", 123, 1224.0);
        Card secondCard = new Card("1234567890", 123, 123460.18);
        Card thirdCard = new Card("0987765441", 678, 30.0);
        Card fourthCard = new Card("5678902345", 100, 1456.23);
        Client client = new Client(new Card[] {firstCard, secondCard, thirdCard, fourthCard,});
        int countDuplicateCards = client.getCountDuplicateCards();
    }
    
}
