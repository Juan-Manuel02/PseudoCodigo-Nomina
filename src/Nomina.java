public class Nomina {
    private double nHoras;
    private double tarifaHoras;
    private double salarioBruto;
    private final double D_DEUDA_SOCIAL = 3.46;
    private final double D_NO_COMUN = 6.15;
    private final double D_SEG_MEDICO = 0.95;
    private final double D_FONDO_P = 4.44;
    private final double D_PENSION_C = 3.05;
    private final double D_CONTR_JUB_ANT = 1.02;

    // Constructor
    public Nomina(double nHoras, double tarifaHoras, double salarioBruto) {
        this.nHoras = nHoras;
        this.tarifaHoras = tarifaHoras;
        this.salarioBruto = salarioBruto;
    }

    // Getter y Setter
    public double getnHoras() {
        return nHoras;
    }

    public void setnHoras(double nHoras) {
        this.nHoras = nHoras;
    }

    public double getTarifaHoras() {
        return tarifaHoras;
    }

    public void setTarifaHoras(double tarifaHoras) {
        this.tarifaHoras = tarifaHoras;
    }
}
