package com.academy.course.lesson6.home.work;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    final static String ABC = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
    static int quantityElement = 10;

    public static void main(String[] args) {

// Task 1
        // Заполняем матрицу
        String[][] inputMatrix = getMatrix(quantityElement);

// Task 2
        String[] mainMatrixDiagonalArray = getMainMatrixDiagonalArray(inputMatrix);
        String[] secondaryMatrixDiagonalArray = getSecondaryMatrixDiagonalArray(inputMatrix);
        boolean resultComparison = Arrays.equals(mainMatrixDiagonalArray, secondaryMatrixDiagonalArray);
        System.out.println("Результат сравнения диагоналей матрицы: " + resultComparison);

        String[] matrixDiagonalArray = getMatrixDiagonalArray(mainMatrixDiagonalArray, secondaryMatrixDiagonalArray);

        for (String elementsMatrixDiagonalArray : matrixDiagonalArray) {
            System.out.print(elementsMatrixDiagonalArray + " ");
        }
        System.out.println();

// Task 3
        // Поиск и запись в StringBuilder буквенных элементов массива диагоналей матрицы
        StringBuilder sumStringResult = getStringElementsFromArray(matrixDiagonalArray);
        System.out.println("Строка с символьными элементами массива со 2 по 4 элемент: " + "\n" + sumStringResult);


        // Поиск, округление и запись в новый массив численных элементов массива диагоналей матрицы
        int[] resNumberArray = getDigitElementsFromArray(matrixDiagonalArray);

        System.out.println("Массив с округлёнными числовыми элементами массива диагоналей матрицы: ");
        printArray(resNumberArray);

// Task 4
        System.out.println("Матрица: ");
        printMatrix(inputMatrix);
    }

    // Methods
    private static String[][] getMatrix(int quantityElement) {
        String[][] matrix = new String[quantityElement][quantityElement];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j + 1) % 3 == 0) {
                    matrix[i][j] = getRandomDoubleString();
                } else {
                    matrix[i][j] = getRandomString();
                }
            }
        }

        return matrix;
    }

    private static String[] getMainMatrixDiagonalArray(String[][] matrix) {
        String[] mainMatrixDiagonalArray = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainMatrixDiagonalArray[i] = matrix[i][i];
        }

        return mainMatrixDiagonalArray;
    }

    private static String[] getSecondaryMatrixDiagonalArray(String[][] matrix) {
        String[] secondaryMatrixDiagonalArray = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            secondaryMatrixDiagonalArray[i] = matrix[i][matrix[0].length - i - 1];
        }

        return secondaryMatrixDiagonalArray;
    }

    private static String[] getMatrixDiagonalArray(String[] firstDiagonalArray, String[] secondDiagonalArray) {
        String[] resultArray = new String[firstDiagonalArray.length + secondDiagonalArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (i < firstDiagonalArray.length) {
                resultArray[i] = firstDiagonalArray[i];
            } else {
                resultArray[i] = secondDiagonalArray[i - firstDiagonalArray.length];
            }
        }

        return resultArray;
    }

    private static StringBuilder getStringElementsFromArray(String[] diagonalArray) {
        char dot = '.';
        int firstStringElement = 1;
        StringBuilder stringResult = new StringBuilder();

        for (String arrayElement : diagonalArray) {
            char symbol = arrayElement.charAt(firstStringElement);
            if (symbol != dot) {
                String stringSlice = arrayElement.substring(1, 5) + ", ";
                stringResult.append(stringSlice);
            }
        }

        return stringResult;
    }

    private static int[] getDigitElementsFromArray(String[] diagonalArray) {
        char dot = '.';
        int firstStringElement = 1;
        int doubleElementCount = 0;
        int intArrayElement;
        int numberArrayIndex = 0;

        for (String arrayElement : diagonalArray) {
            char symbol = arrayElement.charAt(firstStringElement);
            if (symbol == dot) {
                doubleElementCount++;
            }
        }

        int[] resArray = new int[doubleElementCount];
        for (String arrayElement : diagonalArray) {
            char symbol = arrayElement.charAt(firstStringElement);
            if (symbol == dot) {
                double arrayElementToDouble = Double.parseDouble(arrayElement);
                if (arrayElementToDouble >= 1.7) {
                    intArrayElement = 2;
                } else {
                    intArrayElement = 1;
                }
                resArray[numberArrayIndex] = intArrayElement;
                numberArrayIndex++;
            }
        }

        return resArray;
    }

    private static String getRandomString() {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int b = (int) (Math.random() * ABC.length());
            randomString.append(ABC.charAt(b));
        }

        return randomString.toString();
    }

    private static String getRandomDoubleString() {
        double randomDouble = Math.random() + 1;
        String doubleToString = String.valueOf(randomDouble);

        return doubleToString.substring(0, 7);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + "_");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}