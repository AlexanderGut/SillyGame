package com.company;

public class ManageGame {

    public void start(){
        int[][] arr = new int[10][10];
        Player p1 = new Player(50,5,5);
        arr[5][5] = 50;
        int opt;
        boolean exit = false;
        showMatrix(arr);
        while (!exit){
            opt = Validar.entero("A donde quisiera mover");
            switch (opt){
                case 1:
                    Move.up(arr,p1);
                    break;
                case 2:
                    Move.down(arr,p1);
                    break;
                case 3:
                    Move.right(arr,p1);
                    break;
                case 4:
                    Move.left(arr,p1);
                    break;
                case 5:
                    exit = true;
                    break;
            }
            showMatrix(arr);
        }
    }
    public static void showMatrix(int[][] mat){
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
