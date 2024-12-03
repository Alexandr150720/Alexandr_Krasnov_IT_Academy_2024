package com.academy.course.lesson6.home.work;

import java.util.Objects;

public class Main {

    final static String ABC = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

    public static void main(String[] args) {
        String[][] inputMatrix = new String[10][10];

// Task 1
    // Заполняем матрицу
        fillMatrix(inputMatrix);

// Task 2
    // Сравниваем диагонали матрицы:
        String resultComparison = comparisonDiagonal(inputMatrix);
        System.out.println("Результат сравнения диагоналей матрицы: " + resultComparison);

    // Заносим диагонали матрицы в отдельный массив:
        String[] matrixDiagonalArray = getMatrixDiagonalArray(inputMatrix);

        System.out.println("Массив диагональных элементов матрицы: ");
        for (String elementsMatrixDiagonalArray : matrixDiagonalArray) {
            System.out.print(elementsMatrixDiagonalArray + " ");
        }
        System.out.println();

// Task 3
    // Поиск и запись в StringBuilder буквенных элементов массива диагоналей матрицы 
        char dot = '.';
        int firstStringElement = 1;
        int doubleElementCount = 0;
        StringBuilder sumStringResult  = new StringBuilder();
        
        for (String arrayElement: matrixDiagonalArray) {
            char symbol = arrayElement.charAt(firstStringElement);
            if (symbol != dot) {
                String stringSlice = arrayElement.substring(1, 5) + ", ";
                sumStringResult.append(stringSlice);
            } else doubleElementCount++;
        }
        System.out.println("Строка с символьными элементами массива со 2 по 4 элемент: ");
        System.out.println(sumStringResult);

    // Поиск, округление и запись в новый массив численных элементов массива диагоналей матрицы
        int[] resNumberArray = new int[doubleElementCount];
        int intArrayElement;
        int numberArrayIndex = 0;

        for (String arrayElement : matrixDiagonalArray) {
            char symbol = arrayElement.charAt(firstStringElement);
            if (symbol == dot) {
                double arrayElementToDouble = Double.parseDouble(arrayElement);
                if (arrayElementToDouble >= 1.7) {
                    intArrayElement = 2;
                } else {
                    intArrayElement = 1;
                }
                resNumberArray[numberArrayIndex] = intArrayElement;
                numberArrayIndex++;
            }
        }

        System.out.println("Массив с округлёнными числовыми элементами массива диагоналей матрицы: ");
        for (int i = 0; i < resNumberArray.length; i++) {
            if (i != resNumberArray.length - 1 ) {
                System.out.print(resNumberArray[i] + "_");
            } else {
                System.out.print(resNumberArray[i]);
            }
        }
        System.out.println();

// Task 4
        System.out.println("Матрица: ");
        for (String[] matrix : inputMatrix) {
            for (String s : matrix) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
    
    // Methods
    private static void fillMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j + 1) % 3 == 0) {
                    matrix[i][j] = getRandomDoubleString();
                } else {
                    matrix[i][j] = getRandomString();
                }
            }
        }
    }

    private static String comparisonDiagonal(String[][] matrix) {
        String mainMatrixDiagonal;
        String secondaryMatrixDiagonal;
        boolean resultComparison = true;
        for (int i = 0; i < matrix.length; i++) {
            mainMatrixDiagonal = matrix[i][i];
            secondaryMatrixDiagonal = matrix[i][matrix[0].length - i - 1];
            if (!Objects.equals(mainMatrixDiagonal, secondaryMatrixDiagonal)) {
                resultComparison = false;
                break;
            }
        }
        if (resultComparison) {
            return "Диагонали равны";
        } else {
            return "Диагонали не равны";
        }
    }

    private static String[] getMatrixDiagonalArray(String[][] matrix) {
        String[] matrixDiagonalArray = new String[matrix.length * 2];
        for (int i = 0; i < matrix.length; i++) {
            matrixDiagonalArray[i] = matrix[i][i];
            matrixDiagonalArray[matrix.length + i] = matrix[i][matrix[0].length - i - 1];
        }
        return matrixDiagonalArray;
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

}