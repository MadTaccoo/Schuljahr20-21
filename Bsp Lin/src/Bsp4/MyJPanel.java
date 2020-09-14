package Bsp4;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics2D;

public class MyJPanel extends JPanel{

  
  public Color default_color = Color.black; //Vordergrundfarbe
  public Color frg_color = default_color; //Vordergrundfarbe
  
  
  private int dx = 50;
  private double arc = 0;
  
  public void run(){
    dx += 2;
    arc += 0.3;
    repaint();
  }
  
  public void paint(Graphics g){
    super.paintComponent(g); //mit der Paint von JPanel wird nur der Vordergrund neu gezeichnet.
                 //um auch den Hintergrund neu zu zeichnen, muss paintComponent der
                 //Superklasse aufgerufen werden.
    Graphics2D g2 = (Graphics2D) g;    
    
    g2.setColor(frg_color);
    g2.translate(dx,50);
    g2.drawLine(0, 20, 100,150);
    g2.rotate(arc);
    g2.drawArc(0,0, 30,30, 0,180);
    
    System.out.println("dx = " + dx);
    
  }//end paint

}//end class
