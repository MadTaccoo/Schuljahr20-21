package Bsp4;

public class Start{
  
  public static void main(String[] args) {
    Control ctrl = new Control();
    MyFrame f= new MyFrame(ctrl);
    ctrl.init(f.pa);
    f.setVisible(true);
  }
  
}//end class
