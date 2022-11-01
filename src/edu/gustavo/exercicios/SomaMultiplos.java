package edu.gustavo.exercicios;
import java.util.Scanner;

public class SomaMultiplos {
    public static void somaMultiplos(){
        try (Scanner input = new Scanner(System.in)){
            int A = input.nextInt();
            int N = input.nextInt();
            int result = 0;
            int copyA = A;
            
            while (A <= N){
                result = result + A;
                A += copyA;
            }

            System.out.println(result);
        }
    }
}
