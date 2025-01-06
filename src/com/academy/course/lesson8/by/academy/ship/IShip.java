package com.academy.course.lesson8.by.academy.ship;

import com.academy.course.lesson8.by.academy.deck.IDeck;

public interface IShip {
    double getWaterWeight();
    String getName();
    void addDeck(IDeck deck);
    void removeDeckByName(String name);
}
