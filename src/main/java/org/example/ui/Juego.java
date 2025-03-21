package org.example.ui;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduzcza con un numero la opcion que desee realizar: "+"\n"+"1. Jugador (adivina el personaje mediante letras)"+"\n"+"2.Administrador");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        do{
            switch (num){
                case 1:
                    System.out.println("");
            }
        }while(num != 0);
    }
}