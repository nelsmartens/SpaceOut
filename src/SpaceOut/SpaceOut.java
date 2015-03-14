package SpaceOut;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;
 
public class SpaceOut extends Applet {
 
     private BufferedImage img;
 
     public void init() {
    	 
    	 resize(500,500);
    	 
    	 setBackground ( Color.black );
    	 
         try {
        	 //URL url = new URL(getCodeBase(), "http://www.arcscience.com/otherProducts/images/1.jpg");
   
        	  URL url = new URL(getCodeBase(), "file:///home/nelsmartens/src/workspace/SpaceOut/images/earth-110px.png");
             
             img = ImageIO.read(url);
             
         } catch (IOException e) {
        	 
        	 
         }
         
     }
 
     public void paint(Graphics g) {
    	 
       g.drawImage(img, 100, 250, null);
    
     }
}

