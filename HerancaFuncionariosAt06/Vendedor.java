package HerancaFuncionariosAt06;

public class Vendedor extends Funcionario{
    private double valorVendas;
    private double porcentualComissao;

    public Vendedor(String nome, String matricula, double salarioBase, double valorVendas, double porcentualComissao) {
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.porcentualComissao = porcentualComissao;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        double comissao = valorVendas * (porcentualComissao/100);
        if(valorVendas >= 0 && porcentualComissao >= 0 && porcentualComissao <= 100){
            return super.calcularSalario(salarioBase) + comissao;
        } else{
            return -1;
        }
    }

    public String registrarVenda(){ return "Venda Registrada!!!"; }
}
