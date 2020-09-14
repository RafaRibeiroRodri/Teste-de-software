public class App {

    public static void main (String []args) {

        int horas = 6;
        int valor = 5;
        int salario = Contas.calcularsalario(6, 5);


        Contas contas = new Contas();

        if (horas != 0 && valor != 0) {
            int salarioLiquido = salario;
            System.out.println("Salário líquido: " + salarioLiquido);
        } else {
            System.out.println("Horas ou valor contém dados incorretos");
        }
    }
}

