package com.academy.course.lesson8.by.academy.container.parallel;
import com.academy.course.lesson8.by.academy.container.AbstractContainer;
import com.academy.course.lesson8.by.academy.container.Constant;

public class SmallParallelContainer extends AbstractContainer {
    public SmallParallelContainer(String name, int height, double density) {
        super(name, height, density);
    }

    public double getVolume(){
        return this.height * Math.pow(Constant.SMALL_CONTAINER_DIAGONAL, 2) / 2;
    }

    public boolean isLarge(){
        return false;
    }
}
