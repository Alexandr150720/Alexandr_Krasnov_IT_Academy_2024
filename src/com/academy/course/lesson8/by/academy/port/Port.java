package com.academy.course.lesson8.by.academy.port;

import com.academy.course.lesson8.by.academy.ship.IShip;

import java.util.Objects;

public class Port implements IPort{

    IShip[] ships;

    public Port(IShip[] inputShips){
        if (inputShips.length > 10) {
            throw new RuntimeException("Кораблей в порту должно быть меньше 11");
        }
        this.ships = inputShips;
    }

    public double getWaterWeight(){
        double waterWeight = 0;
        for (IShip ship: ships){
            waterWeight += ship.getWaterWeight();
        }

        return waterWeight;
    }

    public void addShip(IShip ship){
        if(this.ships.length < 10) {
            IShip[] ships = new IShip[this.ships.length + 1];
            for (int i = 0; i < this.ships.length; i++) {
                ships[i] = this.ships[i];
            }
            ships[ships.length - 1] = ship;
            this.ships = ships;
        } else {
            throw new RuntimeException("Достигнуто максимальное количество кораблей в порту");
        }
    }

    public void removeShipByName(String name){
        int matchNumber = 0;
        for (int i = 0; i < this.ships.length; i++) {
            if (Objects.equals(this.ships[i].getName(), name)) {
                matchNumber++;
                break;
            }
        }
        if (matchNumber == 0) {
            throw new RuntimeException(String.format("Корабля с именем %s нет в порту", name));
        }

        IShip[] ships = new IShip[this.ships.length - 1];
        int count = 0;
        boolean isDelete = false;
        for (int i = 0; i < this.ships.length; i++) {
            if(!Objects.equals(this.ships[i].getName(), name) || isDelete){
                ships[count] = this.ships[i];
                count++;
            } else {
                isDelete = true;
            }
        }
        this.ships = ships;
    }
}
