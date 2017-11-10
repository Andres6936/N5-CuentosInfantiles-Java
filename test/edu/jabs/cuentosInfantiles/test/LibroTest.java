package edu.jabs.cuentosInfantiles.test;

import java.io.*;
import java.util.Properties;

import junit.framework.*;
import edu.jabs.cuentosInfantiles.mundo.Libro;

/**
 * Clase usada para verificar que los métodos de la clase Libro estén correctamente implementados
 */
public class LibroTest extends TestCase
{

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El libro donde se harán las pruebas
     */
    private Libro libro;

    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Construye un nuevo libro con la información contenida en un archivo
     */
    public void setupEscenario1( )
    {
        try
        {
            Properties persistencia = new Properties( );
            FileInputStream fis = new FileInputStream( new File( "./test/data/librosTest.properties" ) );
            persistencia.load( fis );
            fis.close( );
            libro = new Libro( 3, persistencia );
        }
        catch( Exception e )
        {
            fail( "No debería generarse ninguna excepción" );
        }
    }

    /**
     * Prueba 1 - Prueba el método constructor<br>
     * Métodos a probar: <br>
     * Libro, darNombre, darCantPaginas, darPrecio, darImagen, darUnidadesVendidas
     */
    public void testLibro( )
    {
        setupEscenario1( );
        assertEquals( "No se inicializó correctamente el nombre del libro", "Pinocho", libro.darNombre( ) );
        assertEquals( "No se inicializó correctamente la cantidad de páginas", 30, libro.darCantPaginas( ) );
        assertEquals( "No se inicializó correctamente el precio del libro", ( double )28000, libro.darPrecio( ) );
        assertEquals( "No se inicializó correctamente la ruta de la  imagen", "data/imagenes/pinocho.png", libro.darImagen( ) );
        assertEquals( "No se inicializó correctamente la cantidad de unidades vendidas", 0, libro.darUnidadesVendidas( ) );
    }

    /**
     * Prueba 2 - Prueba el método comprarLibro<br>
     * Métodos a probar:<br>
     * comprarLibro, darUnidadesVendidas
     */
    public void comprarLibro( )
    {
        setupEscenario1( );
        assertEquals( "La cantidad de libros vendidos no es correcto", 0, libro.darUnidadesVendidas( ) );
        libro.comprarLibro( );
        assertEquals( "La cantidad de libros vendidos no es correccto", 1, libro.darUnidadesVendidas( ) );
        libro.comprarLibro( );
        assertEquals( "La cantidad de libros vendidos no es correccto", 2, libro.darUnidadesVendidas( ) );
    }
}