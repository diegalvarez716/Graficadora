
package com.example.graficadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Diego Alvarez y Javier Mujica, Objeto y abstraccion de datos

public class Main{
    JTextField campo1 = new JTextField(); JTextField campo2 = new JTextField();
    JLabel label1 = new JLabel(); JLabel label2 = new JLabel();
    JMenuBar menuBar = new JMenuBar();
    JMenu figuras = new JMenu("Figuras");
    JMenuItem rectangulo = new JMenuItem("Rectangulo"); JMenuItem triangulo = new JMenuItem("Triangulo"); JMenuItem cilindro = new JMenuItem("cilindro");
    JButton boton = new JButton("Graficar");
    String seleccion ="";

    public Main(){
        //Creando ventana principal
        JFrame frame = new JFrame();
        frame.setTitle("Graficadora");
        frame.setLayout(null);
        frame.setSize(300,200);
        frame.setResizable(false);

        //Ubicando a los campos de texto
        campo1.setBounds(100,25,150,25);
        campo2.setBounds(100,75,150,25);
        //Ubicando las estiquetas
        label1.setBounds(10,25,50,25);
        label2.setBounds(10, 75,50,25);
        //Ubicando el boton para graficar
        boton.setBounds(150, 110, 100, 25);
        //Agregandole un oyente al boton
        boton.addActionListener(new oyente2());
        //Creando el menu de figuras y añadiendolas
        frame.setJMenuBar(menuBar);
        menuBar.add(figuras);
        figuras.add(rectangulo);
        figuras.add(triangulo);
        figuras.add(cilindro);
        //Agregandole oyentes a cada opcion en el menu
        rectangulo.addActionListener(new oyente1());
        triangulo.addActionListener(new oyente1());
        cilindro.addActionListener(new oyente1());

        //Agregando todo a la ventana principal
        frame.add(campo1);
        frame.add(campo2);
        frame.add(label1);
        frame.add(label2);
        frame.add(boton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
        Main gui = new Main();
    }

    class oyente2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (seleccion.equals("Rectangulo")){
                if ((campo1.getText().isEmpty())||(campo2.getText().isEmpty())){
                    campo1.setBackground(Color.RED);
                    campo2.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Ningun campo debe estar vacio");
                }else{
                    if(Double.parseDouble(campo1.getText()) <= 0 || Double.parseDouble(campo2.getText()) <= 0){
                        campo1.setBackground(Color.RED);
                        campo2.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(null, "Solo se acepta cantidades mayores a cero");
                    }else{
                        campo1.setBackground(Color.GREEN);
                        campo2.setBackground(Color.GREEN);
                        double Altura = Double.parseDouble(campo1.getText());
                        double Ancho =  Double.parseDouble(campo2.getText());
                        Rectangulo rectangulo = new Rectangulo(Altura, Ancho);
                    }

                }
            } else if (seleccion.equals("Triangulo")) {
                if ((campo1.getText().isEmpty())||(campo2.getText().isEmpty())){
                    campo1.setBackground(Color.RED);
                    campo2.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Ningun campo debe estar vacio");
                }else{
                    if(Double.parseDouble(campo1.getText()) <= 0 || Double.parseDouble(campo2.getText()) <= 0){
                        campo1.setBackground(Color.RED);
                        campo2.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(null, "Solo se acepta cantidades mayores a cero");
                    }else{
                        campo1.setBackground(Color.GREEN);
                        campo2.setBackground(Color.GREEN);
                        double Altura = Double.parseDouble(campo1.getText());
                        double Base =  Double.parseDouble(campo2.getText());
                        Triangulo tirangulo = new Triangulo(Altura, Base);
                    }
                }
            }else if (seleccion.equals("Cilindro")){
                if ((campo1.getText().isEmpty())||(campo2.getText().isEmpty())){
                    campo1.setBackground(Color.RED);
                    campo2.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Ningun campo debe estar vacio");
                }else{
                    if(Double.parseDouble(campo1.getText()) <= 0 || Double.parseDouble(campo2.getText()) <= 0){
                        campo1.setBackground(Color.RED);
                        campo2.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(null, "Solo se acepta cantidades mayores a cero");
                    }else{
                        campo1.setBackground(Color.GREEN);
                        campo2.setBackground(Color.GREEN);
                        double Altura = Double.parseDouble(campo1.getText());
                        double Radio =  Double.parseDouble(campo2.getText());
                        Cilindro cilindro = new Cilindro(Altura, Radio);
                    }
                }
            }else {
                JOptionPane.showMessageDialog(null, "Debe selecionar una figura");
            }
        }
    }

    class oyente1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Rectangulo")){
                label1.setText("Altura");
                label2.setText("Ancho");
                seleccion = "Rectangulo";
            } else if (e.getActionCommand().equals("Triangulo")) {
                label1.setText("Altura");
                label2.setText("base");
                seleccion = "Triangulo";
            } else{
                label1.setText("Altura");
                label2.setText("Radio");
                seleccion ="Cilindro";
            }
        }
    }
}


