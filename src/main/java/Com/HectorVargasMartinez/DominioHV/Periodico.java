package Com.HectorVargasMartinez.DominioHV;

public class Periodico extends Recurso implements Prestable {
    public Periodico(String nombre) {
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
