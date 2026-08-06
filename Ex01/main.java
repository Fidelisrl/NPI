package AT02.Poo.Ex01;

public class main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Chocolate", 10, 100);
        Produto produto2 = new Produto("Suco", 5, 200);
        produto1.apresentarProdutos();
        produto2.apresentarProdutos();
    }
}
