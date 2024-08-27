package HerancaPolimorfismo.RegistroAcademico;

public class ImprimirFuncionarios {
    public static void main(String[] args) {

        Comissao salarioGerente = new Gerente();
        Funcionario gerente = new Gerente("Aline", "102", salarioGerente);

        Comissao salarioSupervisor = new Supervisor();
        Funcionario supervisor1 = new Supervisor("Joao", "103", salarioSupervisor);
        Funcionario supervisor2 = new Supervisor("Maria", "104", salarioSupervisor);

        Comissao salarioVendedor = new Vendedor();
        Funcionario vendedor1 = new Vendedor("Jose", "105", salarioVendedor);
        Funcionario vendedor2 = new Vendedor("Francisco", "106", salarioVendedor);
        Funcionario vendedor3 = new Vendedor("Joaquim", "107", salarioVendedor);
        Funcionario vendedor4 = new Vendedor("Ana", "108", salarioVendedor);
        Funcionario vendedor5 = new Vendedor("Raquel", "109", salarioVendedor);
        Funcionario vendedor6 = new Vendedor("Valeria", "110", salarioVendedor);
        Funcionario vendedor7 = new Vendedor("Marcos", "111", salarioVendedor);

        Funcionario[] funcionarios = {gerente, supervisor1, supervisor2, vendedor1, vendedor2, vendedor3, vendedor4, vendedor5, vendedor6, vendedor7};

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println();
        }

    }
}
