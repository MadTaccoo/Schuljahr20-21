package Bsp4;

import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class Control implements ActionListener  {
  
  private MyJPanel pnl;
  
  private enum EnBtn {
    Rot(0), Gelb(1), Gruen(2), Blau(3), Schieben(4);
    public int index;

    private EnBtn(int hi) {
      index = hi;
    }
  }// end enum
  
  public static ArrayList<JButton> btn;    // f�r jede Konstante im enum EnBtn wird hier ein Buttonobjekt erzeugt und eingetragen
  
  public Control(){
    btn = new ArrayList<JButton>();
    for (EnBtn b : EnBtn.values()) {       // Schleife �ber alle Konstanten aus dem enum EnBtn
      btn.add(new JButton(b.toString()));  // Erzeugen der Buttons und eintragen in die Liste btn.
      btn.get(btn.size() - 1).addActionListener(this); // dem neuen Button wird der Actionlistener zugeordnet
    }
  }
    
  public void init(MyJPanel pa){
    pnl = pa; 
  }
  
  public void actionPerformed(ActionEvent e){
    Object quelle = e.getSource();

    if(quelle == btn.get(EnBtn.Gruen.index)){
      pnl.frg_color = pnl.default_color;
      pnl.setBackground(Color.green);
    }
    else if(quelle == btn.get(EnBtn.Rot.index)) {
      pnl.frg_color = pnl.default_color;
      pnl.setBackground(Color.red);
    } 
    else if(quelle == btn.get(EnBtn.Blau.index)){ 
      pnl.frg_color = Color.white;
      pnl.setBackground(Color.blue);
    }
    else if(quelle == btn.get(EnBtn.Gelb.index)) {
      pnl.frg_color = pnl.default_color;
      pnl.setBackground(Color.yellow);
    }
    else if(quelle == btn.get(EnBtn.Schieben.index)) {
      pnl.run();
    }
  }//end Actionlistener
  
}//end class
