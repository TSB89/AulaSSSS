package treino;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");
        
        scanner.close();
    }
}