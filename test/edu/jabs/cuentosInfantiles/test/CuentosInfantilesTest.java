package edu.jabs.cuentosInfantiles.test;

import junit.framework.TestCase;

import edu.jabs.cuentosInfantiles.mundo.CuentosInfantiles;
import edu.jabs.cuentosInfantiles.mundo.Libro;

/**
 * Clase usada para verificar que los métodos de la clase CuentosInfantiles estén correctamente implementados
 */
public class CuentosInfantilesTest extends TestCase
{
    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * La tienda de cuentosInfantiles donde se harán las pruebas
     */
    private CuentosInfantiles cuentosInfantiles;

    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Construye una nueva tienda de cuentos infantiles con la información contenida en un archivo
     */
    public void setupEscenario1( )
    {
        try
        {
            cuentosInfantiles = new CuentosInfantiles( );
        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 1- Prueba el método constructor<br>
     * Métodos a probar:<br>
     * CuentosInfantiles, darCantidadLibros, darLibroSiguiente
     */
    public void testCuentosInfantiles( )
    {
        setupEscenario1( );
        assertEquals( "El número de obras no es correcto", 7, cuentosInfantiles.darCantidadLibros( ) );
        try
        {
            int i = 1;
            while( i < 7 )
            {
                assertNotNull( "La obra no debería ser nula", cuentosInfantiles.darLibroSiguiente( ) );
                i++;
            }
        }
        catch( Exception e )
        {
            fail( "No se debería generar el error: " + e.getMessage( ) );
        }
    }

    /**
     * Prueba 2 - Prueba el método darLibroActual<br>
     * Métodos a probar:<br>
     * darLibroActual
     */
    public void testDarLibroActual( )
    {
        setupEscenario1( );
        try
        {
            Libro libroActual = cuentosInfantiles.darLibroActual( );
            assertEquals( "La obra actual no es correcta ", "Los tres cerditos", libroActual.darNombre( ) );
        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 3 - Prueba el método darLibroSiguiente<br>
     * Métodos a probar:<br>
     * darLibroSiguiente<br>
     * Caso de prueba 1:<br>
     * Existe libro siguiente, darUltimoLibro<br>
     */
    public void testDarLibroSiguiente1( )
    {
        setupEscenario1( );
        Libro libroActual;
        // Existe libro siguiente
        try
        {
            libroActual = cuentosInfantiles.darLibroSiguiente( );
            assertEquals( "La obra no es correcta", "Rapunzel", libroActual.darNombre( ) );

            libroActual = cuentosInfantiles.darLibroSiguiente( );
            assertEquals( "La obra no es correcta", "Hansel y Gretel", libroActual.darNombre( ) );

            libroActual = cuentosInfantiles.darLibroSiguiente( );
            assertEquals( "La obra no es correcta", "Caperucita Roja", libroActual.darNombre( ) );

        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 4 - Prueba el método darLibroSiguiente<br>
     * Métodos a probar:<br>
     * darLibroSiguiente<br>
     * Caso de prueba 2:<br>
     * Se encuentra en el último libro
     */
    public void testDarLibroSiguiente2( )
    {
        setupEscenario1( );
        // Se encuentra en el último libro
        try
        {
            cuentosInfantiles.darUltimoLibro( );
            cuentosInfantiles.darLibroSiguiente( );
            fail( "Debería generar excepción" );
        }
        catch( Exception e )
        {
            // Debe pasar por aquí
        }
    }

    /**
     * Prueba 5 - Prueba el método darLibroAnterior<br>
     * Métodos a probar:<br>
     * darLibroAnterior, darUltimoLibro<br>
     * Caso de prueba 1:<br>
     * Ya se encuentra en el primer libro
     */
    public void testDarLibroAnterior1( )
    {
        setupEscenario1( );

        // Ya se encuentra en el primer libro
        try
        {
            cuentosInfantiles.darLibroAnterior( );
            fail( "Debería generar excepción" );
        }
        catch( Exception e )
        {
            // Debe pasar por aquí
        }
    }

    /**
     * Prueba 6 - Prueba el método darLibroAnterior<br>
     * Métodos a probar:<br>
     * darLibroAnterior, darUltimoLibro<br>
     * Caso de prueba 2: <br>
     * Existe libro anterior
     */
    public void testDarLibroAnterior2( )
    {
        setupEscenario1( );

        // Existe libro anterior
        try
        {
            Libro libroActual = cuentosInfantiles.darUltimoLibro( );
            libroActual = cuentosInfantiles.darLibroAnterior( );
            assertEquals( "La obra no es correcta", "Ricitos de oro", libroActual.darNombre( ) );

            libroActual = cuentosInfantiles.darLibroAnterior( );
            assertEquals( "La obra no es correcta", "Pinocho", libroActual.darNombre( ) );

            libroActual = cuentosInfantiles.darLibroAnterior( );
            assertEquals( "La obra no es correcta", "Caperucita Roja", libroActual.darNombre( ) );
        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 7 - Prueba el método darPrimerLibro<br>
     * Métodos a probar:<br>
     * darPrimerLibro<br>
     * Caso de prueba: <br>
     * Ya se encuentra en el primer libro<br>
     */
    public void testDarPrimerLibro1( )
    {
        setupEscenario1( );
        // Ya se encuentra en el primer libro
        try
        {
            cuentosInfantiles.darPrimerLibro( );
            fail( "Debería generar excepción" );
        }
        catch( Exception e )
        {
            // Debe pasar por aquí
        }
    }

    /**
     * Prueba 8 - Prueba el método darPrimerLibro<br>
     * Métodos a probar:<br>
     * darPrimerLibro<br>
     * Caso de prueba:<br>
     * No se encuentra en el primer libro
     */
    public void testDarPrimerLibro2( )
    {
        setupEscenario1( );
        // No se encuentra en el primer libro
        try
        {
            Libro obra = cuentosInfantiles.darLibroSiguiente( );
            obra = cuentosInfantiles.darPrimerLibro( );
            assertEquals( "La obra no es correcta", "Los tres cerditos", obra.darNombre( ) );

        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 9 - Prueba el método darUltimoLibro<br>
     * Métodos a probar:<br>
     * darUltimoLibro<br>
     * Caso de prueba: <br>
     * No se encuentra en el último libro<br>
     */
    public void testDarUltimoLibro1( )
    {
        setupEscenario1( );
        // No se encuentra en el último libro
        Libro obra;
        try
        {
            obra = cuentosInfantiles.darUltimoLibro( );
            assertEquals( "La obra no es correcta", "La liebre y la tortuga", obra.darNombre( ) );
        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 10 - Prueba el método darUltimoLibro<br>
     * Métodos a probar:<br>
     * darUltimoLibro<br>
     * Caso de prueba:<br>
     * Ya se encuentra en el último libro
     */
    public void testDarUltimoLibro( )
    {
        setupEscenario1( );

        // Ya se encuentra en el último libro
        try
        {
            cuentosInfantiles.darUltimoLibro( );
            cuentosInfantiles.darUltimoLibro( );
            fail( "Debería generar excepción" );
        }
        catch( Exception e )
        {
            // Debe pasar por aquí
        }
    }

    /**
     * Prueba 11 - Prueba el método darLibroPorNombre<br>
     * Métodos a probar:<br>
     * darLibroPorNombre<br>
     * Caso de prueba 1:<br>
     * El libro buscado existe<br>
     */
    public void testDarLibroPorNombre1( )
    {
        setupEscenario1( );
        try
        {
            Libro libro = cuentosInfantiles.darLibroPorNombre( "Ricitos de oro" );
            assertEquals( "La obra no es correcta", "data/imagenes/RicitosDeOro.png", libro.darImagen( ) );
        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 12 - Prueba el método darLibroPorNombre<br>
     * Métodos a probar:<br>
     * darLibroPorNombre<br>
     * Caso de prueba:<br>
     * El libro buscado no existe
     */
    public void testDarLibroPorNombre2( )
    {
        setupEscenario1( );
        try
        {
            cuentosInfantiles.darLibroPorNombre( "Blancanieves" );
            fail( "Debería generar la excepción" );
        }
        catch( Exception e )
        {
            // Debe pasar por aquí
        }
    }

    /**
     * Pruea 13 - Prueba el método comprarLibroActual<br>
     * Métodos a probar:<br>
     * comprarLibroActual
     */
    public void testComprarLibroActual( )
    {
        try
        {
            setupEscenario1( );
            cuentosInfantiles.comprarLibroActual( );

            assertEquals( "No realizó la  compra correctamente", 1, cuentosInfantiles.darLibroActual( ).darUnidadesVendidas( ) );
            cuentosInfantiles.comprarLibroActual( );
            assertEquals( "No realizó la  compra correctamente", 2, cuentosInfantiles.darLibroActual( ).darUnidadesVendidas( ) );
            cuentosInfantiles.comprarLibroActual( );
            assertEquals( "No realizó la  compra correctamente", 3, cuentosInfantiles.darLibroActual( ).darUnidadesVendidas( ) );

            cuentosInfantiles.darUltimoLibro( );
            cuentosInfantiles.comprarLibroActual( );
            assertEquals( "No realizó la  compra correctamente", 1, cuentosInfantiles.darLibroActual( ).darUnidadesVendidas( ) );
        }
        catch( Exception e )
        {
            fail( "No debería generar Excepcion" );
        }

    }

    /**
     * Prueba 14 - Prueba el método darTotalUnidadesVendidas<br>
     * Métodos a probar:<br>
     * darTotalUnidadesVendidas, darCantidadLibros, comprarLibroActual, darLibroSiguiente
     */
    public void testDarTotalUnidadesVendidas( )
    {
        setupEscenario1( );
        try
        {
            int cantidadVendida = 0;
            for( int i = 0; i < cuentosInfantiles.darCantidadLibros( ) - 1; i++ )
            {
                for( int j = 0; j < i + 1; j++ )
                {
                    cuentosInfantiles.comprarLibroActual( );
                    cantidadVendida++;
                    assertEquals( "No calcula la cantidad total de libros vendidos correctamente", cantidadVendida, cuentosInfantiles.darTotalUnidadesVendidas( ) );
                }
                cuentosInfantiles.darLibroSiguiente( );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace( );
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 15 - Prueba el método darTotalRecaudado<br>
     * Métodos a probar:<br>
     * darTotalRecaudado, darCantidadLibros, darLibroActual, darLibroSiguiente
     */
    public void testDarTotalRecaudado( )
    {
        setupEscenario1( );
        try
        {
            double cantidadRecaudada = 0;
            Libro actual = null;
            for( int i = 0; i < cuentosInfantiles.darCantidadLibros( ) - 1; i++ )
            {
                actual = cuentosInfantiles.darLibroActual( );
                for( int j = 0; j < i + 1; j++ )
                {
                    cuentosInfantiles.comprarLibroActual( );
                    cantidadRecaudada += actual.darPrecio( );
                    assertEquals( "No calcula la cantidad total de libros vendidos correctamente", cantidadRecaudada, cuentosInfantiles.darTotalRecaudado( ) );
                }
                cuentosInfantiles.darLibroSiguiente( );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace( );
            fail( "No debería generar excepción" );
        }
    }

    /**
     * Prueba 16 - Prueba el método darLibroMasVendido( )<br>
     * Métodos a probar:<br>
     * darLibroMasVendido<br>
     * Caso de prueba 1: <br>
     * No se ha vendido ningún libro<br>
     * Caso de prueba 2:<br>
     * Ya se vendieron libros
     */
    public void testDarLibroMasVendido( )
    {
        setupEscenario1( );

        // No se ha vendido ningún libro
        assertNull( "No se han vendido libros", cuentosInfantiles.darLibroMasVendido( ) );

        // Ya se vendieron libros
        cuentosInfantiles.comprarLibroActual( );

        Libro libro = cuentosInfantiles.darLibroMasVendido( );
        assertEquals( "El libro más vendido no es el esperado", "Los tres cerditos", libro.darNombre( ) );

        try
        {
            cuentosInfantiles.darLibroPorNombre( "Ricitos de oro" );
            cuentosInfantiles.comprarLibroActual( );
            libro = cuentosInfantiles.darLibroMasVendido( );
            assertEquals( "El libro más vendido on es el esperado", "Ricitos de oro", libro.darNombre( ) );

            cuentosInfantiles.darUltimoLibro( );
            cuentosInfantiles.comprarLibroActual( );
            cuentosInfantiles.comprarLibroActual( );
            libro = cuentosInfantiles.darLibroMasVendido( );
            assertEquals( "El libro más vendido on es el esperado", "La liebre y la tortuga", libro.darNombre( ) );
        }
        catch( Exception e )
        {
            fail( "No debería generar excepción" );
        }
    }
}