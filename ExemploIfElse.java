//import java.util.Scanner;
public class ExemploIfElse{
    public static void main (String... args){
        //nome completamente qualificado da classe
                java.util.Scanner leitor = new java.util.Scanner(System.in);
        double nota; 
        System.out.println("Digite a nota");
        nota = leitor.nextDouble();
        if(nota >= 70){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}