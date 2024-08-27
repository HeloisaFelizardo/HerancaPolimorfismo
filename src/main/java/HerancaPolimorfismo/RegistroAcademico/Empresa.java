package HerancaPolimorfismo.RegistroAcademico;

public class Empresa {
    public static void main(String[] args) {

        Funcionario funcionario1 = new EnsinoBasico("João", "001", "Escola Básica A");
        Funcionario funcionario2 = new EnsinoBasico("Maria", "002", "Escola Básica B");
        Funcionario funcionario3= new EnsinoBasico("José", "003", "Escola Básica C");
        Funcionario funcionario4 = new EnsinoBasico("Ana", "004", "Escola Básica D");

        Funcionario funcionario5 = new EnsinoMedio("Carlos", "005", "Escola Básica E", "Escola Média A");
        Funcionario funcionario6 = new EnsinoMedio("Fernanda", "006", "Escola Básica F", "Escola Média B");
        Funcionario funcionario7 = new EnsinoMedio("Rafael", "007", "Escola Básica G", "Escola Média C");
        Funcionario funcionario8 = new EnsinoMedio("Clara", "008", "Escola Básica H", "Escola Média D");

        Funcionario funcionario9 = new Graduacao("Pedro", "009", "Escola Básica I", "Escola Média E", "Universidade X");
        Funcionario funcionario10 = new Graduacao("Luiza", "010", "Escola Básica J", "Escola Média F", "Universidade Y");

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3, funcionario4, funcionario5, funcionario6, funcionario7, funcionario8, funcionario9, funcionario10};

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario func : funcionarios) {
            double renda = func.rendaTotal();
            custoTotal += renda;

            switch (func.getEscolaridade()) {
                case "Ensino Básico":
                    custoEnsinoBasico += renda;
                    break;
                case "Ensino Médio":
                    custoEnsinoMedio += renda;
                    break;
                case "Graduação":
                    custoGraduacao += renda;
                    break;
            }
        }

        System.out.println();
        System.out.printf("Custo Total da Empresa: R$ %.2f%n", custoTotal);
        System.out.printf("Custo com Ensino Básico: R$ %.2f%n", custoEnsinoBasico);
        System.out.printf("Custo com Ensino Médio: R$ %.2f%n", custoEnsinoMedio);
        System.out.printf("Custo com Graduação: R$ %.2f%n", custoGraduacao);

    }
}
