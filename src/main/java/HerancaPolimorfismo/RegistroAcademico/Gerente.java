package HerancaPolimorfismo.RegistroAcademico;

public class Gerente extends Funcionario implements Comissao {

    public Gerente() {
        super();
    }

    public Gerente(String nome, String codigoFuncional,  Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularComissao() {
        return 1500.00;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão: " + calcularComissao();
    }
}
