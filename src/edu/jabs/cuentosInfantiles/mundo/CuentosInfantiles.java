package edu.jabs.cuentosInfantiles.mundo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Clase que representa una tienda de cuentos infantiles
 */
public class CuentosInfantiles
{
    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El arreglo de libros de cuentos infantiles de la tienda
     */
    private Libro[] libros;

    /**
     * El número del libro actual
     */
    private int libroActual;

    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    /**
     * Crea una nueva tienda de libros <br>
     * <b>pos: </b>Creó el arreglo de libros cargando la información desde un archivo <br>
     *             Inicializó el atributo libroActual en cero <br>
     * @throws Exception - Lanza una excepción si no hay ningún libro en el archivo
     *                   - Lanza una excepción si ocurre un error al cargar el archivo con la información de la tienda<br>
     *
     */
    public CuentosInfantiles( ) throws Exception
    {
        try
        {
            //
            // Carga la información
            Properties persistencia = new Properties( );
            FileInputStream fis = new FileInputStream( new File( "data/libros.properties" ) );
            persistencia.load( fis );
            fis.close( );
            //
            // Lee la información
            int cantidadLibros = Integer.parseInt( persistencia.getProperty( "cuentosInfantiles.cantidadLibros" ) );

            libros = new Libro[cantidadLibros];
            for( int i = 1; i <= cantidadLibros; i++ )
            {
                Libro libro = new Libro( i, persistencia );
                libros[ i - 1 ] = libro;
            }
            if(libros.length<=0)
            {
                throw  new Exception( "No hay ningún libro en el archivo" );
            }

            libroActual = 0;
        }
        catch( Exception e )
        {
            throw new Exception( "Error en el formato del archivo" );
        }

    }
    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Retorna la cantidad de libros que hay en la tienda
     * <br> Pre: </br> El arreglo de libros se encuentra inicializado
     * @return cantidad de libros
     */
    public int darCantidadLibros( )
    {
        return libros.length;
    }

    /**
     * Retorna el libro de cuentos actual de la tienda <br>
     * <b>pre:</b> El arreglo de libros se encuentra inicializado <br>
     * @return Libro actual de la tienda
     * @throws Exception - Lanza una excepción si no existe un libro en la posición actual
     */
    public Libro darLibroActual( ) throws Exception
    {

        Libro libro = libros[ libroActual ];
        if( libro == null )
        {
            throw new Exception( " No existe ningún libro en la posición actual" );

        }
        return libro;
    }

    /**
     * Retorna el libro de cuentos ubicado en la posición siguiente a la actual <br>
     * <b> pre: </b> El arreglo de libros de cuentos se encuentra inicializado <br>
     * <b> post: </b> Actualizó el atributo libroActual a la posición siguiente. <br>
     * @return El libro ubicado en la posición siguiente a la actual
     * @throws Exception - Lanza una excepción si no existe un libro en la posición siguiente
     */
    public Libro darLibroSiguiente( ) throws Exception
    {
        if( libroActual + 1 < libros.length )
        {
            libroActual++;
            return darLibroActual( );
        }
        else
        {
            throw new Exception( "Se encuentra en el último libro " );
        }
    }

    /**
     * Retorna el libro de cuentos ubicado en la posición anterior a la actual <br>
     * <b> pre: </b> El arreglo de libros de cuentos se encuentra inicializado <br>
     * <b> post: </b> Actualizó el atributo libroActual a la posición anterior. <br>
     * @return El libro ubicado en la posición anterior a la actual
     * @throws Exception - Lanza una excepción si no existe un libro en la posición anterior
     */
    public Libro darLibroAnterior( ) throws Exception
    {
        if( libroActual - 1 >= 0 )
        {
            libroActual--;
            return darLibroActual( );
        }
        else
        {
            throw new Exception( "Se encuentra en el primer libro " );
        }

    }

    /**
     * Retorna el libro de cuentos ubicado en la primera posición  <br>
     * <b> pre: </b> El arreglo de libros se encuentra inicializado <br>
     * <b> post: </b> Actualizó el atributo libroActual a la primera posición. <br>
     * @return El libro ubicado en la primera posición
     * @throws Exception - Lanza una excepción si no existe ningún libro en la tienda o si ya se encuentra en el primer libro
     */
    public Libro darPrimerLibro( ) throws Exception
    {
        if( libros.length == 0 )
        {
            throw new Exception( "No existe ningún en la tienda" );
        }
        else if( libroActual == 0 )
        {
            throw new Exception( "Ya se encuentra en el primer libro" );
        }
        libroActual = 0;
        return libros[ 0 ];
    }

