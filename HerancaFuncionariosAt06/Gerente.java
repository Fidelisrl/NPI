package HerancaFuncionariosAt06;

public class Gerente extends Funcionario{
    private double valorBonus;

    public Gerente(String nome, String matricula, double salarioBase, double valorBonos) {
        super(nome, matricula, salarioBase);
        this.valorBonus = valorBonos;
    }


    @Override
    public double calcularSalario(double salarioBase) {
        if(valorBonus > 0){
            return super.calcularSalario(salarioBase) + valorBonus;
        } else{
            return -1;
        }
    }

    public String realizarReuniao(){ return "Hora da Reunião!!!!"; }
}
