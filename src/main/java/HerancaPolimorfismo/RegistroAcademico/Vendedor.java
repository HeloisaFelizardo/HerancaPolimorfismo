package HerancaPolimorfismo.RegistroAcademico;

public class Vendedor extends Funcionario implements Comissao {

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String codigoFuncional,  Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularComissao() {
        return 250.00;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão: " + calcularComissao();
    }
}
