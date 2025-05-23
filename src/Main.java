import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
        Personal emp5 = new Personal ("Robin", "Queen",(byte)3,"002");

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

//        for (Nomina nomina : nominas) {
//            nomina.mostrarNomina();
//        }

        // Se puede usar tanto en list como en set
        Iterator<Nomina> it = nominas.iterator();
        Nomina n = it.next();
        while (it.hasNext()) {
            n = it.next();
            if (n.getP().getApellido().equals("Queen")) {
                it.remove();
            }
        }
//        System.out.println("**** Sin Queen ****");
//        for (Nomina nomina : nominas) {
//            nomina.mostrarNomina();
//        }
        Personal p6 = new Personal ("Juan", "Diaz",(byte)2,"003");
        Personal p7 = new Personal ("Mariano", "Olmo",(byte)2,"003");

        Nomina n6 = new Nomina (250, 15, p6);
        Nomina n7 = new Nomina (290, 14.50, p7);

        ArrayList <Nomina> directivos = new ArrayList<>();
        directivos.add(n6);
        directivos.add(n7);
        directivos.add(n2);

        // Nocion de subconjunto: Se considera que un conjunto es un subconjunto de otro si
        // çtodos sus elementos están contenidos en el.
        // Por ejemplo podemos decir qué directivos es un subconjuntos de nóminas si todos los directivos
        // los contiene nóminas

        if (nominas.containsAll(directivos)) {
            System.out.println("La colección nóminas contiene las nóminas de los directivos");
        }else{
            System.out.println("La colección nóminas no contiene las nóminas de los directivos");
        }

        // Noción de unión: La unión de dos conjuntos es el conjunto formado por todos los elementos
        // contenidos en cada uno de ambos conjuntos.
        // Podemos, por ejemplo, definir un conjunto llamado NominasEmpleado que sea la unión de directivos y nóminas

        HashSet <Nomina> nominasEmpleados = new HashSet<>(directivos);
        nominasEmpleados.addAll(nominas);
        for (Nomina nomina : nominasEmpleados) {
            System.out.println(nomina.getP().toString() + "Salario Bruto" + nomina.getSalarioBruto() + "€");
        }

        // Noción de intersección: La intersección de dos conjuntos están formada por los elementos
        // contenidos a la vez en el primer y el segundo conjunto.
        // En nuestro caso contiene aquellas personas que son, a la vez, directivos que tienen nóminas

        HashSet <Nomina> directivosConNominas = new HashSet<>(nominas);
        directivosConNominas.retainAll(directivos);
        for (Nomina nomina : directivosConNominas) {
            System.out.println(nomina.getP().toString() + "Salario Bruto" + nomina.getSalarioBruto() + "€");
        }

        // Noción de diferencia: La diferencia entre dos conjuntos está formada por todos los
        // elementos presentes en uno.
        // En nuestro caso, representa aquellas personas que son únicamente directores y aquellas que
        // son unicamente empleados.

        HashSet <Nomina> nominasSinDirectivos = new HashSet<>(nominas);
        nominasSinDirectivos.removeAll(directivos);
        for (Nomina nomina : nominasSinDirectivos) {
            System.out.println(nomina.getP().toString() + "Salario Bruto" + nomina.getSalarioBruto() + "€");
        }
    }
}