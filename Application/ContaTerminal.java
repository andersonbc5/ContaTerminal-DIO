package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("informe o saldo: ");
        double saldo = sc.nextDouble();

        Conta conta = new Conta(numero, agencia, nome, saldo);

        System.out.println();
        System.out.println(conta);




        sc.close();
    }
}