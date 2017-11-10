package edu.jabs.cuentosInfantiles.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelNavegacion extends JPanel{

    // Constantes

    // Atributos

    InterfazCuentosInfantiles principal;

    private JButton butAtrasA;
    private JButton butAtrasTotal;
    private JButton butComprar;
    private JButton butAdelanteTotal;
    private JButton butAdelanteA;

    // Constructor

    public PanelNavegacion(InterfazCuentosInfantiles interfazCuentosInfantiles)
    {
        principal = interfazCuentosInfantiles;

        setLayout(new GridLayout(1, 5));
        TitledBorder border = BorderFactory.createTitledBorder("Navegación");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        butAtrasA = new JButton("<");
        butAtrasTotal = new JButton("<<");
        butComprar = new JButton("Comprar");
        butAdelanteTotal = new JButton(">>");
        butAdelanteA = new JButton(">");

        add(butAtrasA);
        add(butAtrasTotal);
        add(butComprar);
        add(butAdelanteTotal);
        add(butAdelanteA);
    }

    // Métodos

}