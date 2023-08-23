package co.edu.uniquindio.biblioteca;

public class libro {

  private String nombre;
  private String genero;
  private String autor;
  private String editorial;
  private int aniopublicacion;
  private int numeropaginas;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public int getAniopublicacion() {
    return aniopublicacion;
  }

  public void setAniopublicacion(int aniopublicacion) {
    this.aniopublicacion = aniopublicacion;
  }

  public int getNumeropaginas() {
    return numeropaginas;
  }

  public void setNumeropaginas(int numeropaginas) {
    this.numeropaginas = numeropaginas;
  }



// creacion de libros
  private static void creacionlibros(){

    libro libro1 = new libro();
    libro1.setNombre("caculo");

    libro libro2 = new libro();
    libro2.setNombre("caculo");

    libro libro3 = new libro();
    libro3.setNombre("caculo");

    libro libro4 = new libro();
    libro4.setNombre("caculo");

    libro libro5 = new libro();
    libro5.setNombre("caculo");

  }

}


