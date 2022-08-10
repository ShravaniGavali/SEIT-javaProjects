import java.awt.*;
import java.applet.Applet;

public class Simple extends Applet
{
    String s;
    public void init()
    {
        s = "Hello World";
    }

    public void paint(Graphics g)
    {
        g.drawString(s,100,100);
    }
}