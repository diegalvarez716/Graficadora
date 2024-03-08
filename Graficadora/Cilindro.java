package com.example.graficadora;

import javax.swing.*;
import java.awt.*;

public class Cilindro extends JPanel{
    double Radio, Altura;

    public Cilindro(double radio, double altura) {

        this.Radio = radio;
        this.Altura = altura;

        JFrame frame = new JFrame("Cilindro");
        frame.setSize((int)((Radio*2)+20),(int) ((Altura*2)+30));
        frame.setResizable(false);

        frame.add(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillOval((int)(Radio/2), (int)(Altura/2),(int)Radio, 10);
        g.fillOval((int)(Radio/2), (int)((Altura/2)+Altura),(int)Radio, 10);
        g.drawLine((int)(Radio/2),(int)((Altura/2)+5), (int)(Radio/2), (int)((Altura/2)+Altura+5));
        g.drawLine((int)((Radio/2)+Radio),(int)((Altura/2)+5), (int)((Radio/2)+Radio), (int)((Altura/2)+Altura+5));
    }

}
