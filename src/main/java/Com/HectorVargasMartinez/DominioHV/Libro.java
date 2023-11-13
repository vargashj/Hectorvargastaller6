package Com.HectorVargasMartinez.DominioHV;

public class Libro extends Recurso implements Prestable {
    public Libro(String nombre) {
        super(nombre);
    }

    @Override
    public void prestarVargas() {
        this.prestadoHector = true;
    }

    @Override
    public boolean devolverVargas() {
        this.prestadoHector = false;
        return false;
    }
}











