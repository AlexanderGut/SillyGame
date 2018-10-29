package com.company;

public class Pokemon {

     private int rowPosition;
     private int columnPosition;
     private boolean state = false;
     private int def;
     private int probability;

     Pokemon(){

     }

    public int getColumnPosition() {
        return columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }
}
