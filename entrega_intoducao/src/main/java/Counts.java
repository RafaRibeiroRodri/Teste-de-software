public class Counts {

    public int horasTrabalhadas;
    private static int vt;
    private static int vr;
    public int valorHora;

    public Counts(int salario, int horasTrabalhadas, int vr) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.vr = vr;
        this.vt = vt;
    }

    /*public static int getHorasTrabalhadas() {
        Control ctl = new Control();
        System.out.println("Insira a quantidade de horas trabalhadas: ");
        int horasTrab = ctl.nextint();
        return horasTrab;
    }
    public static int getValorHora() {
        Control ctl = new Control();
        System.out.println("Insira o valor das horas: ");
        int valorHrs = ctl.nextint();
        return valorHrs;
    }*/

    public static int getVt() {
        return vt;
    }
    public static int vr() {
        return vr;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setVt(int vt) {
        this.vt = vt;
    }

    public void setVr(int vr) {
        this.vr = vr;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

}