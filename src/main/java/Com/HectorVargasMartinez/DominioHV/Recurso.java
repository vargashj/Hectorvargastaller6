package Com.HectorVargasMartinez.DominioHV;

public abstract class Recurso {
    public boolean prestadoHector;
    public String nombreHector;

    public Recurso(String nombreHector) {
        this.nombreHector = nombreHector;
        this.prestadoHector = false;
    }

    public String toString() {
        return "Recurso { nombre: " + this.nombreHector + ", prestado: " + this.prestadoHector + " }";
    }

    public abstract void prestarVargas();

    public abstract boolean devolverVargas();
}

