package AT02.Poo.Ex03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double acelerar, frear;
        int escolha = 0;
        Veiculo veiculo = new Veiculo("M3", "BMW", 200.0);
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Acelerar\n2 - Frear");
        escolha = entrada.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Quando Acelerar?");
                acelerar = entrada.nextDouble();
                veiculo.acelerar(acelerar);
                break;
            case 2:
                System.out.println("Quanto Frear?");
                frear = entrada.nextDouble();
                veiculo.frear(frear);
                break;
        
            default:
                System.out.println("Opção Inválida");
                break;
        }
        veiculo.mostrarDados();
        entrada.close();
    }
}
