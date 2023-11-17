package Com.HectorVargasMartinez.DominioHV;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Atributos
    private List <Recurso> recursoHector;

    public Biblioteca() {
        this.recursoHector = new ArrayList<>();
    }


    public void addRecursoVargas(Recurso rHector) {
        if (rHector instanceof Prestable) {
            ((Prestable) rHector).prestarVargas();
            ((Prestable) rHector).devolverVargas();
        }
        recursoHector.add(rHector);
    }
    public boolean prestarRecursoVargas(Prestable recurso) {
        if (recurso.estaPrestadoHector()) {
            throw new RuntimeException("El recurso ya está prestado");
        }

        recurso.prestarVargas();
        return true;
    }


    public boolean devolverRecursoVargas(Prestable pHector){
        pHector.devolverVargas();
        return true;
    }
    public void listarPrestadosVargas(){
        System.out.println("Recursos prestados:");
        for (Recurso recursoHector : recursoHector) {
            if (recursoHector.isPrestadoHector()) {
                System.out.println(recursoHector);
            }
        }
    }

    public List<Recurso> getRecursoHector() {
        return recursoHector;
    }
}



