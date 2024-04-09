/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD5_Repaso_Interfaz_ventana;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Juan Carlos
 */
public class TiposComponentesInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Creamos un objeto de cada componente
        JLabel etiqueta = new JLabel("Etiqueta");
        JButton boton = new JButton("botón");
        JTextField campoTexto = new JTextField("Campo de texto");
        JTextArea areaTexto = new JTextArea("Area de texto");
        JCheckBox botonComprobacion = new JCheckBox("Botón Comprobación");
        JRadioButton botonRadio = new JRadioButton("Radio Button");
        String listaElementos[] ={"elemento1", "elemento2", "elemento3"};
        JComboBox ListaDesplegable = new JComboBox(listaElementos);

        //Añadimos los elementos al panel de la ventana 
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.getContentPane().add(etiqueta);
        ventana.getContentPane().add(boton);
        ventana.getContentPane().add(campoTexto);
        ventana.getContentPane().add(areaTexto);
        ventana.getContentPane().add(botonComprobacion);
        ventana.getContentPane().add(botonRadio);
        ventana.getContentPane().add(ListaDesplegable);

        ventana.setSize(500, 100);
        ventana.setLocation(300, 300);
        ventana.setVisible(true);
    }

}
