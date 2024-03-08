package com.example.graficadora;
import javax.swing.*;
import java.awt.*;


public class Rectangulo extends JPanel{
    double Ancho, Altura;

    public Rectangulo(double altura, double ancho) {
        this.Ancho = ancho;
        this.Altura = altura;

        JFrame frame = new JFrame("Rectangulo");
        frame.setSize((int)((Ancho*2)+20),(int) ((Altura*2)+30));
        frame.setResizable(false);

        frame.add(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect((int) (Ancho/2),(int) (Altura/2), (int)Ancho, (int)Altura);

    }

}
