package com.academy.course.lesson8.by.academy.deck;

import com.academy.course.lesson8.by.academy.container.IContainer;

import java.util.Objects;

public class Deck implements IDeck {

    private String name;
    private IContainer[] containers;

    public Deck(String name, IContainer[] inputContainers) {
        boolean isLarge = inputContainers[0].isLarge();
        int count = 0;
        for (IContainer container : inputContainers) {
            if (container.isLarge() == isLarge) {
                count++;
            }
        }
        this.name = name;
        if (inputContainers.length == count) {
            if (isLarge && inputContainers.length < 3) {
                this.containers = inputContainers;
            } else if (!isLarge && inputContainers.length < 5) {
                this.containers = inputContainers;
            } else {
                throw new RuntimeException("Количество контейнеров должно быть либо 2 больших либо 4 маленьких");
            }
        } else {
            throw new RuntimeException("Контейнеры должны быть одного размера");
        }
    }

    public double getWaterWeight() {
        double waterWeight = 0;
        for (IContainer container : this.containers) {
            waterWeight += container.getWaterWeight();
        }

        return waterWeight;
    }

    public String getName() {
        return name;
    }

    public void addContainer(IContainer inputContainer) {
        if (this.containers[0].isLarge() && this.containers.length >= 2) {
            throw new RuntimeException("Достигнуто максимальное число контейнеров в палубе!!");
        }
        if (!this.containers[0].isLarge() && this.containers.length >= 4) {
            throw new RuntimeException("Достигнуто максимальное число контейнеров в палубе!!");
        }

        IContainer[] containers = new IContainer[this.containers.length + 1];
        if (this.containers.length == 0){
            containers[0] = inputContainer;
            this.containers = containers;
        } else if (this.containers[0].isLarge() == inputContainer.isLarge()) {
            for (int i = 0; i < this.containers.length; i++) {
                containers[i] = this.containers[i];
            }
            containers[containers.length - 1] = inputContainer;
            this.containers = containers;
        } else {
            throw new RuntimeException("Контейнеры должны быть одного размера");
        }

    }

    public void removeContainerByName(String name) {
        int matchNumber = 0;
        for (int i = 0; i < this.containers.length; i++) {
            if (Objects.equals(this.containers[i].getName(), name)) {
                matchNumber++;
                break;
            }
        }
        if (matchNumber == 0) {
            throw new RuntimeException(String.format("Контейнера с именем %s нет в палубе", name));
        }

        IContainer[] containers = new IContainer[this.containers.length - 1];
        int count = 0;
        boolean isDeleted = false;
        for (int i = 0; i < this.containers.length; i++) {
            if (!Objects.equals(this.containers[i].getName(), name) || isDeleted) {
                containers[count] = this.containers[i];
                count++;
            } else {
                isDeleted = true;
            }
        }
        this.containers = containers;
    }
}
