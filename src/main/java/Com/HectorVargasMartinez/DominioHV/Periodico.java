package Com.HectorVargasMartinez.DominioHV;

    public class  Periodico extends Recurso implements Prestable{


        public Periodico(String nombreHector) {
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

