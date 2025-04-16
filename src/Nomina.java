public class Nomina {
    private double nHoras;
    private double tarifaHoras;
    private double salarioBruto;
    private Personal p;
    private final double D_DEUDA_SOCIAL = 3.46;
    private final double D_NO_COMUN = 6.15;
    private final double D_SEG_MEDICO = 0.95;
    private final double D_FONDO_P = 4.44;
    private final double D_SEG_DES = 3.05;
    private final double D_PENSION_C = 3.05;
    private final double D_CONTR_JUB_ANT = 1.02;

    // Constructor
    public Nomina(double nHoras, double tarifaHoras, Personal p) {
        this.nHoras = nHoras;
        this.tarifaHoras = tarifaHoras;
        this.salarioBruto = salarioBruto;
        this.p = p;
        calcularSalarioBruto();
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

    public Personal getP() {
        return p;
    }

    public void setP(Personal p) {
        this.p = p;
    }

    // Calculamos la prima familiar
    public double calcularFrimaFamiliar (){
        double primaFamiliar = 0;
        if (this.p.getnHijos() == 1){
            primaFamiliar = 20;
        }else if (this.p.getnHijos () == 2){
            primaFamiliar = 50;
        }else if (this.p.getnHijos () > 2){
            primaFamiliar = 75 + (this.p.getnHijos() - 2) * 20;
        }
        return primaFamiliar;
    }
    // Calculamos el salario bruto
    public void calcularSalarioBruto(){
        double salarioBruto = 0, horasNormales, horasExtra50, horasExtra60;
        if (this.nHoras < 169){
            salarioBruto = this.nHoras * this.tarifaHoras;
        }else if (this.nHoras <= 180){
            horasNormales = 169;
            horasExtra50 = this.nHoras - horasNormales;
            salarioBruto = horasNormales * tarifaHoras + horasExtra50 * 1.5;
        }else {
            horasNormales = 169;
            horasExtra50 = 180 - horasNormales;
            horasExtra60 = this.nHoras - 180;
            salarioBruto = horasNormales * tarifaHoras + horasExtra50 * 1.5;
        }
        this.salarioBruto = salarioBruto;
    }
    // Calcular las deducciones
    public double calculoDeduccion (double porcentaje){
        return (porcentaje/100) * this.salarioBruto;
    }
    //Mostramos la nomina
    public void mostrarNomina() {
        double dedSocial, dedConComun, dedMedico, dedFondoP, dedPensionC, dedSegDes, salarioNeto, deduccionTotal, dedContrJubAnt;
        System.out.println(p.toString());
        System.out.println("Salario Bruto -> " + String.format("%.2f", this.salarioBruto) + "€");
        System.out.println("\nCalculo de Deducciones");

        dedSocial = this.calculoDeduccion(this.D_DEUDA_SOCIAL);
        System.out.println("Deducción Social -> " + String.format("%.2f", dedSocial) + "€");

        dedConComun = this.calculoDeduccion(this.D_NO_COMUN);
        System.out.println("Deducción de Contingencias no Comunes -> " + String.format("%.2f", dedConComun) + "€");

        dedMedico = this.calculoDeduccion(this.D_SEG_MEDICO);
        System.out.println("Deducción de Seguro Medico -> " + String.format("%.2f", dedMedico) + "€");

        dedFondoP = this.calculoDeduccion(this.D_FONDO_P);
        System.out.println("Deducción de Fondo de Pensiones -> " + String.format("%.2f", dedFondoP) + "€");

        dedSegDes = this.calculoDeduccion(this.D_SEG_DES);
        System.out.println("Deducción Seguro de Desempleo -> " + String.format("%.2f", dedSegDes) + "€");

        dedPensionC = this.calculoDeduccion(this.D_PENSION_C);
        System.out.println("Deducción Pension Complementaria -> " + String.format("%.2f", dedPensionC) + "€");

        dedContrJubAnt = this.calculoDeduccion(this.D_CONTR_JUB_ANT);
        System.out.println("Deducción Jubilación Anticipada -> " + String.format("%.2f", dedContrJubAnt) + "€");

        // Corregido el cálculo de deduccionTotal (estabas restando dedSegDes dos veces)
        deduccionTotal = dedSocial + dedConComun + dedMedico + dedFondoP + dedPensionC + dedSegDes + dedContrJubAnt;
        System.out.println("\nTotal de deducciones -> " + String.format("%.2f", deduccionTotal) + "€");

        salarioNeto = this.salarioBruto - deduccionTotal;
        System.out.println("Prima familiar -> " + String.format("%.2f", calcularFrimaFamiliar()) + "€");
        System.out.println("Salario Neto -> " + String.format("%.2f", salarioNeto + calcularFrimaFamiliar()) + "€");
    }
}
