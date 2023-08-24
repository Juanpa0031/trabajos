package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.libro;
public class Main {

    public static void main(String[] args) {
        creacionlibros();

    }

// creacion de libros
    private static void creacionlibros(){

            libro libro1 = new libro();
            libro1.setNombre("matematicas");
            libro1.setGenero("educativo");
            libro1.setAutor("victor");
            libro1.setEditorial("norma");
            libro1.setAniopublicacion(1987);
            libro1.setNumeropaginas(145);

            libro libro2 = new libro();
            libro2.setNombre("una habitacion propia");
            libro2.setGenero("novela");
            libro2.setAutor("virginia wolf");
            libro2.setEditorial("hogart press");
            libro2.setAniopublicacion(1929);
            libro2.setNumeropaginas(147);

            libro libro3 = new libro();
            libro3.setNombre("carta al padre");
            libro3.setGenero("no ficcion");
            libro3.setAutor("franz kafka");
            libro3.setEditorial("panamericana");
            libro3.setAniopublicacion(1919);
            libro3.setNumeropaginas(47);

            libro libro4 = new libro();
            libro4.setNombre("el gato negro");
            libro4.setGenero("terror");
            libro4.setAutor("edgar allan poe");
            libro4.setEditorial("pluton ediciones");
            libro4.setAniopublicacion(1843);
            libro4.setNumeropaginas(61);

            libro libro5 = new libro();
            libro5.setNombre("calculo integral");
            libro5.setGenero("educativo");
            libro5.setAutor("mario");
            libro5.setEditorial("panamericana");
            libro5.setAniopublicacion(1942);
            libro5.setNumeropaginas(134);

        contarConsonantes(libro1,libro2,libro3,libro4,libro5);
        cambiarNombre(libro1,libro2,libro3,libro4,libro5);
        masPaginas(libro1,libro2,libro3,libro4,libro5);
        sonEducativos(libro1,libro2,libro3,libro4,libro5);

        }

    //contar cuantos titulos inician en consonate
    public static void contarConsonantes(libro libro1, libro libro2, libro libro3, libro libro4, libro libro5){
        int contadorConsonate = 0;
        char caracter1 =libro1.getNombre().charAt(0);
        char caracter2 =libro2.getNombre().charAt(0);
        char caracter3 =libro3.getNombre().charAt(0);
        char caracter4 =libro4.getNombre().charAt(0);
        char caracter5 =libro5.getNombre().charAt(0);
        if (caracter1 != 'a' && caracter1 !='e' && caracter1 !='i' && caracter1 !='o' && caracter1 !='u') {
            contadorConsonate+=1;
        }
        if (caracter2 != 'a' && caracter2 !='e' && caracter2 !='i' && caracter2 !='o' && caracter2 !='u') {
            contadorConsonate+=1;
        }
        if (caracter3 != 'a' && caracter3 !='e' && caracter3 !='i' && caracter3 !='o' && caracter3 !='u') {
            contadorConsonate+=1;
        }
        if (caracter4 != 'a' && caracter4 !='e' && caracter4 !='i' && caracter4 !='o' && caracter4 !='u') {
            contadorConsonate+=1;
        }
        if (caracter5 != 'a' && caracter5 !='e' && caracter5 !='i' && caracter5 !='o'  && caracter5 !='u') {
            contadorConsonate+=1;
        }
        System.out.println(contadorConsonate+" libros comiensan por consonante");

    }

   //cambiar nombre de un libro
    public static void cambiarNombre(libro libro1, libro libro2, libro libro3, libro libro4, libro libro5){
        String tituloBuscar = "calculo integral";
        if (libro1.getNombre().equalsIgnoreCase(tituloBuscar)){
            libro1.setNombre("calculo integral y diferencial");
            System.out.println("El titulo del libro 1 se cambio por calculo integral y diferencial");
        }
        if (libro2.getNombre().equalsIgnoreCase(tituloBuscar)){
            libro2.setNombre("calculo integral y diferencial");
            System.out.println("El titulo del libro 2 se cambio por calculo integral y diferencial");

        }
        if (libro3.getNombre().equalsIgnoreCase(tituloBuscar)){
            libro3.setNombre("calculo integral y diferencial");
            System.out.println("El titulo del libro 3 se cambio por calculo integral y diferencial");
        }
        if (libro4.getNombre().equalsIgnoreCase(tituloBuscar)){
            libro4.setNombre("calculo integral y diferencial");
            System.out.println("El titulo del libro 4 se cambio por calculo integral y diferencial");
        }
        if (libro5.getNombre().equalsIgnoreCase(tituloBuscar)){
            libro5.setNombre("calculo integral y diferencial");
            System.out.println("El titulo del libro 5 se cambio por calculo integral y diferencial");
        }


    }

    //contar cuantos libros tienen mas de 100 paginas
    public static void masPaginas(libro libro1, libro libro2, libro libro3, libro libro4, libro libro5){
        int contadorMas = 0;
        if (libro1.getNumeropaginas()>=100){
            contadorMas+=1;
        }
        if (libro2.getNumeropaginas()>=100){
            contadorMas+=1;
        }
        if (libro3.getNumeropaginas()>=100){
            contadorMas+=1;
        }
        if (libro4.getNumeropaginas()>=100){
            contadorMas+=1;
        }
        if (libro5.getNumeropaginas()>=100){
            contadorMas+=1;
        }
        System.out.println("hay "+contadorMas+" libros con mas de 100 hojas");

    }

    //contar cuantos libros educativos hay
    public static void sonEducativos(libro libro1, libro libro2, libro libro3, libro libro4, libro libro5){
        int contadorGenero = 0;
        String generoBuscar = "educativo";
        if (libro1.getGenero().equalsIgnoreCase(generoBuscar)){
            contadorGenero += 1;
        }
        if (libro2.getGenero().equalsIgnoreCase(generoBuscar)){
            contadorGenero += 1;
        }
        if (libro3.getGenero().equalsIgnoreCase(generoBuscar)){
            contadorGenero += 1;
        }
        if (libro4.getGenero().equalsIgnoreCase(generoBuscar)){
            contadorGenero += 1;
        }
        if (libro5.getGenero().equalsIgnoreCase(generoBuscar)){
            contadorGenero += 1;
        }
        System.out.println("Hay "+contadorGenero+" libros educativos");


    }


}