package com.academy.course.lesson8.by.academy;

import com.academy.course.lesson8.by.academy.container.Constant;
import com.academy.course.lesson8.by.academy.container.IContainer;
import com.academy.course.lesson8.by.academy.container.cone.LargeConeContainer;
import com.academy.course.lesson8.by.academy.container.cone.SmallConeContainer;
import com.academy.course.lesson8.by.academy.container.cylinder.LargeCylinderContainer;
import com.academy.course.lesson8.by.academy.container.cylinder.SmallCylinderContainer;
import com.academy.course.lesson8.by.academy.container.parallel.LargeParallelContainer;
import com.academy.course.lesson8.by.academy.container.parallel.SmallParallelContainer;
import com.academy.course.lesson8.by.academy.deck.Deck;
import com.academy.course.lesson8.by.academy.deck.IDeck;
import com.academy.course.lesson8.by.academy.port.IPort;
import com.academy.course.lesson8.by.academy.port.Port;
import com.academy.course.lesson8.by.academy.ship.IShip;
import com.academy.course.lesson8.by.academy.ship.Ship;

public class Main {

    public static void main(String[] args) {

        IContainer largeParallelContainer = new LargeParallelContainer("A", 10, Constant.SMALL_DENSITY);
        IContainer largeConeContainer = new LargeConeContainer("B", 50, Constant.LARGE_DENSITY);
        IContainer largeCylinderContainer = new LargeCylinderContainer("C", 40, Constant.LARGE_DENSITY);
        IContainer smallCylinderContainer = new SmallCylinderContainer("D",80, Constant.LARGE_DENSITY);
        IContainer smallParallelContainer = new SmallParallelContainer("E",95, Constant.SMALL_DENSITY);
        IContainer smallConeContainer = new SmallConeContainer("F",17, Constant.SMALL_DENSITY);

        IContainer largeParallelContainer1 = new LargeParallelContainer("A1", 26, Constant.LARGE_DENSITY);
        IContainer largeConeContainer1 = new LargeConeContainer("B1", 83, Constant.SMALL_DENSITY);
        IContainer largeCylinderContainer1 = new LargeCylinderContainer("C1", 19, Constant.SMALL_DENSITY);
        IContainer smallCylinderContainer1 = new SmallCylinderContainer("D1",64, Constant.SMALL_DENSITY);
        IContainer smallParallelContainer1 = new SmallParallelContainer("E1",46, Constant.LARGE_DENSITY);
        IContainer smallConeContainer1 = new SmallConeContainer("F1",75, Constant.LARGE_DENSITY);

        IContainer largeParallelContainer2 = new LargeParallelContainer("A2", 93, Constant.SMALL_DENSITY);
        IContainer largeConeContainer2 = new LargeConeContainer("B2", 95, Constant.LARGE_DENSITY);
        IContainer largeCylinderContainer2 = new LargeCylinderContainer("C2", 17, Constant.LARGE_DENSITY);
        IContainer smallCylinderContainer2 = new SmallCylinderContainer("D2",65, Constant.LARGE_DENSITY);
        IContainer smallParallelContainer2 = new SmallParallelContainer("E2",34, Constant.SMALL_DENSITY);
        IContainer smallConeContainer2 = new SmallConeContainer("F2",76, Constant.SMALL_DENSITY);

        IContainer largeParallelContainer3 = new LargeParallelContainer("A3", 100, Constant.SMALL_DENSITY);
        IContainer largeConeContainer3 = new LargeConeContainer("B3", 23, Constant.LARGE_DENSITY);
        IContainer largeCylinderContainer3 = new LargeCylinderContainer("C3", 55, Constant.LARGE_DENSITY);
        IContainer smallCylinderContainer3 = new SmallCylinderContainer("D3",81, Constant.LARGE_DENSITY);
        IContainer smallParallelContainer3 = new SmallParallelContainer("E3",20, Constant.SMALL_DENSITY);
        IContainer smallConeContainer3 = new SmallConeContainer("F3",77, Constant.SMALL_DENSITY);

        IContainer largeParallelContainer4 = new LargeParallelContainer("A4", 11, Constant.SMALL_DENSITY);
        IContainer largeConeContainer4 = new LargeConeContainer("B4", 33, Constant.LARGE_DENSITY);
        IContainer largeCylinderContainer4 = new LargeCylinderContainer("C4", 44, Constant.LARGE_DENSITY);
        IContainer smallCylinderContainer4 = new SmallCylinderContainer("D4",66, Constant.LARGE_DENSITY);
        IContainer smallParallelContainer4 = new SmallParallelContainer("E4",99, Constant.SMALL_DENSITY);
        IContainer smallConeContainer4 = new SmallConeContainer("F4",69, Constant.SMALL_DENSITY);

        System.out.println("Масса воды в одном контейнере: " + smallConeContainer4.getWaterWeight());

        IContainer[] largeContainers = new IContainer[2];
        largeContainers[0] = largeParallelContainer;
        largeContainers[1] = largeParallelContainer1;

        IContainer[] largeContainers1 = new IContainer[2];
        largeContainers1[0] = largeConeContainer;
        largeContainers1[1] = largeCylinderContainer;

        IContainer[] largeContainers2 = new IContainer[2];
        largeContainers2[0] = largeConeContainer1;
        largeContainers2[1] = largeCylinderContainer1;

        IContainer[] largeContainers3 = new IContainer[2];
        largeContainers3[0] = largeConeContainer2;
        largeContainers3[1] = largeParallelContainer2;

        IContainer[] largeContainers4 = new IContainer[1];
        largeContainers4[0] = largeCylinderContainer2;

        IContainer[] largeContainers5 = new IContainer[1];
        largeContainers5[0] = largeParallelContainer3;

        IContainer[] largeContainers6 = new IContainer[2];
        largeContainers6[0] = largeConeContainer3;
        largeContainers6[1] = largeCylinderContainer3;

        IContainer[] largeContainers7 = new IContainer[2];
        largeContainers7[0] = largeParallelContainer4;
        largeContainers7[1] = largeConeContainer4;

        IContainer[] largeContainers8 = new IContainer[1];
        largeContainers8[0] = largeCylinderContainer4;

        IContainer[] smallContainers = new IContainer[4];
        smallContainers[0] = smallCylinderContainer;
        smallContainers[1] = smallParallelContainer;
        smallContainers[2] = smallConeContainer;
        smallContainers[3] = smallCylinderContainer1;

        IContainer[] smallContainers1 = new IContainer[2];
        smallContainers1[0] = smallParallelContainer1;
        smallContainers1[1] = smallConeContainer1;

        IContainer[] smallContainers2 = new IContainer[3];
        smallContainers2[0] = smallCylinderContainer2;
        smallContainers2[1] = smallParallelContainer2;
        smallContainers2[2] = smallConeContainer2;

        IContainer[] smallContainers3 = new IContainer[2];
        smallContainers3[0] = smallParallelContainer3;
        smallContainers3[1] = smallConeContainer3;

        IContainer[] smallContainers4 = new IContainer[1];
        smallContainers4[0] = smallCylinderContainer3;

        IContainer[] smallContainers5 = new IContainer[3];
        smallContainers5[0] = smallCylinderContainer4;
        smallContainers5[1] = smallParallelContainer4;
        smallContainers5[2] = smallConeContainer4;

        IDeck deckWithLargeContainers = new Deck("A1", largeContainers);
        IDeck deckWithLargeContainers1 = new Deck("A2", largeContainers1);
        IDeck deckWithLargeContainers2 = new Deck("A3", largeContainers2);
        IDeck deckWithLargeContainers3 = new Deck("A4", largeContainers3);
        IDeck deckWithLargeContainers4 = new Deck("A5", largeContainers4);
        IDeck deckWithLargeContainers5 = new Deck("A6", largeContainers5);
        IDeck deckWithLargeContainers6 = new Deck("A7", largeContainers6);
        IDeck deckWithLargeContainers7 = new Deck("A8", largeContainers7);
        IDeck deckWithLargeContainers8 = new Deck("A9", largeContainers8);
        IDeck deckWithSmallContainers = new Deck("A10", smallContainers);
        IDeck deckWithSmallContainers1 = new Deck("A11", smallContainers1);
        IDeck deckWithSmallContainers2 = new Deck("A12", smallContainers2);
        IDeck deckWithSmallContainers3 = new Deck("A13", smallContainers3);
        IDeck deckWithSmallContainers4 = new Deck("A14", smallContainers4);
        IDeck deckWithSmallContainers5 = new Deck("A15", smallContainers5);

        System.out.println("Масса воды на палубе до удаления контейнеров: " + deckWithLargeContainers.getWaterWeight());

        deckWithLargeContainers.removeContainerByName("A");//largeParallelContainer
        deckWithLargeContainers.removeContainerByName("A1");//largeParallelContainer1 удалил из одной палубы 2 контейнера
        deckWithLargeContainers4.addContainer(largeParallelContainer);//largeParallelContainer добавил контейнер в другую палубу

        System.out.println("Масса воды на палубе после удаления контейнеров: " + deckWithLargeContainers.getWaterWeight());

        IDeck[] decks = new IDeck[1];
        decks[0] = deckWithLargeContainers;

        IDeck[] decks1 = new IDeck[2];
        decks1[0] = deckWithLargeContainers1;
        decks1[1] = deckWithLargeContainers2;

        IDeck[] decks2 = new IDeck[2];
        decks2[0] = deckWithLargeContainers3;
        decks2[1] = deckWithSmallContainers1;

        IDeck[] decks3 = new IDeck[2];
        decks3[0] = deckWithSmallContainers3;
        decks3[1] = deckWithSmallContainers4;

        IDeck[] decks4 = new IDeck[1];
        decks4[0] = deckWithLargeContainers5;

        IDeck[] decks5 = new IDeck[2];
        decks5[0] = deckWithSmallContainers;
        decks5[1] = deckWithLargeContainers4;

        IDeck[] decks6 = new IDeck[1];
        decks6[0] = deckWithSmallContainers2;

        IDeck[] decks7 = new IDeck[1];
        decks7[0] = deckWithLargeContainers6;

        IDeck[] decks8 = new IDeck[1];
        decks8[0] = deckWithLargeContainers8;

        IDeck[] decks9 = new IDeck[2];
        decks9[0] = deckWithLargeContainers7;
        decks9[1] = deckWithSmallContainers5;

        IShip ship1 = new Ship("Arcadia", decks1);
        IShip ship2 = new Ship("Titanic", decks2);
        IShip ship3 = new Ship("Bismarck", decks3);
        IShip ship4 = new Ship("Flying Dutchman", decks4);
        IShip ship5 = new Ship("Nautilus", decks5);
        IShip ship6 = new Ship("Black Pearl", decks6);
        IShip ship7 = new Ship("Argo", decks7);
        IShip ship8 = new Ship("Santa Maria", decks);
        IShip ship9 = new Ship("Queen Berry", decks8);
        IShip ship10 = new Ship("Diamond Serpent", decks9);

        System.out.println("Масса воды на корабле до удаления палубы: " + ship6.getWaterWeight());

        ship6.removeDeckByName("A12");
        ship4.addDeck(deckWithSmallContainers2);

        System.out.println("Масса воды на корабле после удаления палубы: " + ship6.getWaterWeight());

        IShip[] ships = new IShip[10];
        ships[0] = ship1;
        ships[1] = ship2;
        ships[2] = ship3;
        ships[3] = ship4;
        ships[4] = ship5;
        ships[5] = ship6;
        ships[6] = ship7;
        ships[7] = ship8;
        ships[8] = ship9;
        ships[9] = ship10;

        IPort port = new Port(ships);
        System.out.println("Масса воды в порту: " + port.getWaterWeight());

        port.removeShipByName("Argo");
        port.removeShipByName("Flying Dutchman");
        System.out.println("Масса воды в порту после удаления кораблей: " + port.getWaterWeight());

        port.addShip(ship4);
        System.out.println("Масса воды в порту после добавления корабля: " + port.getWaterWeight());
    }

}
