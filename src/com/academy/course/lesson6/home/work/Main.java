package com.academy.course.lesson6.home.work;

import java.util.Objects;

public class Main {

    final static String ABC = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

    public static void main(String[] args) {

        String[][] inputMatrix = new String[10][10];

// Task 1
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if ((i + j + 1) % 3 == 0) {
                    inputMatrix[i][j] = getRandomDoubleToString();
                } else {
                    inputMatrix[i][j] = getRandomString();
                }
            }
        }

// Task 2
        String mainMatrixDiagonal;
        String secondaryMatrixDiagonal;
        boolean resultComparison = true;
        for (int i = 0; i < inputMatrix.length; i++) {
            mainMatrixDiagonal = inputMatrix[i][i];
            secondaryMatrixDiagonal = inputMatrix[i][inputMatrix.length - 1 - i];

            if (!Objects.equals(mainMatrixDiagonal, secondaryMatrixDiagonal)) {
                resultComparison = false;
                break;
            }
        }
        System.out.println("Результат сравнения диагоналей: " + resultComparison);

        String[] matrixDiagonalsArray = new String[inputMatrix.length * 2];

        System.out.println("Массив диагональных элементов матрицы: ");
        for (int i = 0; i < inputMatrix.length * 2; i++) {
            if (i < inputMatrix.length) {
                matrixDiagonalsArray[i] = inputMatrix[i][i];
            } else {
                matrixDiagonalsArray[i] = inputMatrix[i - inputMatrix.length][inputMatrix.length * 2 - 1 - i];
            }
            System.out.print(matrixDiagonalsArray[i] + " ");
        }
        System.out.println();

// Task 3
        String arrayElement;
        char dote = '.';
        int firstStringElement = 1;
        StringBuilder sumStringResult  = new StringBuilder();
        int count = 0;

        for (int i = 0; i < matrixDiagonalsArray.length ; i++) {
            arrayElement = matrixDiagonalsArray[i];
            char symbol = arrayElement.charAt(firstStringElement);
            if(symbol != dote){
                sumStringResult.append(arrayElement.substring(1, 5) + ", ");
            } else count++;
        }
        System.out.println("Строка с символьными элементами массива со 2 по 4 элемент : ");
        System.out.println(sumStringResult);

        int[] resNumbersArray = new int[count];
        int intArrayElement;
        count = 0;
        for (int i = 0; i < matrixDiagonalsArray.length ; i++) {
            arrayElement = matrixDiagonalsArray[i];
            char symbol = arrayElement.charAt(firstStringElement);
            if(symbol == dote){
                double arrayElementToDouble = Double.parseDouble(arrayElement);
                if (arrayElementToDouble >= 1.7){
                    intArrayElement = 2;
                } else {
                    intArrayElement = 1;
                }
                resNumbersArray[count] = intArrayElement;
                count++;
            }
        }

        System.out.println("Массив с округлёнными числовыми элементами массива диагоналей: ");
        for (int i = 0; i < resNumbersArray.length; i++) {
            if (i != resNumbersArray.length - 1 ) {
                System.out.print(resNumbersArray[i] + "_");
            } else {
                System.out.print(resNumbersArray[i]);
            }
        }
        System.out.println();

// Task 4
        System.out.println("Матрица: ");
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Methods
    private static String getRandomString() {
        String randomString = "";
        for (int i = 0; i < 7; i++) {
            int b = (int) (Math.random() * ABC.length());
            randomString = randomString + ABC.charAt(b);
        }

        return randomString;
    }

    private static String getRandomDoubleToString() {
        double randomDouble = Math.random() + 1;
        String doubleToString = String.valueOf(randomDouble);

        return doubleToString.substring(0, 7);
    }

}