import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {
	
	public void paint (Graphics g){
	   String str = getParameter("msg");
	   g.drawString(str,60,110);
	   g.drawString("Hello Java",50,100);}
	   
	
}