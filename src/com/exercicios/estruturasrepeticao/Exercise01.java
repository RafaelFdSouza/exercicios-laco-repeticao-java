package com.exercicios.estruturasrepeticao;

//Pedir 5 valores, calcular a média e mostrar o maior valor

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        // variables
        double number,  sum = 0, bigger= Double.NEGATIVE_INFINITY;

        int count = 0;
        Scanner scan = new Scanner(System.in);

        // logic
        do {
            System.out.println("Digite 5 valores: ");
            number = scan.nextDouble();
            if (number > bigger) bigger = number;
            sum += number;
            count++;

        } while (count < 5);

        //showing results
        System.out.println("A média é: " + sum / 5);
        System.out.println("O maior valor é: " + bigger);
    }
}

