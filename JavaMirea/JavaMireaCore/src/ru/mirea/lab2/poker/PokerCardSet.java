package ru.mirea.lab2.poker;

import java.util.Objects;
import java.util.Random;

public class PokerCardSet {
    private String[] cards;

    public PokerCardSet(){
        cards = new String[5];
    }

    public void addCard(int i, String card){
        cards[i] = card;
    }

    public boolean hasCard(String card){
        for (var currentCard : cards){
            if(Objects.equals(currentCard, card))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        for (var card : cards){
            msg.append(card).append(" ");
        }
        return msg.toString();
    }





    public static String getRandomCard(Random random){
        return convertNumToType(random.nextInt(0, 4)) + convertNumToCard(random.nextInt(1, 15));
    }

    public static String convertNumToType(int type){
        return switch (type) {
            case 0 -> "Пики-";
            case 1 -> "Трефы-";
            case 2 -> "Бубны-";
            case 3 -> "Черви-";
            default -> "";
        };
    }
    public static String convertNumToCard(int value){
        if (value <= 10)
            return String.valueOf(value);
        return switch (value){
            case 11 -> "Валет";
            case 12 -> "Дама";
            case 13 -> "Король";
            case 14 -> "Туз";
            default -> "";
        };
    }
}
