package AT02.Poo.Ex03;

public class Veiculo {
    String modelo;
    String marca;
    Double velocidade;

    public Veiculo(String modelo, String marca, Double velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public void acelerar(double valor){
        velocidade += valor;
    }
    public void frear(double valor){

        if(velocidade > valor)
        velocidade -= valor;
    }
    public void mostrarDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidade);
    }
}
