package org.example.biblio;

public class Libro {

        private static final int DEF_LIBRO_PRESTADO=-1;
        private static final int DEF_LIBRO_SIN_PRESTAR=1;
        private static int contadorLibrosDisponibles=0;
        private static int contadorCantidadLibros=0;
        private static final String CADENA_ID= "LIB";
private String id;
        private String  titulo;
        private String autor;
        private boolean disponible;
        private static int cantidadLibros=0;
        private static int librosDisponibles;
    private Editorial editorial;
    private Estudiante estudiantePrestado;


        public Libro(String titulo, String autor, Editorial editorial){
            this.titulo=titulo;
            this.autor=autor;
            this.disponible = true;
            id=calcularId();
            estudiantePrestado= null;
            cantidadLibros++;
            librosDisponibles++;
            estudiantePrestado=null;
            this.editorial=editorial;




        }

        private String calcularId() {

            return CADENA_ID+cantidadLibros;
        }


        public Prestamo prestar(Estudiante estudiante){
            Prestamo prestamo=null;
            if (disponible && estudiante.getLibro()==null) {
                disponible = false;
                librosDisponibles--;
                estudiantePrestado = estudiante;
                System.out.println("El libro " + titulo + " ha sido prestado a " + estudiantePrestado.getNombre());
                estudiante.setLibro(this);
                prestamo=new Prestamo(this,estudiante);
                System.out.println("Préstamo realizado con éxito.");
            }else if (estudiante.getLibro()!=null){
                System.out.println("El estudiante "+estudiante.getNombre()+ " ya tiene un libro prestado");

            } else {
                System.out.println("El libro solicitado está prestado actualmente.");
            }
                return prestamo;
        }

        public  void devolver(){
            if (!disponible) {
                disponible = true;
                System.out.println("El libro " + titulo + " ha sido devuelto por " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
                librosDisponibles++;
                estudiantePrestado.setLibro(null);
                estudiantePrestado = null;
            } else {
                System.out.println("No se puede devolver debido que ya esta con nosotros.");
            }
        }

    public boolean Disponible() {
        return disponible;
    }

        public static int getTotalLibros(){
            return cantidadLibros;
        }
    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }



        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }



        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

        public static int getCantidadLibros() {
            return cantidadLibros;
        }

        public static void setCantidadLibros() {
            cantidadLibros = ++contadorCantidadLibros;
        }



        private static void setLibrosDisponibles() {
            librosDisponibles = ++contadorLibrosDisponibles;
        }
    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Estado=" + disponible +
                ", id='" + id + '\'' +
                ", Estudiante'"+estudiantePrestado+ '}';
    }

    }




