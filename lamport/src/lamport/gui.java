/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamport;

import javax.swing.JFrame;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Mythos
 */
public class gui extends JFrame {

    public JPanel panel_uno, panel_dos, panel_tres, panel_cuatro, panel_cinco;
    public JLabel etiqueta_uno, etiqueta_dos, etiqueta_tres;
    public TextArea a1, a2, a3, a4, a5;

    public gui() {
        super("Lamport");
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        etiqueta_uno = new JLabel("Proceso 1");
        etiqueta_dos = new JLabel("Proceso 2");
        etiqueta_tres = new JLabel("Proceso 3");
        a1 = new TextArea(15, 5);
        a1.setEditable(false); //para q no se pueda editar el area de texto
        a2 = new TextArea(15, 5);
        a2.setEditable(false); //para q no se pueda editar el area de texto
        a3 = new TextArea(15, 5);
        a3.setEditable(false); //para q no se pueda editar el area de texto
        a4 = new TextArea(10, 60);
        a4.setEditable(false); //para q no se pueda editar el area de texto

        panel_uno = new JPanel(new FlowLayout());
        panel_dos = new JPanel(new FlowLayout());
        panel_tres = new JPanel(new FlowLayout());
        panel_cuatro = new JPanel(new FlowLayout());
        panel_uno.add(etiqueta_uno);
        panel_uno.add(a1);
        panel_dos.add(etiqueta_dos);
        panel_dos.add(a2);
        panel_tres.add(etiqueta_tres);
        panel_tres.add(a3);
        panel_cuatro.add(new JLabel("Detalles:"));
        panel_cuatro.add(a4);
        setSize(800, 800);
        setVisible(true);

//centramos la pantalla
//obtenemos la dimension de la pantalla de cliente
        Dimension dim_pantalla = Toolkit.getDefaultToolkit().getScreenSize();

// Una cuenta para situar la ventana en el centro de la pantalla.
        setLocation((dim_pantalla.width - this.getWidth()) / 2, (dim_pantalla.height - this.getHeight()) / 2);

        contenedor.add(panel_uno, BorderLayout.WEST);
        contenedor.add(panel_dos, BorderLayout.CENTER);
        contenedor.add(panel_tres, BorderLayout.EAST);
        contenedor.add(panel_cuatro, BorderLayout.SOUTH);
        setResizable(false);

    }
}
