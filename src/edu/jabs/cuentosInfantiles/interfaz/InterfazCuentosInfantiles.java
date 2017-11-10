package edu.jabs.cuentosInfantiles.interfaz;


import java.awt.BorderLayout;

import javax.swing.JFrame;

import javafx.scene.layout.Border;

public class InterfazCuentosInfantiles extends JFrame
{

    // Constantes

    // Atributos

    private PanelLibro panelInfoLibro;
    private PanelLibroVendido panelLibroVendido;
    private PanelRecaudos panelRecaudos;
    private PanelNavegacion panelNavegacion;
    private PanelOpciones panelOpciones;

    // Constructor

    public InterfazCuentosInfantiles()
    {
        setTitle("CuentosInfantiles");
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        panelInfoLibro = new PanelLibro( this );
        add(panelInfoLibro, BorderLayout.PAGE_START);

        panelLibroVendido = new PanelLibroVendido( this );
        add(panelLibroVendido, BorderLayout.WEST);

        panelRecaudos = new PanelRecaudos( this );
        add(panelRecaudos, BorderLayout.LINE_END);

        panelNavegacion = new PanelNavegacion( this );
        add(panelNavegacion, BorderLayout.BEFORE_LINE_BEGINS);

        panelOpciones = new PanelOpciones( this );
        add(panelOpciones, BorderLayout.SOUTH);
    }

    // Métodos

    public static void main(String[] args) throws Exception
    {
        InterfazCuentosInfantiles ventana = new InterfazCuentosInfantiles();
        ventana.setVisible(true);
    }

}