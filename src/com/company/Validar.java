package com.company;
import java.util.Scanner;
public class Validar {

    static Scanner entrada = new Scanner(System.in);

    public static int entero(String msg){
        int dato = 0;

        while (true){
            try {
                System.out.print(msg);
                dato = entrada.nextInt();
                break;
            }
            catch(Exception e){
                System.err.println("Dato no valido.");
                entrada.next();
            }
        }

        return dato;
    }

    public static int enteroRango(String msg, int min, int max){
        int dato = 0;

        while (true){
            try {
                System.out.print(msg);
                dato = entrada.nextInt();
                if (dato >= min && dato <= max){
                    break;
                }
                else{
                    System.out.println("El dato ingresado está fuera de rango.");
                }
            }
            catch(Exception e){
                System.err.println("Dato no valido.");
                entrada.next();
            }
        }

        return dato;
    }
}
