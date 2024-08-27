package HerancaPolimorfismo.RegistroAcademico;

abstract class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica;
    protected Comissao comissao;

    public Funcionario() {
    }

    public Funcionario(String nome,Comissao comissao) {
        this.nome = nome;
        this.rendaBasica = 1000.00;
        this.comissao = comissao;
    }

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.00;
        this.comissao = null;
    }

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.00;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double rendaTotal() {
        return rendaBasica + (comissao != null ? comissao.calcularComissao() : 0);
    }

    public String getEscolaridade() {
        return "Nenhum";
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCódigo Funcional: " + getCodigoFuncional() +
                "\nSalário Total: R$" + rendaTotal();

    }
}