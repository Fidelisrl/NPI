package HerancaFuncionariosAt06;

public class Principal {
    static void main() {
        Gerente g1 = new Gerente("Felipe", "01", 40.900, 5000);
        Vendedor v1 = new Vendedor("Pedro", "321", 12.200, 600000, 2);
        Estagiario e1 = new Estagiario("Guilherme", "26104", 1400, "UniFil");

        System.out.println("--- Dados ---");
        System.out.println("| Gerente |");g1.apresentarDados();
        System.out.println("| Vendedor |");v1.apresentarDados();
        System.out.println("| Estagiário |");e1.apresentarDados();

        System.out.println(" | Salários ");
        System.out.println("Gerente: " + g1.calcularSalario(g1.getSalarioBase()) +
                "Vendedor: " + v1.calcularSalario(v1.getSalarioBase()) +
                "Estágiario: " + e1.calcularSalario(e1.getSalarioBase()));

        System.out.println("ATENÇÃO!!!");
        g1.realizarReuniao(); v1.registrarVenda(); e1.realizarTreinamento();

        System.out.printf("Gerente R$ %.2f%nVendedor: R$ %.2f%nEstagiário: R$ %.2f", g1.getSalarioBase(), v1.getSalarioBase(), e1.getSalarioBase());
    }
}
