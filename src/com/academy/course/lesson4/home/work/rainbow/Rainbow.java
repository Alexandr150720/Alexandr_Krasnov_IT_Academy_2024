package com.academy.course.lesson4.home.work.rainbow;


public class Rainbow {

    public final int RED_COLOR_NUM = 1;
    public final int ORANGE_COLOR_NUM = 2;
    public final int YELLOW_COLOR_NUM = 3;
    public final int GREEN_COLOR_NUM = 4;
    public final int BLUE_COLOR_NUM = 5;
    public final int INDIGO_COLOR_NUM = 6;
    public final int VIOLET_COLOR_NUM = 7;
    public final String RED_COLOR_STR = "Red";
    public final String ORANGE_COLOR_STR = "Orange";
    public final String YELLOW_COLOR_STR = "Yellow";
    public final String GREEN_COLOR_STR = "Green";
    public final String BLUE_COLOR_STR = "Blue";
    public final String INDIGO_COLOR_STR = "Indigo";
    public final String VIOLET_COLOR_STR = "Violet";
    public final String INVALID_VALUE_STR = "Invalid value";

    public String getColor(int colorNumber) {
        return switch (colorNumber) {
            case (RED_COLOR_NUM) -> RED_COLOR_STR;
            case (ORANGE_COLOR_NUM) -> ORANGE_COLOR_STR;
            case (YELLOW_COLOR_NUM) -> YELLOW_COLOR_STR;
            case (GREEN_COLOR_NUM) -> GREEN_COLOR_STR;
            case (BLUE_COLOR_NUM) -> BLUE_COLOR_STR;
            case (INDIGO_COLOR_NUM) -> INDIGO_COLOR_STR;
            case (VIOLET_COLOR_NUM) -> VIOLET_COLOR_STR;
            default -> INVALID_VALUE_STR;
        };
    }

    public String getColor(int colorNumber, int secondColorNumber) {
        if (colorNumber < RED_COLOR_NUM || colorNumber > VIOLET_COLOR_NUM)
            return INVALID_VALUE_STR;

        if (secondColorNumber < RED_COLOR_NUM || secondColorNumber > VIOLET_COLOR_NUM)
            return INVALID_VALUE_STR;

        if (colorNumber == secondColorNumber)
            return getColor(colorNumber);

        if (colorNumber < secondColorNumber && colorNumber + 1 != secondColorNumber)
            return INVALID_VALUE_STR;

        if (colorNumber > secondColorNumber && colorNumber != secondColorNumber + 1)
            return INVALID_VALUE_STR;

        return getColor(colorNumber) + "-" + getColor(secondColorNumber);
    }
}
