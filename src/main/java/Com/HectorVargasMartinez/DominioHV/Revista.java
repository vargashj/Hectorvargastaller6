package Com.HectorVargasMartinez.DominioHV;

public class Revista extends Recurso implements Prestable{


    public Revista(String nombreHector) {
        super(nombreHector);
    }

    @Override
    public void prestarVargas() {
        this.setPrestadoHector(true);
    }

    @Override
    public void devolverVargas() {
        this.setPrestadoHector(false);
    }
}
