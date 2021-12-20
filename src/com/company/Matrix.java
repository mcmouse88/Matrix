package com.company;

import java.util.Random;

public class Matrix {
    int size;
    int[][] colors;

    public Matrix(int[][] colors, int size) {
        this.colors = colors;
        this.size = size;
        Random random = new Random();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.colors[i][j] = random.nextInt(256);
            }
        }
    }

    public void rotateMatrix(String anger, String turn) {
        int operation = 1;
        switch (anger) {
            case "90":
                operation = 1;
                break;
            case "180":
                operation = 2;
                break;
            case "270":
                operation = 3;
                break;
            default:
                System.out.println("Неправильно выбран угол");
                break;
        }
        if (turn.equals("right")) {
            for (int i = 0; i < operation; i++) {
                rotateRight();
            }
        }
        else if (turn.equals("left")) {
            for (int i = 0; i < operation; i++) {
                rotateLeft();
            }
        } else {
            System.out.println("Неправильное значение");
            return;
        }
    }
    public void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.size; i++) {
            for (int j = 0; j < matrix.size; j++) {
                System.out.printf("%4d", matrix.colors[i][j]);
            }
            System.out.println();
        }
    }

    public void rotateRight() {
        int[][] rotateColors = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotateColors[j][size - i - 1] = colors[i][j];
            }
        }
        this.colors = rotateColors;
    }

    public void rotateLeft() {
        int[][] rotateColors = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotateColors[size - j - 1][i] = colors[i][j];
            }
        }
        this.colors = rotateColors;
    }
}