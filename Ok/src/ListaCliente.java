import javax.swing.JOptionPane;
public class ListaCliente {
 

    protected Cliente primero;
   // protected int size;
      public void insertar ( String id,String nom, String ap, String dir, String ed,String p) {
	    		Cliente value = new Cliente (id,nom, ap, dir, ed,p);
	//    		size ++;
                        Cliente t = new Cliente();
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
  
     public Cliente buscar(String id){
         Cliente t;
         Cliente q= new Cliente();
         Cliente r = new Cliente();
         t=primero;
         if(t.id.equalsIgnoreCase(id)){
             q=t;
         }
         else{
             while(!t.id.equalsIgnoreCase(id) && t.siguiente!=null){
                t=t.siguiente;
             }
         }
	if(t.id.equalsIgnoreCase(id)){
            q=t;
        }else {
            if(t.siguiente==null){
                JOptionPane.showMessageDialog(null,"El Cliente no existe.");
                q = r;//return false;
            }
        }        
         return q;
     }

}
