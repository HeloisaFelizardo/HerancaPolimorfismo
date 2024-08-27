package HerancaPolimorfismo.RegistroAcademico;

abstract class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.00;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double rendaTotal() {
        return rendaBasica;
    }



    public String getEscolaridade() {
        return "Nenhum";
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCódigo Funcional: " + getCodigoFuncional();

    }
}