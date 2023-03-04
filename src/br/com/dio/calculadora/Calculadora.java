package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro Valor ");
        a = scan.nextInt();
        System.out.println("Digite o segundo Valor ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir1 = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("multi: " + multiplicar);
        System.out.println("div: " + dividir1);

    }
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
