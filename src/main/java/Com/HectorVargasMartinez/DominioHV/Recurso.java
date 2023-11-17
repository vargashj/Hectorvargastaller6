package Com.HectorVargasMartinez.DominioHV;



public abstract class Recurso {
    // Atributos
    private boolean prestadoHector;
    private String nombreHector;

    // Constructor
    public Recurso(String nombreHector) {
        this.nombreHector = nombreHector;
        this.prestadoHector = false;
    }

    // Métodos
    public boolean estaPrestadoHector() {
        return this.prestadoHector;
    }

    public String getNombreHector() {
        return this.nombreHector;
    }

    public void setNombreHector(String nombreHector) {
        this.nombreHector = nombreHector;
    }

    public void setPrestadoHector(boolean prestadoHector) {
        this.prestadoHector = prestadoHector;
    }

    // Override del método toString()
    @Override
    public String toString() {
        return String.format("Nombre: %s, Estado: %s", this.nombreHector, (this.prestadoHector ? "Prestado" : "Disponible"));
    }

    public boolean isPrestadoHector() {
        return false;
    }
}

