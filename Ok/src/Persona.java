
public class Persona {
 
    
    String nombre, apellido, direccion, edad;
 //   Persona siguiente;
   // Persona anterior;
    
    public Persona(){
        
    }
    
    public Persona(String nom, String ap, String dir, String ed){
        this.nombre=nom;
        this.apellido=ap;
        this.direccion=dir;
        this.edad=ed;
       // this.siguiente=siguiente;
}
    public String getN(){
        return nombre;
    }
    void desplazar (Persona anterior) {
    //	this.anterior = anterior;
    }
    
      
    
}
   

