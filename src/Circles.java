import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;


public class Circles extends GraphicsProgram {
	
		public void run () {
			int i;
			for (i = 0; i < 10; i++) {
					getCircle();
		
    	}
	}
	public void getCircle() {
		int x = rgen.nextInt(0,200);
		int y = rgen.nextInt(0,200);
		int radius = rgen.nextInt(20, 75);
		GOval circle = new GOval(x,y,radius,radius);
		circle.setFilled(true);
		circle.setFillColor(rgen.nextColor());
		add(circle);
	}

	
	private static RandomGenerator rgen = RandomGenerator.getInstance();
	
}