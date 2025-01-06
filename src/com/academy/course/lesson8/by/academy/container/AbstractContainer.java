package com.academy.course.lesson8.by.academy.container;

public abstract class AbstractContainer implements IContainer{

    protected String name;
    protected int height;
    protected double density;

    public AbstractContainer(String name, int height, double density) {
        if (height > 100 || height < 10 ){
            throw new RuntimeException("Высота должна быть в диапазоне от 10 до 100");
        } else {
            this.height = height;
        }
        if(density != Constant.SMALL_DENSITY && density != Constant.LARGE_DENSITY){
            throw new RuntimeException("Не верно указана плотность");
        } else {
            this.density = density;
        }
        this.name = name;
    }

    public double getWaterWeight(){
        return density * getVolume();
    }

    public abstract double getVolume();
    public abstract boolean isLarge();
    
    public String getName(){
        return name;
    }
}
