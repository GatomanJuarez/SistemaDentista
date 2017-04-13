import javax.swing.JOptionPane;

  



public class Dentisita extends Persona  {
	String cedula;
        Dentisita siguiente;
        Dentisita anterior;
        protected Dentisita primero;
	
        public Dentisita(){
            
        }
    public Dentisita(String nom, String ap, String dir, String ed, String ced) {
        super(nom,ap,dir,ed);
        this.cedula=ced;
        
    }
    void desplazar (Dentisita s) {
    	this.siguiente = s;
    
    }
    
    
  
}
