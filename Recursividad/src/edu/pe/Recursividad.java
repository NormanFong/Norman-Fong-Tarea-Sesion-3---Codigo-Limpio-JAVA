package edu.pe;

public class Recursividad {

	static int factorial(int fact) {
        if (fact>0) {
            int valor=fact * factorial(fact-1);
            return valor;
        } else
            return 1;
    }
    
    public static void main(String[] ar) {
         int numero =5;
        int f=factorial(numero);
        System.out.println("El factorial de "+numero+" es "+f);
    }
    
}
