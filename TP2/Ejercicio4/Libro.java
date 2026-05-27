package TP2.Ejercicio4;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    // aclaracion true: disponible  false = prestado

    public Libro(){
    }

    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // por defecto el libro estara disponible
    }

    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("---------------------------");
            System.out.println("El libro fue prestado...");
            System.out.println("---------------------------");
        }else {
            System.out.println("El libro no esta disponible...");
        }
    }
    public void devolver(){
        if(!disponible){
            disponible = true;
            System.out.println("---------------------------");
            System.out.println("El libro fue devuetlo...");
            System.out.println("---------------------------");
        }else {
            System.out.println("El libro esta disponble...");
        }
    }
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Isbn: " + isbn);
        System.out.println("Estado: " + (disponible ? "Disponible\n" : "Prestado\n"));
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(){
        this.isbn = isbn;
    }

    public boolean isDisponible(){
        return disponible;
    }
    public void setDisponible(){
        this.disponible = disponible;
    }
}