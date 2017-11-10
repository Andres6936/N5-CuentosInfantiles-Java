package edu.jabs.cuentosInfantiles.mundo;

import java.util.Properties;

/**
 * Clase que representa un libro infantil
 */
public class Libro
{
    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El nombre del libro
     */
    private String nombre;

    /**
     * La cantidad de páginas que tiene el libro
     */
    private int cantPaginas;

    /**
     * El precio del libro
     */
    private double precio;

    /**
     * La cantidad de unidades vendidas de Libro
     */
    private int unidadesVendidas;

    /**
     * La ruta de la imagen de la portada del libro
     */
    private String imagen;

    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    /**
     * Construye un libro nuevo con las características dadas
     * @param numeroLibro - Número del libro que está siendo cargado - numeroLibro > 0
     * @param datos -El archivo properties donde se encuentran la información del libro - datos != null
     * @throws Exception Lanza una excepción si hay un error en el formato del archivo
     */
    public Libro( int numeroLibro, Properties datos ) throws Exception
    {
        try
        {
            // Lee la información
            nombre = datos.getProperty( "cuentosInfantiles.libro" + numeroLibro + ".nombreLibro" );
            String strCantPaginas = datos.getProperty( "cuentosInfantiles.libro" + numeroLibro + ".cantidadPaginas" );
            cantPaginas = Integer.valueOf( strCantPaginas );
            String strPrecio = datos.getProperty( "cuentosInfantiles.libro" + numeroLibro + ".precio" );
            precio = Double.valueOf( strPrecio );
            imagen = "data/imagenes/" +datos.getProperty( "cuentosInfantiles.libro" + numeroLibro + ".imagen" );
            unidadesVendidas = 0;
        }
        catch( Exception e )
        {
            e.printStackTrace( );
            throw new Exception( "Error en el formato del archivo" );
        }

    }
    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Retorna el nombre de libro de cuentos
     * @return el nombre del libro
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna la cantidad de páginas que tiene el libro
     * @return la cantidad de páginas del libro
     */
    public int darCantPaginas( )
    {
        return cantPaginas;
    }

    /**
     * Retorna el precio del libro
     * @return el precio del libro
     */
    public double darPrecio( )
    {
        return precio;
    }

    /**
     * Retorna la cantidad de unidades que han sido vendidas
     * @return la cantidad de unidades vendidas
     */
    public int darUnidadesVendidas( )
    {
        return unidadesVendidas;
    }

    /**
     * Retorna la ruta del la imagen de la portada del libro
     * @return ruta imagen
     */
    public String darImagen( )
    {
        return imagen;
    }

    /**
     * Se realiza la compra de una unidad del libro<br>
     * <b>Post</b> La cantidad de unidades vendidas aumenta en 1
     */
    public void comprarLibro( )
    {
        unidadesVendidas++;
    }

}