package HerancaFuncionariosAt06;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
        if(!matricula.isEmpty()){
            this.matricula = matricula;
        }
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(!matricula.isEmpty()){
            this.matricula = matricula;
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase > 0){
            this.salarioBase = salarioBase;
        }
    }

    public double calcularSalario(double salarioBase){
        return salarioBase;
    }

    public void apresentarDados(){
        System.out.println("Nome: " + nome + "\nMatrícula: " + matricula);
    }
}
