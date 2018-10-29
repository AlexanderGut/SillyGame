package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] matrix = new int[10][10];
        int opt;
        matrix[5][5] = 1;
        showMatrix(matrix);
        while (true){

            System.out.println();
            opt = Validar.entero("opcion: ");

            switch (opt){
                case 1:
                    Move.up(matrix);
                    break;
                case 2:
                    Move.down(matrix);
                    break;
                case 3:
                    Move.right(matrix);
                    break;
                case 4:
                    Move.left(matrix);
                    break;
            }
            showMatrix(matrix);
            System.out.println();
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
