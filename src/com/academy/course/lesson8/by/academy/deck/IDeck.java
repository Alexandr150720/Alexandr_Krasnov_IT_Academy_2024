package com.academy.course.lesson8.by.academy.deck;

import com.academy.course.lesson8.by.academy.container.IContainer;

public interface IDeck {
    double getWaterWeight();
    String getName();
    void addContainer(IContainer container);
    void removeContainerByName(String name);
}
