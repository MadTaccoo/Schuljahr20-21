package Bsp4;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
  public MyJPanel pa = new MyJPanel();
  
  private JPanel bleiste = new JPanel();
  
  
  public MyFrame(Control ctrl){
    super("Botton-Klick Frame");
    setSize(500,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add("South",bleiste);
    getContentPane().add("Center", pa);
    
    for (int i=0; i< ctrl.btn.size(); i++) { // Alle Buttons in die Button-Leiste legen
      bleiste.add(ctrl.btn.get(i));
    }
    
    bleiste.setBackground(Color.DARK_GRAY);
    pa.setBackground(Color.cyan);
  }//
    
  
  
}//end class
