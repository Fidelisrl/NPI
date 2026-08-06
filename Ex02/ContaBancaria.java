package AT02.Poo.Ex02;

public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void mostrarSaldo(){
        System.out.println("\nSaldo Final: " + saldo);
    }
    public void depositar(double deposito){
        saldo += deposito;
    }
    public void sacar(double saque){
        if(saque <= saldo){
            saldo -= saque;
        }
    }
}
