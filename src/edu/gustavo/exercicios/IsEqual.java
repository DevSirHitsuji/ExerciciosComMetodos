package edu.gustavo.exercicios;
import java.util.Scanner;


public class IsEqual {
    public static void isEqual(){
        try (Scanner leitor = new Scanner(System.in)){
            int num1 = leitor.nextInt();
            int num2 = leitor.nextInt();

            if (num1 == num2){
                System.out.println("Is equal!");
            }else{
                System.out.println("No is equal!");
            }
        }
    }
}
