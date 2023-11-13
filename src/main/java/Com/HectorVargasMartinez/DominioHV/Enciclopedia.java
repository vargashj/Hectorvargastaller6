package Com.HectorVargasMartinez.DominioHV;

public class Enciclopedia extends Recurso implements Prestable {
    public Enciclopedia(String nombre) {
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
