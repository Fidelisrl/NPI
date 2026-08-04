package Poo;

public class Aluno { //Aqui é a Classe
    String nome;
    String curso;
    int idade;

    public Aluno(String nome, String curso, int idade){ //Aqui eh o construtor
        this.nome = nome; //O This puxa o Nome da Variavel Global e não a que está na função
        this.curso = curso;
        this.idade = idade;
    }

    public void apresentarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
    }

    public boolean verificarMaiorIdade(){
        return idade >= 18; //Se for maior ou igual a 18 returna TRUE.
    }
}
