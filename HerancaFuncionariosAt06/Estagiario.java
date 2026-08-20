package HerancaFuncionariosAt06;

public class Estagiario extends Funcionario{
    private String instituicaoEnsino;

    public Estagiario(String nome, String matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        if(!instituicaoEnsino.isEmpty()){
            this.instituicaoEnsino = instituicaoEnsino;
        }
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return super.calcularSalario(salarioBase);
    }
    public String realizarTreinamento(){ return "Hora do Treinamento!!!!"; }
}
