/**
 * Clase peronal
 *  Atributos
 *      String nombre
 *      String apellido
 *      int idEmpleado
 *      int nHijos
 *      ENUM Puesto
 *      int idIncremento
 */

public class Personal {
    private String nombre;
    private String apellido;
    static int idEmpleado = 0; // se instancia con cada objeto de la clase
    static int idGeneral = 0; // solo se puede llamar en la clase y no se puede crear instancia en un objeto
    private byte nHijos;
    public Puesto puestoE; // puestoEnum
    private int idIncremento;

    // Metodo constructor
    public Personal(String nombre, String apellido, byte nHijos, String puestoE) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nHijos = nHijos;
        this.puestoE = Puesto.getPuesto(puestoE); // puestoEnum
        this.idIncremento = ++idGeneral;
    }

    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getnHijos() {
        return nHijos;
    }

    public void setnHijos(byte nHijos) {
        this.nHijos = nHijos;
    }

    public Puesto getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(Puesto puestoE) {
        this.puestoE = puestoE;
    }

    // Solo creamos el getter de idEmpleado
    public static int getIdEmpleado() {
        return idEmpleado;
    }

    // To String


    @Override
    public String toString() {
        return "\nPersonal" +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nNº de Hijos: " + nHijos +
                "\nPuesto del Empleado: " + puestoE +
                "\nidIncremento: " + idIncremento;
    }
}
