package Poo;

public class main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcelo", 
        "Programação", 
        50
    );
    aluno1.apresentarDados(); //Aqui eu puxo o apresentarDados da Class Aluno.

    if(aluno1.verificarMaiorIdade()){ //Puxo o verificarIdade que retorna o Boolean True ou False e ai se for verdade printa o if.
        System.out.println("O Aluno é maior de Idade!");
    } else{
        System.out.println("O Aluno é menor de Idade.");
    }
    
    }
}
