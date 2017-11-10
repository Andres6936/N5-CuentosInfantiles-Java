package edu.jabs.cuentosInfantiles.interfaz;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelLibro extends JPanel{

    // Atributos

    InterfazCuentosInfantiles principal;

    private JLabel labNombre;
    private JLabel labCantidadPaginas;
    private JLabel labPrecio;
    private JLabel labUnidadesVendidas;

    private JTextField txtNombre;
    private JTextField txtCantidadPaginas;
    private JTextField txtPrecio;
    private JTextField txtUnidadesVendidas;

    // Constructor

    public PanelLibro(InterfazCuentosInfantiles interfazCuentosInfantiles)
    {
        principal = interfazCuentosInfantiles;

        setLayout(new GridLayout(4, 4));
        TitledBorder border = BorderFactory.createTitledBorder("Información Libro");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        labNombre = new JLabel("Nombre:");
        labCantidadPaginas = new JLabel("Cantidad de Páginas:");
        labPrecio = new JLabel("Precio:");
        labUnidadesVendidas = new JLabel("Unidades Vendidas:");

        txtNombre = new JTextField("");
        txtCantidadPaginas = new JTextField("");
        txtPrecio = new JTextField("");
        txtUnidadesVendidas = new JTextField("");

        add(labNombre);
        add(txtNombre);
        add(labCantidadPaginas);
        add(txtCantidadPaginas);
        add(labPrecio);
        add(txtPrecio);
        add(labUnidadesVendidas);
        add(txtUnidadesVendidas);


    }

    // Métodos

}