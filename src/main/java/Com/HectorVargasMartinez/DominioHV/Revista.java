package Com.HectorVargasMartinez.DominioHV;

public class Revista extends Recurso implements Prestable {
    public Revista(String nombre) {
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
