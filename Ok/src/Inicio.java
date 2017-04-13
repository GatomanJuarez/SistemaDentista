import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Inicio extends JFrame implements ActionListener{
	JLabel usuario = new JLabel("Usuario");
	JLabel contra = new JLabel("Contraseña");
	JTextField usuariotxt = new JTextField(10);
	JPasswordField contratxt = new JPasswordField(10);
	JButton aceptar = new JButton("Ingresar"); 
       ImageIcon o = new ImageIcon("lol.jpg");
        JLabel fondo = new JLabel(o);
        
        
        
    
   public Inicio() {
   	
    
       
   	super("Dr. Muelas Contentas S.A de C.V.");
       
   	setDefaultCloseOperation(EXIT_ON_CLOSE);  
     //   Image ima= new ImageIcon (getClass().getResource("D:/Oscar/IMAGENES/xD.png")).getImage();
	//setIconImage(ima);
        
        //setSize(400,200); 
        this.setResizable(false);
        this.setLocation(500,100);
       // JPanel panel =new JPanel();
        Pan panel= new Pan();
        aceptar.addActionListener(this);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints config = new GridBagConstraints(); 
        	fondo.setOpaque(false); 
        fondo.setVisible(true);
        posiciones(0,0,config);
        panel.add(fondo,config);
       
      
        posiciones(1,1,config);
        panel.add(usuario,config);
        posiciones(2,1,config);
        panel.add(usuariotxt,config);
        posiciones(1,2,config);
        panel.add(contra,config);
        posiciones(2,2,config);
        panel.add(contratxt,config);
        posiciones(2,3,config);
        panel.add(aceptar,config);
        
        setContentPane(panel);
        //Fondo
	//((JPanel)getContentPane()).setOpaque(false);
        //ImageIcon imga = new ImageIcon("fondo1.jpeg");
        //JLabel fondo = new JLabel(imga);
	//fondo.setBounds(-4,-14,img.getIconWidth(),img.getIconHeight());
	//getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
    }
    
    public static void posiciones(int x, int y, GridBagConstraints config){
        config.gridx=x;
        config.gridy=y;
    }
    public static void main(String args[]){
        Inicio obj = new Inicio();
        obj.show();
        obj.pack();
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource()==aceptar){
            if(usuariotxt.getText().equalsIgnoreCase("Admon")){
                if(contratxt.getText().equalsIgnoreCase("12345")){
                  //  JOptionPane.showMessageDialog(null,"lol");
                    setVisible(false);
                    Menu obj = new Menu();
                    obj.show();
                    obj.setSize(400,400);
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                    contratxt.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Usuario incorrecta");
                usuariotxt.setText("");
            }
        }
    
    
    
    
   
}
    
}
