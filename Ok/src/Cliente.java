import java.io.*;
import javax.swing.*;

 
public class Cliente extends Persona implements Serializable{
    String prox;
    String id;
    Cliente siguiente;
    //Cliente anterior;
    
    public Cliente(String id,String nom, String ap, String dir, String ed, String p){
        super(nom,ap,dir,ed);
        this.id=id;
        this.prox=p;
        
    }
    public Cliente(){
        
    }
    void desplazar (Cliente s) {
    	this.siguiente = s;
    
    
    



  
}
   
}
