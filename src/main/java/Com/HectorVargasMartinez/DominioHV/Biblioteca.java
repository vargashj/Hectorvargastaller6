package Com.HectorVargasMartinez.DominioHV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    public List<Recurso> recursosHector;

    public Biblioteca() {
        this.recursosHector = new ArrayList<>();
    }

    public void agregarRecursoVargas(Recurso r) {
        if (r instanceof Prestable) {
            this.recursosHector.add(r);
        }
    }

    public void prestarRecursoVargas(Prestable p) {
        if (p instanceof Prestable) {
            p.prestarVargas();
        } else {
            throw new Error("El recurso no es prestable");
        }
    }
    public boolean devolverRecursoVargas(Prestable p) {
        if (p instanceof Recurso && ((Recurso) p).prestadoHector) {
            p.devolverVargas();
            return true;
        }

        return false;
    }
    public List<Recurso> listarPrestadoVargas() {
        return this.recursosHector.stream().filter(r -> r.prestadoHector).collect(Collectors.toList());
    }
}



