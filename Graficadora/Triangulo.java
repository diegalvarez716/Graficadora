package com.example.graficadora;

import javax.swing.*;
import java.awt.*;

public class Triangulo extends JPanel {
    double Altura, Base;
        public Triangulo (double Base, double Altura) {
            this.Base = Base;
            this.Altura = Altura;

            JFrame frame = new JFrame("Triangulo");
            frame.setSize((int)((Base*2)+20),(int) ((Altura*2)+30));
            frame.setResizable(false);

            frame.add(this);

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        @Override
        public void paint(Graphics g){
            super.paint(g);
            g.setColor(Color.RED);
           g.drawLine((int)(Base/2),(int) ((Altura/2)+(Altura)), (int)((Base/2)+Base), (int) ((Altura/2)+(Altura)) );
           g.drawLine((int)(Base/2),(int) ((Altura/2)+(Altura)), (int)(Base), (int) ((Altura/2)) );
           g.drawLine((int)((Base/2)+Base),(int) ((Altura/2)+(Altura)), (int)(Base), (int) ((Altura/2)) );
        }


}
