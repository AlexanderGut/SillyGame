package com.company;

public class Random {
    // Implementación basica
    // genera un numero random desde 0 a max
    public static int generarNum(int max){
        int num = 0;
        max += 1;
        num = (int)(Math.random() * (max));
        return num;
    }
    // Generar numero random desde min a max
    // revisar
    public static int generarNum(int min, int max){
        int num = (int)(Math.random()*(max-min+1)+min);
        return num;
    }

    // Genera un 0 o un 1 y entrega un resultado booleano

    public static  boolean generarBoolean(){
        int num;
        boolean bool;
        num = generarNum(1);

        if(num == 1){
            bool = true;
        }
        else{
            bool = false;
        }
        return bool;
    }

}
