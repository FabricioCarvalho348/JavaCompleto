package iteracao;

public class Exercicio01_Iteracao {

    public static void main(String[] args) {
        /*
        Dada a lista de números abaixo:
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        ... Itere por essa lista e imprima todos os números que são divisíveis por 3.
        Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo.
        Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.
         */

        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for (int i = 1; i < numeros.length; i++) {
            if(i % 3 == 0) {
                System.out.println("Números divisiveis por 3: " + i);
            }
        }

    }
}
