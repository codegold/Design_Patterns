package src.sort;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;

    public void init(){
        message = "Hello World, I'm alive!";
        repaint();
    }

    public void start(){
        message = "Now I'm starting up!";
        repaint();
    }

    public void stop(){
        message = "Oh, now I'm being stopped...";
    }

    public void destroy(){
        //applet destroying...
    }

    public void paint(Graphics g){
        g.drawString(message, 5 ,15);
    }
}
