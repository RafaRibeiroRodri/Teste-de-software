public class Contas {

    static public int salario;
    static int porcentagemVt = 5;
    static int porcentagemVr = 20;


    public static int calcularsalario(int horasTrab, int valorHrs) {
        int salario = (horasTrab * valorHrs) * 22;
        int valorVt = (salario * porcentagemVt)/100;
        int valorVr = (salario * porcentagemVr)/100;
        int descontos = valorVr + valorVt;
        int salarioFinal = salario - descontos;
        return salarioFinal;
    }

}
