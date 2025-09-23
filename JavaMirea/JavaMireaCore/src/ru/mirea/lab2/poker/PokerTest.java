package ru.mirea.lab2.poker;

import java.util.Random;
import java.util.Scanner;

public class PokerTest {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();
        System.out.println("Введите кол-во игроков от 2 до 10");
        int playersCount;

        try {
            playersCount = Integer.parseInt(scanner.nextLine());
            if(playersCount < 2 || playersCount > 10)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Вас по-человечески просили ввести от 2 до 10))");
            return;
        }

        PokerCardSet[] players = new PokerCardSet[playersCount];
        for (int i = 0; i < playersCount; i++) {
            players[i] = new PokerCardSet();
            for (int j = 0; j < 5; j++) {
                var card = PokerCardSet.getRandomCard(random);
                while (players[i].hasCard(card)){
                    card = PokerCardSet.getRandomCard(random);
                }
                players[i].addCard(j, card);
            }
        }

        for (var player : players){
            System.out.println(player.toString());
        }
    }
}
