import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Personal emp1 = new Personal ("Pedro", "Lopez", (byte)4, "003");
//        System.out.println(emp1);
//
//        Personal emp2 = new Personal ("Nuria", "Cano", (byte)1, "001");
//        System.out.println(emp2);
//
//        Nomina n = new Nomina(190, 9.76,emp1);
//        n.mostrarNomina();
//
//        Nomina n2 = new Nomina(180, 8.78,emp2);
//        n2.mostrarNomina();
//
        Personal emp1 = new Personal ("Pedro", "Lopez",(byte)2,"003");
        Personal emp2 = new Personal ("Nuria", "Cano",(byte)0,"002");
        Personal emp3 = new Personal ("Carlota", "Sanchez",(byte)0,"001");
        Personal emp4 = new Personal ("Juan", "Benito",(byte)1,"001");
        Personal emp5 = new Personal ("Andujar", "Rosado",(byte)3,"002");

        System.out.println(emp1);
        System.out.println(emp2);

        Nomina n1 = new Nomina(190, 9.76, emp1);
        Nomina n2 = new Nomina(186, 5.86, emp2);
        Nomina n3 = new Nomina(170, 4.39, emp3);
        Nomina n4 = new Nomina(145, 7.78, emp4);
        Nomina n5 = new Nomina(130, 9.03, emp5);
        ArrayList <Nomina> nominas = new ArrayList<>();
        nominas.add(n1);
        nominas.add(n2);
        nominas.add(n3);
        nominas.add(n4);
        nominas.add(n5);

        for (Nomina nomina : nominas) {
            nomina.mostrarNomina();
        }


    }
}