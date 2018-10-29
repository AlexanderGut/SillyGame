package com.company;

public class PlayerPosition {

    private static int rowPosition;
    private static int columnPosition;
    private static boolean state = false;



    public static void setRowPositionPlayer(int row){
        rowPosition = row;
    }

    public static void setColumnPositionPlayer(int column){
        columnPosition = column;
    }

    public static void setState(boolean st){ state = st; }

    public static int getPlayerRow(){
        return rowPosition;
    }

    public static int getPlayerColumn(){
        return columnPosition;
    }

    public static boolean getState(){ return state; }

    public static void findPlayerPosition(int[][] arr){
        for (int i = 0;i < arr[0].length;i++){
            for (int j = 0;j < arr[1].length;j++){
                if (arr[i][j] == 1){
                    setRowPositionPlayer(i);
                    setColumnPositionPlayer(j);
                    state = true;
                }
            }
        }
    }



}
