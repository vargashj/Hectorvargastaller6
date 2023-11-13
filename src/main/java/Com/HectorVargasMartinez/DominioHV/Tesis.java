package Com.HectorVargasMartinez.DominioHV;

public class Tesis extends Recurso implements Prestable {
    public Tesis(String nombre) {
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
