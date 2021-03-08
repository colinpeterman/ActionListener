import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class   DialPanel extends JPanel {

 DialPanel () {
	 setLayout(new GridLayout(3,3));
	 Button one = new Button("1");
	 one.addActionListener(new KeyListener());
	 add(one);
	
	 Button two = new Button("2");
	 two.addActionListener(new KeyListener());
	 add(two);
	 
	 Button three = new Button("3");
	 three.addActionListener(new KeyListener());
	 add(three);
	 
	 Button four = new Button("4");
	 four.addActionListener(new KeyListener());
	 add(four);
	 
	 Button five = new Button("5");
	 five.addActionListener(new KeyListener());
	 add(five);
	 
	 Button six = new Button("6");
	 six.addActionListener(new KeyListener());
	 add(six);
	 
	 Button seven = new Button("7");
	 seven.addActionListener(new KeyListener());
	 add(seven);
	 
	 Button eight = new Button("8");
	 eight.addActionListener(new KeyListener());
	 add(eight);
	 
	 Button nine = new Button("9");
	 nine.addActionListener(new KeyListener());
	 add(nine);
// a  3x3 gridlayout with the numbers 1... 9
	 


     } 

}
