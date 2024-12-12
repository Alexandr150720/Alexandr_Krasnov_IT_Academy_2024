package com.academy.course.lesson8.by.academy.container.cone;
import com.academy.course.lesson8.by.academy.container.AbstractContainer;
import com.academy.course.lesson8.by.academy.container.Constant;

public class SmallConeContainer extends AbstractContainer {
    public SmallConeContainer(String name, int height, double density) {
        super(name, height, density);
    }

    public double getVolume(){
        return this.height * Constant.PI * Math.pow(Constant.SMALL_CONTAINER_DIAMETER, 2) / 4 / 3;
    }

    public boolean isLarge(){
        return false;
    }
}
