package com.exercicios.estruturasrepeticao;

//O usuário digitará x números
//O programa deve calcular quantos são pares e ímpares

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //variables
        int totalnumbers,
                pairs = 0,
                odd = 0,
                count = 0;
        double number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números quer verificar?");
        totalnumbers = scan.nextInt();

        //logic
        do {
            System.out.println("Digite um número: ");
            number = scan.nextDouble();

            if (number % 2 == 0) pairs++;
            else odd++;

            count++;
        } while (count < totalnumbers);

        //final result
        System.out.println("Dentre os " + totalnumbers + " números digitados,"
                + pairs + " são pares e " + odd + " são ímpares.");
    }
}
