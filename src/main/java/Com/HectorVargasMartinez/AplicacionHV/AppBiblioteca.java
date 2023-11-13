package Com.HectorVargasMartinez.AplicacionHV;


import Com.HectorVargasMartinez.DominioHV.*;

import java.util.List;

public class AppBiblioteca {

        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();

            biblioteca.agregarRecursoVargas(new Libro("El Quijote"));
            biblioteca.agregarRecursoVargas(new Revista("National Geographic"));
            biblioteca.agregarRecursoVargas(new Tesis("La teoría de la relatividad"));
            biblioteca.agregarRecursoVargas(new Enciclopedia("Larousse"));
            biblioteca.agregarRecursoVargas(new Periodico("El Tiempo"));
            biblioteca.agregarRecursoVargas(new RecursoNoPrestable("Señor de los anillos"));


            Libro libro = (Libro) biblioteca.recursosHector.stream()
                    .filter(r -> r.nombreHector.equals("El Quijote"))
                    .findFirst()
                    .get();
            biblioteca.prestarRecursoVargas(libro);
            System.out.println("El libro El Quijote se ha prestado " );

            Periodico periodico = (Periodico) biblioteca.recursosHector.stream()
                    .filter(r -> r.nombreHector.equals("El Tiempo"))
                    .findFirst()
                    .get();
            biblioteca.devolverRecursoVargas(periodico);
            System.out.println("El periodico El Tiempo ha sido devuelto");

        }

    }




