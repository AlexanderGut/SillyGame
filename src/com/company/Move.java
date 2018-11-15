package com.company;

public class Move {

    public static void up(int[][] matrix, GameObject object){
        move('u',matrix,object);
    }

    public static void down(int[][] matrix, GameObject object){
        move('d',matrix,object);
    }

    public static void right(int[][] matrix, GameObject object){
        move('r',matrix,object);
    }

    public static void left(int[][] matrix, GameObject object){
        move('l',matrix,object);
    }

    private static void move(char opt, int[][] matrix, GameObject object){
        int row = object.getRowPosition();
        int column = object.getColumnPosition();
        int GOId = object.getGOId();

        switch(opt){
            case 'u':
                if (checkUp(matrix, object)){
                    matrix[row][column] = 0;
                    matrix[row - 1][column] = GOId;
                    object.setRowPosition(--row);
                    System.out.println(object.getRowPosition());
                }
                else{
                    checkObject(matrix, object);
                }
                break;
            case 'd':
                if (checkDown(matrix, object)){
                    matrix[row][column] = 0;
                    matrix[row + 1][column] = GOId;
                    object.setRowPosition(++row);
                }
                else{
                    checkObject(matrix, object);
                }
                break;
            case 'r':
                if (checkRight(matrix, object)){
                    matrix[row][column] = 0;
                    matrix[row][column + 1] = GOId;
                    object.setColumnPosition(++column);
                }
                else{
                    checkObject(matrix, object);
                }
                break;
            case 'l':
                if (checkLeft(matrix, object)){
                    matrix[row][column] = 0;
                    matrix[row][column -1 ] = GOId;
                    object.setColumnPosition(--column);
                }
                else{
                    checkObject(matrix, object);
                }
                break;
        }
    }

    public static void randomMove(int[][] matrix, GameObject object ){

    }

    private static boolean checkUp(int[][] mt, GameObject object){
        int row = object.getRowPosition();
        int column = object.getColumnPosition();
        boolean val;
        while (true){
            try{
                mt[row - 1][column] = mt[row - 1][column];
                val = true;
                break;
            }
            catch(ArrayIndexOutOfBoundsException e){
                val = false;
                break;
            }
        }
        return val;
    }
    public static boolean checkDown(int[][] mt, GameObject object){
        int row = object.getRowPosition();
        int column = object.getColumnPosition();
        boolean val;
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
    public static boolean checkRight(int[][] mt, GameObject object){
        int row = object.getRowPosition();
        int column = object.getColumnPosition();
        boolean val;
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
    public static boolean checkLeft(int[][] mt, GameObject object){
        int row = object.getRowPosition();
        int column = object.getColumnPosition();
        boolean val;
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

    private static void checkObject(int[][] matrix, GameObject object){
        int GOId = object.getGOId();
        if(GOId == 50 || GOId ==51) {
            System.err.println("El movimiento está fuera de rango.");
        }
        if (GOId == 30 || GOId == 31 || GOId == 666){
            randomMove(matrix, object);
        }
    }
}
