import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LightenFrame extends Frame {
	
	private int tag;
	
	public LightenFrame(int x) {
		tag = x;
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		LightenFrame window1 = new LightenFrame(2019);
		window1.setLocation(new Point(0, 0));
		window1.setBackground(new Color (100,100,200));
		String one = Integer.toString(window1.tag);
		window1.setTitle(one);
		
		Button b1 = new Button("Brighten");
		LightenFrame.LightenListener listener = window1.new LightenListener();
		b1.addActionListener(listener);
		window1.setLayout(new FlowLayout());
		b1.setVisible(true);
		window1.add(b1);

		

	}
	
	public class LightenListener implements ActionListener {

		LightenListener ( ) {
			
		  }

		public void actionPerformed(ActionEvent e){
		    // setBackground( new  Color(150,100,100));
		    Color g = getBackground();
		    g = g.brighter();
		    setBackground(g);

		   }

		private void lighten(){

		}


		}
	

}
