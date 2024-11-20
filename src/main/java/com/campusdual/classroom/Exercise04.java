package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

        Exercise04 ej4 = new Exercise04();
        System.out.println("sumNum = " + ej4.sumNum(5));
        System.out.println("sumEvenNum = " + ej4.sumEvenNum(20));
        System.out.println("factorial = " + ej4.factorial(7));
        System.out.println("recursiveFactorial = " + ej4.recursiveFactorial(7));


    }

    public static int sumNum(int num) {
        int resultado = 0;
        for (int i = 1; i <= num; i++){
            resultado += i;
        }
        return resultado;
    }

    public static int sumEvenNum(int num) {
        int resultado = 0;

        for (int i = num * 2; i > 0; i--){
            if(i % 2 == 0) {
                resultado += i;
            }
        }
        return resultado;
    }

    public static int factorial(int num) {
        int resultado = 1;

        for (int i = num; i > 0; i--){
            resultado = resultado * i;
        }
        return resultado;
    }



    public static int recursiveFactorial(int num) {

        if (num == 0 || num == 1) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }
}
