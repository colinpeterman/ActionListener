import java.awt.event.*;
// Listener for button 
public class KeyListener implements ActionListener {
   private static int digitCounter=0;
   public void actionPerformed(ActionEvent evt) {
   ++digitCounter;
   if ( digitCounter <= 10 ) {
     System.out.print( evt.getActionCommand());
      if (digitCounter == 3 ||  digitCounter==6 ) 
          System.out.print("-" );
   }
   else
      System.out.print("..Dialing...\n");
     }
}

