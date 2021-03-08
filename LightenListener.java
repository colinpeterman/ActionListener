import   java.util.*;
import   java.awt.event.*;
import   java.awt.Color;

public class LightenListener implements ActionListener {

LightenListener ( ) {


  }

public void actionPerformed(ActionEvent e)
   {
    setBackgroundColor( new  Color(150,100,100));
    Color g = getBackground();
    g = g.brighter();
    setBackgroundColor(g);

   }

private void lighten(){



}


}
