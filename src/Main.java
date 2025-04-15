
public class Main {
    public static void main(String[] args) {
        Personal emp1 = new Personal ("Pedro", "Lopez", (byte)4, "003");
        System.out.println(emp1);

        Personal emp2 = new Personal ("Nuria", "Cano", (byte)1, "001");
        System.out.println(emp2);

        Nomina n = new Nomina(190, 9.76,emp1);
        n.mostrarNomina();

        Nomina n2 = new Nomina(180, 8.78,emp2);
        n2.mostrarNomina();
    }
}