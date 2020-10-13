public class App {

    public static void main (String []args) {

        int horas = getHorasTrabalhadas();
        int valor = getValorHora();

        Contas contas = new Contas();

        if (horas != 0 && valor != 0) {
            int salarioLiquido = contas.calcularsalario(horas, valor);
            System.out.println("Salário líquido: " + salarioLiquido);
        } else {
            System.out.println("Horas ou valor contém dados incorretos");
        }

    }

        public static int getHorasTrabalhadas() {
            Control ctl = new Control();
            System.out.println("Insira a quantidade de horas trabalhadas: ");
            int horasTrabalhadas = ctl.nextInt();
            return horasTrabalhadas;
        }
        public static int getValorHora() {
            Control ctl = new Control();
            System.out.println("Insira o valor das horas: ");
            int valorHora = ctl.nextInt();
            return valorHora;
        }
}

