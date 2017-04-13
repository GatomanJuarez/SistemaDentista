import javax.swing.JOptionPane;
public class ListaDentista {
    protected Dentisita primero;
    
    public void ListaDentista(){
        
    }
   // protected int size;
      public void insertar ( String nom, String ap, String dir, String ed,String ced) {
	    		Dentisita value = new Dentisita (nom, ap, dir, ed,ced);
	//    		size ++;
                        Dentisita t = new Dentisita();
                        t=primero;
	    		if (primero!=null) {
                                while(t.siguiente!=null){
                                t=t.siguiente;
                                }
                                t.desplazar(value);
                        }
                        else{
                            primero = value;
                        }
	    }
  
     public Dentisita buscar(String id){
         Dentisita t;
         Dentisita q= new Dentisita();
         Dentisita r = new Dentisita();
         t=primero;
         if(t.cedula.equalsIgnoreCase(id)){
             q=t;
         }
         else{
             while(!t.cedula.equalsIgnoreCase(id) && t.siguiente!=null){
                t=t.siguiente;
             }
         }
	if(t.cedula.equalsIgnoreCase(id)){
            q=t;
        }else {
            if(t.siguiente==null){
                JOptionPane.showMessageDialog(null,"El Dentista no existe.");
                q = r;//return false;
            }
        }        
         return q;
     }
}
