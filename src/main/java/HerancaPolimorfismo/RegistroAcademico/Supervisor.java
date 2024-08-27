package HerancaPolimorfismo.RegistroAcademico;

public class Supervisor extends Funcionario implements Comissao  {

    public Supervisor() {
        super();
    }

    public Supervisor(String nome, String codigoFuncional,  Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularComissao() {
        return 600.00;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão: " + calcularComissao();
    }
}
