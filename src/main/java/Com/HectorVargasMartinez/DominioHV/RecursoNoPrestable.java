package Com.HectorVargasMartinez.DominioHV;

public class RecursoNoPrestable extends Recurso {
    public RecursoNoPrestable(String nombre) {
        super(nombre);
    }

    @Override
    public void prestarVargas() {
        throw new Error("Este recurso no es prestable");
    }

    @Override
    public boolean devolverVargas() {
        throw new Error("Este recurso no es prestable");
    }
}
