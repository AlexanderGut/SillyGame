package com.company;

public class ManageGame {

    public void start(){
        Tablero tab = new Tablero(20,20,10);
        Player p1 = new Player(50,Random.generarNum(tab.getROW()),Random.generarNum(tab.getCOLUMN()));
        Enemy[] e = Enemy.intstaciasEnemy(tab.getCANTIDAD_ENEMY());
        int[][] arr = tab.initTablero(p1, e);
        int opt;
        boolean exit = false;

        while (!exit){
            Tablero.showTablero(arr);
            System.out.println("-------------------------------------------");
            opt = Validar.entero("A donde quisiera mover: ");
            System.out.println("-------------------------------------------");

            switch (opt){
                case 1:
                    int r1=p1.getRowPosition() - 1;
                    int c1=p1.getColumnPosition();
                    if (arr[r1][c1] == 0)
                        Move.up(arr,p1);
                    else if (arr[r1][c1] == 30)
                        tab.combate(p1, Tablero.findEnemy(e,r1,c1));
                    break;
                case 2:
                    int r2 =p1.getRowPosition() + 1;
                    int c2 =p1.getColumnPosition();
                    if (arr[r2][c2] == 0)
                        Move.down(arr,p1);
                    else if (arr[r2][c2] == 30)
                        tab.combate(p1, Tablero.findEnemy(e,r2,c2));
                    break;
                case 3:
                    int r3=p1.getRowPosition();
                    int c3=p1.getColumnPosition() - 1;
                    if (arr[r3][c3] == 0)
                        Move.left(arr,p1);
                    else if (arr[r3][c3] == 30)
                        tab.combate(p1, Tablero.findEnemy(e,r3,c3));
                    break;
                case 4:
                    int r4=p1.getRowPosition();
                    int c4=p1.getColumnPosition() + 1;
                    if (arr[r4][c4] == 0)
                        Move.right(arr,p1);
                    else if (arr[r4][c4] == 30)
                        tab.combate(p1, Tablero.findEnemy(e,r4,c4));
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }

    }

}
