 import javax.swing.*;
import java.awt.*;


 
public class Fondo1 extends JFrame {
 
    private JLabel etqImagen;
    private JPanel panel;
 
   public static void main(String args[]) {
        Fondo1 p= new Fondo1();
	  p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
 
    public Fondo1() {
        initComponents();
    }
 
    private void initComponents() {
 
        panel = new JPanel();
        etqImagen = new JLabel();
 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java-Duke");
        setResizable(false);
	  setIconImage(new ImageIcon(getClass().getResource("/src/lol.png")).getImage());  
 
        getContentPane().setLayout(new FlowLayout());
 
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setLayout(null);
 
        etqImagen.setIcon(new ImageIcon(getClass().getResource("/src/fondo1.png")));
        panel.add(etqImagen);
        etqImagen.setBounds(40, 20, 300, 256);
 
        getContentPane().add(panel);
 
        pack();
    }

}
