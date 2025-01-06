package com.academy.course.lesson8.by.academy.ship;

import com.academy.course.lesson8.by.academy.deck.IDeck;

import java.util.Objects;

public class Ship implements IShip{

    private String name;
    private IDeck[] decks;

    public Ship(String name, IDeck[] decks) {
        if (decks.length > 2) {
            throw new RuntimeException("Количество палуб должно быть меньше 3");
        }
        this.decks = decks;
        this.name = name;
    }

    public double getWaterWeight(){
        double waterWeight = 0;
        for (IDeck deck: decks){
            waterWeight += deck.getWaterWeight();
        }

        return waterWeight;
    }

    public String getName(){
        return name;
    }

    public void addDeck(IDeck deck){
        if(this.decks.length < 2) {
            IDeck[] decks = new IDeck[this.decks.length + 1];
            for (int i = 0; i < this.decks.length; i++) {
                decks[i] = this.decks[i];
            }
            decks[decks.length - 1] = deck;
            this.decks = decks;
        } else {
            throw new RuntimeException("Достигнуто максимальное количество палуб на корабле");
        }
    }

    public void removeDeckByName(String name){
        int matchNumber = 0;
        for (int i = 0; i < this.decks.length; i++) {
            if (Objects.equals(this.decks[i].getName(), name)) {
                matchNumber++;
                break;
            }
        }
        if (matchNumber == 0) {
            throw new RuntimeException(String.format("Палубы с именем %s нет на корабле", name));
        }

        IDeck[] decks = new IDeck[this.decks.length - 1];
        int count = 0;
        boolean isDeleted = false;
        for (int i = 0; i < this.decks.length; i++) {
            if(!Objects.equals(this.decks[i].getName(), name) || isDeleted){
                decks[count] = this.decks[i];
                count++;
            } else {
                isDeleted = true;
            }
        }
        this.decks = decks;
    }
}
