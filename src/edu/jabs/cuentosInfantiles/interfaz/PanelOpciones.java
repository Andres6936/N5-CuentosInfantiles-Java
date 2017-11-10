package edu.jabs.cuentosInfantiles.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel{

    // Constantes

    // Atributos

    InterfazCuentosInfantiles principal;

    private JButton butBuscarNombre;
    private JButton butOpcion1;
    private JButton butOpcion2;

    // Constructor

    public PanelOpciones(InterfazCuentosInfantiles interfazCuentosInfantiles)
    {

        principal = interfazCuentosInfantiles;

        setLayout(new GridLayout(1,3));
        TitledBorder border = BorderFactory.createTitledBorder("Opciones");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        butBuscarNombre = new JButton("Buscar por Nombre");
        butOpcion1 = new JButton("Opcion 1");
        butOpcion2 = new JButton("Opcion 2");

        add(butBuscarNombre);
        add(butOpcion1);
        add(butOpcion2);

    }

    // Métodos

}