    /**
     * Retorna el libro de cuentos ubicado en la última posición <br>
     * <b> pre: </b> El arreglo de libros de cuentos se encuentra inicializado <br>
     * <b> post: </b> Actualizó el atributo libroActual a la última posición <br>
     * @return El libro ubicado en la última posición
     * @throws Exception - Lanza una excepción si no existe ningún libro en la tienda o si ya se encuentra en el último libro
     */
    public Libro darUltimoLibro( ) throws Exception
    {
        if( libros.length == 0 )
        {
            throw new Exception( "No existe ningún libro en la tienda" );
        }
        if( libroActual == libros.length - 1 )
        {
            throw new Exception( "Ya se encuentra en el último libro" );
        }
        libroActual = libros.length - 1;
        return libros[ libros.length - 1 ];
    }

    /**
     * Retorna el libro de cuentos que tiene el nombre dado <br>
     * <b> pre: </b> El arreglo de libros se encuentra inicializado <br>
     * <b> post: </b> Actualizó el atributo libroActual al libro con el nombre dado <br>
     * @param nombreLibro - Nombre del libro de cuentos a buscar - nombreLibro != null && nombreLibro != ""
     * @return El libro de cuentos con el nombre dado
     * @throws Exception - Lanza una excepción si no se encuentra un libro con el nombre dado
     */
    public Libro darLibroPorNombre( String nombreLibro ) throws Exception
    {
        Libro libro = null;
        boolean encontrada = false;
        for( int i = 0; i < libros.length && !encontrada; i++ )
        {
            libro = ( Libro )libros[ i ];
            if( libro.darNombre( ).equalsIgnoreCase( nombreLibro ) )
            {
                encontrada = true;
                libroActual = i;
            }
        }
        if( !encontrada )
        {
            throw new Exception( "No se encontró un libro de cuentos con nombre: " + nombreLibro );
        }

        return libro;
    }

    /**
     * Realiza una compra del libro actual de la tienda<br>
     * <b> pre: </b> El arreglo de libros de cuentos se encuentra inicializado <br>
     * <b> post: </b> Se vendió una unidad del libro actual <br>
     */
    public void comprarLibroActual( )
    {
        libros[ libroActual ].comprarLibro( );
    }

    /**
     * Retorna la cantidad de libros vendidos de la tienda<br>
     * <b>pre:</b> El arreglo de libros se encuentra inicializado
     * @return cantidad total de libros vendidos
     */
    public int darTotalUnidadesVendidas( )
    {
        int totalVentas = 0;
        for( int i = 0; i < libros.length; i++ )
        {
            totalVentas += libros[ i ].darUnidadesVendidas( );
        }
        return totalVentas;
    }

    /**
     * Retorna el total recaudado con la venta de libros hasta el momento
     * <b>pre:</b> El arreglo de libros se encuentra inicializado <br>
     * @return total recaudado
     */
    public double darTotalRecaudado( )
    {
        double total = 0;

        for( int i = 0; i < libros.length; i++ )
        {
            Libro actual = libros[ i ];
            total += actual.darPrecio( ) * actual.darUnidadesVendidas( );
        }
        return total;
    }

    /**
     * Retorna el libro más vendido.
     * Si hay más de un libro con el mayor número de unidades vendidas, retorna el libro con mayor precio
     * <b>pre:</b> El arreglo de libros se encuentra inicializado <br>
     * @return El libro con mayor número de ventas o null si no se ha vendido ningún libro
     */
    public Libro darLibroMasVendido( )
    {
        Libro libro = null;
        int mayorVenta = 0;
        for( int i = 0; i < libros.length; i++ )
        {
            Libro actual = libros[ i ];
            int vendidas = actual.darUnidadesVendidas( );

            if( libro != null && vendidas == mayorVenta && actual.darPrecio( ) > libro.darPrecio( ) )
            {
                libro = actual;
                mayorVenta = vendidas;

            }
            else if( vendidas > mayorVenta )
            {
                libro = actual;
                mayorVenta = vendidas;
            }
        }
        return libro;
    }
    // -------------------------------------------------------------
    // Métodos de extensión
    // -------------------------------------------------------------

    /**
     * Método para la extensión 1
     * @return respuesta1
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * Método para la extensión 2
     * @return respuesta2
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }
}