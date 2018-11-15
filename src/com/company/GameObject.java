package com.company;

public class GameObject {
    /*
    *  ID's
    *  Player 1 = 50
    *  Player 2 = 51
    *  Enemy 1  = 30
    *  Enemy 2  = 31
    *  Boss     = 666
    */
    protected int rowPosition;
    protected int columnPosition;
    protected boolean state;
    protected int def;
    protected int attack;
    protected int life;
    protected int GOId;

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public int getLife() {
        return life;
    }

    public int getGOId() {
        return GOId;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
