package com.company;

public class Player extends GameObject {

    Player(int id, int row, int column, int v, int def, int a){
        this.GOId = id;
        this.rowPosition = row;
        this.columnPosition = column;
        this.life = v;
        this.def = def;
        this.attack = a;
        this.state = true;
    }

    public void getDetails(){
        System.out.println("Los datos de tu personaje son: ");
        System.out.println("-----------------");
        System.out.println("Vida:    " + life);
        System.out.println("Ataque:  " + attack);
        System.out.println("Defensa: " + def);
        System.out.println("Fila:    " + rowPosition);
        System.out.println("Columna: " +columnPosition);
        System.out.println();
    }
}
