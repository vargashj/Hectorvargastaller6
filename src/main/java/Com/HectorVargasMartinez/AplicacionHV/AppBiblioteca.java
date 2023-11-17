package Com.HectorVargasMartinez.AplicacionHV;


import Com.HectorVargasMartinez.DominioHV.*;

import java.util.List;

public class AppBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("100 años de soledad");
        Revista revista = new Revista("Avon");
        Periodico periodico = new Periodico("El tiempo");
        Tesis tesis = new Tesis("El Capital");
        Enciclopedia enciclopedia = new Enciclopedia("Wiki");

        biblioteca.addRecursoVargas(libro);
        biblioteca.addRecursoVargas(revista);
        biblioteca.addRecursoVargas(periodico);
        biblioteca.addRecursoVargas(tesis);
        biblioteca.addRecursoVargas(enciclopedia);




        Prestable[] recursos = {libro, revista,periodico, revista};
        for (Prestable recurso : recursos) {
            if (recurso.estaPrestadoHector()) {
                throw new RuntimeException("El recurso ya está prestado");
            } else {
                System.out.println("No se pudo prestar: " + recurso);
            }
        }


        for (Prestable recurso : recursos) {
            if (biblioteca.devolverRecursoVargas(recurso)) {
                System.out.println("Se devolvió correctamente: " + recurso);
            } else {
                System.out.println("No se pudo devolver: " + recurso);
            }
        }
        }
    }





