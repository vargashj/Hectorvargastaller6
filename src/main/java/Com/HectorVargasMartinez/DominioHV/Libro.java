package Com.HectorVargasMartinez.DominioHV;
    public class Libro extends Recurso implements Prestable{
        public Libro(String nombreHctor) {
            super(nombreHctor);
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











