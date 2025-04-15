public enum Puesto {
    AGENTE_SERVICIO ("001"), EMPLEADO_OFICINA ("002"), DIRECTIVO ("003");

    // Metodo constructor
    Puesto(String codigo) {
        this.codigo = codigo;
    }
    String codigo;

    // Metodo Getter y Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static Puesto getPuesto(String codigo) {
        for (Puesto p : Puesto.values()) { // hacemos esto para que al poner el código salga el puesto
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
}



