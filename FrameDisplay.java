import java.awt.Color;

import java.awt.Frame;
import java.awt.Point;

public class FrameDisplay extends Frame {
	
	private int tag;
	
	public FrameDisplay(int x) {
		tag = x;
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameDisplay window1 = new FrameDisplay(1);
		FrameDisplay window2 = new FrameDisplay(2);
		FrameDisplay window3 = new FrameDisplay(3);
		
		window1.setLocation(new Point(0, 0));
		window2.setLocation(new Point(301, 0));
		window3.setLocation(new Point(602, 0));
		window1.setBackground(Color.RED);
		window2.setBackground(Color.BLUE);
		window3.setBackground(Color.YELLOW);
		String one = Integer.toString(window1.tag);
		String two = Integer.toString(window2.tag);
		String three = Integer.toString(window3.tag);
		window1.setTitle(one);
		window2.setTitle(two);
		window3.setTitle(three);
	}

}
