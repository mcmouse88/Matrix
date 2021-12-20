package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        Matrix matrix = new Matrix(colors, SIZE);
        matrix.printMatrix(matrix);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите \"right\" для поворота направо или \"left\" для поворота налево");
        String turn = scanner.nextLine();
        System.out.println("Выберите угол поворота равный - 90/180/270 градусов");
        String anger = scanner.nextLine();
        matrix.rotateMatrix(anger, turn);
        matrix.printMatrix(matrix);
    }
}



