package AT02.Poo.Ex02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double saque, deposito;
        int escolha = 0;
        ContaBancaria conta = new ContaBancaria("Felipe" , 1, 2000);
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("1 - Sacar \n2 - Depositar ");
        escolha = entrada.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Valor do Saque: ");
                saque = entrada.nextDouble();
                conta.sacar(saque);
                break;
            case 2:
                System.out.println("Valor Do Depósito: ");
                deposito = entrada.nextDouble();
                conta.depositar(deposito);
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
        conta.mostrarSaldo();
        entrada.close();
    }
}
