import java.awt.Color;    
import java.awt.GradientPaint;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.awt.Point;  
import java.awt.RenderingHints;  
import javax.swing.JPanel; 
import java.awt.LayoutManager;
import java.awt.*;
public class Pan extends JPanel {  
  

    public Pan() {  
        setOpaque(false);  
    }  
  
    @Override  
    public void paintComponent(Graphics g) {  
        Color az=new Color (255,255,255);
        Graphics2D g2d = (Graphics2D) g;  
  
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,  
                RenderingHints.VALUE_ANTIALIAS_ON);  
  
        GradientPaint gradientPaint = new GradientPaint(  
                new Point(0, 0),  
                az,  
                new Point(0, getHeight() / 2),  
                Color.gray);  
          
        g2d.setPaint(gradientPaint);  
  
        g2d.fillRect(0, 0, getWidth(), getHeight());  
  
        super.paintComponent(g);  
    }  
} 

