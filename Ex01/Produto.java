package AT02.Poo.Ex01;

public class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque){ //Essa Função eh o contrutor.
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    } 
    public void apresentarProdutos(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }
}
