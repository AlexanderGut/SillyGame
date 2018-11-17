package com.company;

public class Tablero {

    private final int ROW;
    private final int COLUMN;
    private final int CANTIDAD_ENEMY;
    private int[][] tablero;
    Tablero(int row, int column, int cantidadE){
        this.ROW = row;
        this.COLUMN = column;
        this.CANTIDAD_ENEMY = cantidadE;
    }

    public int getROW() {
        return ROW;
    }

    public int getCOLUMN() {
        return COLUMN;
    }

    public int getCANTIDAD_ENEMY() {
        return CANTIDAD_ENEMY;
    }

    public int[][] initTablero(GameObject p1, Enemy[] e){
        int[][] Tablero = new int[ROW][COLUMN];
        desplegarPlayer(Tablero, p1);
        desplegarEnemys(Tablero, e);
        return Tablero;
    }

    public static void showTablero(int[][] mat){
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                if (mat[i][j] == 0)
                    System.out.print("|\t");
                else if (mat[i][j] == 30)
                    System.out.print("| X\t");
                else if (mat[i][j] == 50)
                    System.out.print("| P\t");
                else if (mat[i][j] == 666)
                    System.out.print("| B\t");
                if (j == mat.length - 1)
                    System.out.print("|");
                // System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void desplegarPlayer(int[][] m, GameObject p1){
        m[p1.getRowPosition()][p1.getColumnPosition()] = p1.getGOId();
    }

    public void desplegarEnemys(int[][] m, Enemy[] e){
        for (int i = 0; i < CANTIDAD_ENEMY; i++) {
            int row = Random.generarNum(m[0].length);
            int column = Random.generarNum(m[1].length);
            e[i].setRowPosition(row);
            e[i].setColumnPosition(column);
            //e[i].getDetails();
            while (true){
                if (m[row][column] == 0) {
                    m[row][column] = e[i].getGOId();
                    break;
                }
                else{
                    row = Random.generarNum(m[0].length);
                    column = Random.generarNum(m[1].length);
                }
            }
        }
    }

    public void combate(GameObject p1, Enemy e){
        System.out.println("Te has encontrado con: ");
        boolean exit=false;
        while (!exit) {
            e.getDetails();
            System.out.println("------");
            System.out.println("Versus");
            System.out.println("------");
            p1.getDetails();
            System.out.println();
            System.out.println("Que deseas hacer: ");
            System.out.println("1- Atacar");
            System.out.println("2- Escapar");
            System.out.println();
            int opt = Validar.entero("Ingrese una opción: ");
            int a = 0;
            switch (opt){
                case 1:
                    if (p1.getAttack() < e.getDef()) {
                        e.setDef(e.getDef() - p1.getAttack());
                    }
                    else if(p1.getAttack() > e.getDef()) {
                        a = p1.getAttack() - e.getDef();
                        e.setDef(0);
                        e.setLife(e.getLife() - a);
                        if (e.getLife() <= 0) {
                            e.setState(false);
                            exit = true;
                        }
                    }
                    System.out.println("El enemigo contraataca");
                    if (e.getAttack() < p1.getDef()) {
                        p1.setDef(p1.getDef() - e.getAttack());
                    }
                    else if(e.getAttack() > p1.getDef()) {
                        a = e.getAttack() - p1.getDef();
                        p1.setDef(0);
                        p1.setLife(e.getLife() - a);
                        if (p1.getLife() <= 0) {
                            p1.setLife(0);
                            p1.setState(false);
                            exit = true;
                        }
                    }
                    break;

            }

        }

    }

    public static Enemy findEnemy(Enemy[] e,int r, int c){
        int index = 0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getRowPosition() == r && e[i].getColumnPosition() == c)
                index = i;
        }
        return e[index];
    }
}
