package edu.gustavo.exercicios;
import java.util.Scanner;

public class BuscaSequencial {
    public static void buscaSequencial(){
        try (Scanner scan = new Scanner(System.in);) {
            int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
            int X = scan.nextInt();

            int i = 0;
            for (int elemento : elementos) {
                if (elemento == X){
                    System.out.println("Achei " + X + " na posicao " + i);
                    break;
                }
                if ((i+1) == elementos.length){
                    System.out.println("Numero " + X + " nao encontrado!");
                }
                i++;
            }
            
        }
    }
}
