package com.academy.course.lesson8.by.academy.port;

import com.academy.course.lesson8.by.academy.ship.IShip;

public interface IPort {
    double getWaterWeight();
    void addShip(IShip ship);
    void removeShipByName(String name);
}
