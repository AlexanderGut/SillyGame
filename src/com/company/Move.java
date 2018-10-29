package com.company;

public class Move {

    public static void up(int[][] matrix){
        int row;
        int column;
        if (checkUp(matrix)){
            row = PlayerPosition.getPlayerRow();
            column = PlayerPosition.getPlayerColumn();
            matrix[row][column] = 0;
            matrix[row - 1][column] = 1;
            PlayerPosition.setRowPositionPlayer(row - 1);
        }

    }
    public static void down(int[][] matrix){
        int row;
        int column;
        if (checkDown(matrix)){
            row = PlayerPosition.getPlayerRow();
            column = PlayerPosition.getPlayerColumn();
            matrix[row][column] = 0;
            matrix[row + 1][column] = 1;
            PlayerPosition.setRowPositionPlayer(row + 1);
        }

    }
    public static void right(int[][] matrix){
        int row;
        int column;
        if (checkRight(matrix)){
            row = PlayerPosition.getPlayerRow();
            column = PlayerPosition.getPlayerColumn();
            matrix[row][column] = 0;
            matrix[row][column + 1] = 1;
            PlayerPosition.setColumnPositionPlayer(column + 1);
        }

    }
    public static void left(int[][] matrix){
        int row;
        int column;
        if (checkLeft(matrix)){
            row = PlayerPosition.getPlayerRow();
            column = PlayerPosition.getPlayerColumn();
            matrix[row][column] = 0;
            matrix[row][column - 1] = 1;
            PlayerPosition.setColumnPositionPlayer(column - 1);
        }

    }

    private static boolean checkUp(int[][] mt){
        int row;
        int column;
        boolean val;
        while (true) {
            if (PlayerPosition.getState()) {
                row = PlayerPosition.getPlayerRow();
                column = PlayerPosition.getPlayerColumn();
                break;
            }
            else {
                PlayerPosition.findPlayerPosition(mt);
            }
        }

        while (true){
            try{
                mt[row - 1][column] = mt[row - 1][column];
                val = true;
                break;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("El movimiento esta fuera de rango.");
                val = false;
                break;
            }
        }
        return val;
    }
    public static boolean checkDown(int[][] mt){
        int row;
        int column;
        boolean val;
        while (true) {
            if (PlayerPosition.getState()) {
                row = PlayerPosition.getPlayerRow();
                column = PlayerPosition.getPlayerColumn();
                break;
            }
            else {
                PlayerPosition.findPlayerPosition(mt);
            }
        }

        while (true){
            try{
                mt[row + 1][column] = mt[row + 1][column];
                val = true;
                break;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("El movimiento esta fuera de rango.");
                val = false;
                break;
            }
        }
        return val;
    }
    public static boolean checkRight(int[][] mt){
        int row;
        int column;
        boolean val;
        while (true) {
            if (PlayerPosition.getState()) {
                row = PlayerPosition.getPlayerRow();
                column = PlayerPosition.getPlayerColumn();
                break;
            }
            else {
                PlayerPosition.findPlayerPosition(mt);
            }
        }

        while (true){
            try{
                mt[row][column + 1] = mt[row][column + 1];
                val = true;
                break;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("El movimiento esta fuera de rango.");
                val = false;
                break;
            }
        }
        return val;
    }
    public static boolean checkLeft(int[][] mt){
        int row;
        int column;
        boolean val;
        while (true) {
            if (PlayerPosition.getState()) {
                row = PlayerPosition.getPlayerRow();
                column = PlayerPosition.getPlayerColumn();
                break;
            }
            else {
                PlayerPosition.findPlayerPosition(mt);
            }
        }

        while (true){
            try{
                mt[row][column - 1] = mt[row][column - 1];
                val = true;
                break;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("El movimiento esta fuera de rango.");
                val = false;
                break;
            }
        }
        return val;
    }
}
