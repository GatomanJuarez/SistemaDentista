 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;



public class Menu extends JFrame implements ActionListener{
    /////////////////////////////////////////////////////////////////////////
    //                                                                     //
    /////////////////////////////////////////////////////////////////////////
    ListaCliente lista1= new ListaCliente();
    ListaDentista lista2 = new ListaDentista();
    Cliente busquedaCte= new Cliente();
    Dentisita busquedaDen= new Dentisita();

    String variable="",horas="",mess="",dias="";
    
    ///////////////////////////
   Pan panel = new Pan();
   JPanel panel1 = new JPanel();
   JPanel panel3 = new JPanel();
   ImageIcon i = new ImageIcon("lol.jpg");
   JLabel img = new JLabel(i);
   
   
   JPanel panel2 = new JPanel();
   GridBagConstraints config = new GridBagConstraints();
    
   // JList lista = new JList(opciones);
    JButton citar =new JButton("Citar");
    JButton consultar =new JButton("Consultar");
    JButton cte = new JButton("Agregar Cliente");
    JButton den = new JButton("Agregar Dentisita");
    JLabel area = new JLabel("_________________________");
    
    /////////////////////////////////////////////
        JLabel nombre = new JLabel("Nombre");
        JLabel apellido = new JLabel("Apellido");
        JLabel direccion = new JLabel("Direccion");
        JLabel edad = new JLabel("Edad");
        JLabel idCte = new JLabel("ID Cliente");
        JLabel cedula = new JLabel("Cedula");
        
        String [] opciones = {"-Selecciones edad-","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","+40"};
        JTextField nombretxt = new JTextField(10);
        JTextField apellidotxt = new JTextField(10);
        JTextField direcciontxt = new JTextField(10);
        JTextField idCtetxt = new JTextField(10);
        JTextField cedulatxt = new JTextField(10);
        JComboBox edadCom = new JComboBox(opciones);
        JButton agregarcte = new JButton("Agregar");
        JButton cancelar = new JButton("Cancelar");
        JButton agregarden = new JButton("Agregar");
        ///////////////////////////////////////////////////////////
        String[] diaVec = {"-Selecciones Dia-","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] mesVec = {"-Selecciones Mes-","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String[] horaVec = {"-Selecciones hora-","10","11","12"};
        JLabel cliente = new JLabel("Cliente ID");
        JTextField clienteNom = new JTextField();
        JLabel dentista = new JLabel("Dentista Cedula");
        JTextField dentistaNom = new JTextField();
        JLabel hora = new JLabel("Hora");
        JLabel dia = new JLabel("Dia ");
        JLabel mes = new JLabel("Mes");
        JComboBox horaCom = new JComboBox(horaVec);
        JComboBox mesCom = new JComboBox(mesVec);
        JComboBox diaCom = new JComboBox(diaVec);
        
        JButton citaboton = new JButton("Citar");
        JButton consu = new JButton("Consultar");
        JLabel consulta = new JLabel("Aqui tu consulta");
        JLabel consulta2 = new JLabel("");
        JLabel consulta3 = new JLabel("");
        JLabel consulta4 = new JLabel("");
        JLabel consulta5 = new JLabel("");
        JLabel consulta6= new JLabel("");
        
        
        //(()()()()()(()()()()()()()()()()())(()()()()()()()()()()()()()()()()
        
        
        //()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()
        
public Menu(){
        super("Menu");
        this.setResizable(false);
        this.setLocation(500,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         pack();
         
         panel3.add(img);
         
        panel.setLayout(new GridBagLayout());
        panel1.setLayout(new GridBagLayout());
        panel2.setLayout(new GridBagLayout());
        panel1.setOpaque(false);
        panel2.setOpaque(false);
        citar.addActionListener(this);
        consultar.addActionListener(this);
        cte.addActionListener(this);
        den.addActionListener(this);
        edadCom.addActionListener(this);
        agregarcte.addActionListener(this);
        agregarden.addActionListener(this);
        cancelar.addActionListener(this);
        consultar.addActionListener(this);
        consu.addActionListener(this);
        citaboton.addActionListener(this);
        diaCom.addActionListener(this);
        mesCom.addActionListener(this);
        horaCom.addActionListener(this);
        
        config.fill = GridBagConstraints.HORIZONTAL;
        coo(0,0,config);
        panel1.add(citar,config);
        coo(0,3,config);
        panel1.add(consultar, config);
        coo(0,1,config);
        panel1.add(cte, config);
        coo(0,2,config);
        panel1.add(den, config);
        
        setContentPane(panel1);
        
        panel2.add(area);
        agregarCte();
        agregarDen();
        agregarcita();
        agregarConsultar();
        
        GridBagConstraints config2 = new GridBagConstraints();
		coo(0,0,config2);
		config2.gridheight=2;
		config2.gridwidth=2;
        panel.add(panel3,config2);        
        coo(0,2,config);
        panel.add(panel1,config);
        coo(1,2,config);
        panel.add(panel2,config);
        setContentPane(panel);       
        
        
    }
//public static void main(String [] argas){
  //      Menu obj = new Menu();
    //   obj.pack();
     //  obj.show();
   // }
    @Override
public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        try{
       
        if(o==cte){
            limpiar();
            Cte();
        }else if(o==agregarcte){            
             lista1.insertar(idCtetxt.getText(),nombretxt.getText(),apellidotxt.getText(),direcciontxt.getText(),variable,"");
             limpiar();
             
        }else if(o==edadCom){
            variable = (String)edadCom.getSelectedItem();
        }else if(o==den){
            limpiar();
            Den();
        } else if(o==citar){
            limpiar();
            citar();
        }else if(o==agregarden){
             lista2.insertar(nombretxt.getText(),apellidotxt.getText(),direcciontxt.getText(),variable,cedulatxt.getText());
            limpiar();
        }else if(o==cancelar){
            cteOff();
            denOff();
            citarOff();
            prin();
            consultarOff();
        }else if(o==consultar){
            consultar();            
        }else if(o==consu){
            consulta.setText("");
            if(idCtetxt.getText().equalsIgnoreCase("")&&cedulatxt.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Numeroooo");
            }else{
                if(!idCtetxt.getText().equalsIgnoreCase("")){
                busquedaCte=lista1.buscar(idCtetxt.getText());
               // String v="ID: "+busquedaCte.id+"\nNombre: "+busquedaCte.nombre+"\nApellido:  "+busquedaCte.apellido+"\nDireccion: "+
               //         busquedaCte.direccion+"\nEdad: "+busquedaCte.edad+"\nProxima Cita"+busquedaCte.prox;
                consulta.setText("ID: "+busquedaCte.id);consulta2.setText("Nombre: "+busquedaCte.nombre);consulta3.setText("Apellido:  "+busquedaCte.apellido);
                consulta4.setText("\nDireccion: "+busquedaCte.direccion);consulta5.setText("\nEdad: "+busquedaCte.edad);consulta6.setText("\nProxima Cita: "+busquedaCte.prox);
                
                } else{
                    if(!cedulatxt.getText().equalsIgnoreCase("")){
                        try{
                        busquedaDen=lista2.buscar(cedulatxt.getText());
                        }catch(Exception f){
                            JOptionPane.showMessageDialog(null,f);
                        }
                      //   String b ="Cedula: "+busquedaDen.cedula+"\nNombre: "+busquedaDen.nombre+"\nApellido:  "+busquedaDen.apellido+"\nDireccion: "+
                      //  busquedaDen.direccion+"\nEdad: "+busquedaDen.edad;
                 consulta.setText("Cedula: "+busquedaDen.cedula);consulta2.setText("Nombre: "+busquedaDen.nombre);consulta3.setText("Apellido:  "+busquedaDen.apellido);
                consulta4.setText("\nDireccion: "+busquedaDen.direccion);consulta5.setText("\nEdad: "+busquedaDen.edad);consulta6.setText("");
                        
                    }
                }
                
            }
              // limpiar(); 
        }else if(o==citaboton){
            busquedaCte=lista1.buscar(clienteNom.getText());
            busquedaDen=lista2.buscar(dentistaNom.getText());
            if(busquedaCte.id.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Cliente Incorrecto.");
            }else{
                if(busquedaDen.cedula.equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null,"Dentista Incorrecto.");
                }else{
                    busquedaCte.prox=dias+"/"+mess+" a las"+horas;
                    
                }
            }
            
            
                
        }else if(o==horaCom){
            horas = (String)horaCom.getSelectedItem();
        }else if(o==mesCom){
            mess = (String)mesCom.getSelectedItem();
        }else if(o==diaCom){
            dias = (String)diaCom.getSelectedItem();
        }
        
        }catch(Exception p){
            JOptionPane.showMessageDialog(null, "Revise los campos a llenar"+p);
            
            
        }
        
    }
public void coo(int x, int y, GridBagConstraints e){
        e.gridx=x;
        e.gridy=y;   
    }
public void agregarCte(){
         coo(0,0,config);
         panel2.add(idCte,config);
         idCte.setVisible(false);
         
         coo(1,0,config);
         panel2.add(idCtetxt,config);
         idCtetxt.setVisible(false);
         
         coo(0,1,config);
         panel2.add(nombre,config);
         nombre.setVisible(false);
         
         coo(1,1,config);
         panel2.add(nombretxt,config);
         nombretxt.setVisible(false);
         
         coo(0,2,config);
         panel2.add(apellido,config);
         apellido.setVisible(false);
         
         coo(1,2,config);
         panel2.add(apellidotxt,config);
         apellidotxt.setVisible(false);
         
         coo(0,3,config);
         panel2.add(direccion,config);
         direccion.setVisible(false);
         
         coo(1,3,config);
         panel2.add(direcciontxt,config);
         direcciontxt.setVisible(false);
         
         coo(0,4,config);
         panel2.add(edad,config);
         edad.setVisible(false);
         
         coo(1,4,config);
         panel2.add(edadCom,config);
         edadCom.setVisible(false);
         
         coo(0,6,config);
         panel2.add(agregarcte,config);
         agregarcte.setVisible(false);
         
         coo(1,6,config);
         panel2.add(cancelar,config);
         cancelar.setVisible(false);
        
    }
public void Cte (){
         denOff();
         citarOff();
         consultarOff();
         prinOff();
         area.setVisible(false);
         idCte.setVisible(true);
         idCtetxt.setVisible(true);
         nombre.setVisible(true);
         nombretxt.setVisible(true);
         apellido.setVisible(true);
         apellidotxt.setVisible(true);
         direccion.setVisible(true);
         direcciontxt.setVisible(true);
         edad.setVisible(true);
         edadCom.setVisible(true);
         agregarcte.setVisible(true);
         cancelar.setVisible(true);
         
         
         //setContentPane(panel2);
         //coo(1,0,config);
       // panel.add(panel2,config);
       // setVisible(true);
         
   
        
    }
public void Den(){
    citarOff();
    cteOff();
    consultarOff();
    prinOff();
         area.setVisible(false);
         cedula.setVisible(true);
         cedulatxt.setVisible(true);
         nombre.setVisible(true);
         nombretxt.setVisible(true);
         apellido.setVisible(true);
         apellidotxt.setVisible(true);
         direccion.setVisible(true);
         direcciontxt.setVisible(true);
         edad.setVisible(true);
         edadCom.setVisible(true);
         agregarden.setVisible(true);
         cancelar.setVisible(true);
}
public void agregarDen(){
    coo(0,1,config);
         panel2.add(cedula,config);
         cedula.setVisible(false);
         
         coo(1,1,config);
         panel2.add(cedulatxt,config);
         cedulatxt.setVisible(false);
         
         coo(0,2,config);
         panel2.add(nombre,config);
         nombre.setVisible(false);
         
         coo(1,2,config);
         panel2.add(nombretxt,config);
         nombretxt.setVisible(false);
         
         coo(0,3,config);
         panel2.add(apellido,config);
         apellido.setVisible(false);
         
         coo(1,3,config);
         panel2.add(apellidotxt,config);
         apellidotxt.setVisible(false);
         
         coo(0,4,config);
         panel2.add(direccion,config);
         direccion.setVisible(false);
         
         coo(1,4,config);
         panel2.add(direcciontxt,config);
         direcciontxt.setVisible(false);
         
         coo(0,5,config);
         panel2.add(edad,config);
         edad.setVisible(false);
         
         coo(1,5,config);
         panel2.add(edadCom,config);
         edadCom.setVisible(false);
         
         coo(0,6,config);
         panel2.add(agregarden,config);
         agregarden.setVisible(false);
         
         coo(1,6,config);
         panel2.add(cancelar,config);
         cancelar.setVisible(false);
}
public void cteOff(){
         idCte.setVisible(false);
         idCtetxt.setVisible(false);
         nombre.setVisible(false);
         nombretxt.setVisible(false);
         apellido.setVisible(false);
         apellidotxt.setVisible(false);
         direccion.setVisible(false);
         direcciontxt.setVisible(false);
         edad.setVisible(false);
         edadCom.setVisible(false);
         agregarcte.setVisible(false);
         cancelar.setVisible(false);
}	
public void denOff(){
    
         cedula.setVisible(false);
         cedulatxt.setVisible(false);
         nombre.setVisible(false);
         nombretxt.setVisible(false);
         apellido.setVisible(false);
         apellidotxt.setVisible(false);
         direccion.setVisible(false);
         direcciontxt.setVisible(false);
         edad.setVisible(false);
         edadCom.setVisible(false);
         agregarden.setVisible(false);
         cancelar.setVisible(false);
}
public void citarOff(){
    cliente.setVisible(false);
    clienteNom.setVisible(false);
    dentista.setVisible(false);
    dentistaNom.setVisible(false);
    hora.setVisible(false);
    citaboton.setVisible(false);
    cancelar.setVisible(false);
    dia.setVisible(false);
    diaCom.setVisible(false);
    mes.setVisible(false);
    mesCom.setVisible(false);
    hora.setVisible(false);
    horaCom.setVisible(false);
}
public void citar(){
    consultarOff();
    cteOff();
    denOff();
    prinOff();
    area.setVisible(false);
    cliente.setVisible(true);
    clienteNom.setVisible(true);
    dentista.setVisible(true);
    dentistaNom.setVisible(true);
    citaboton.setVisible(true);
    cancelar.setVisible(true);
    dia.setVisible(true);
    diaCom.setVisible(true);
    mes.setVisible(true);
    mesCom.setVisible(true);
    hora.setVisible(true);
    horaCom.setVisible(true);
    
        
}
public void agregarcita(){
         coo(0,0,config);
         panel2.add(cliente,config);
         cliente.setVisible(false);
         
         coo(1,0,config);
         panel2.add(clienteNom,config);
         clienteNom.setVisible(false);
         
         coo(0,1,config);
         panel2.add(dentista,config);
         dentista.setVisible(false);
         
         coo(1,1,config);
         panel2.add(dentistaNom,config);
         dentistaNom.setVisible(false);
         
         coo(0,2,config);
         panel2.add(hora,config);
         hora.setVisible(false);
         
         coo(1,2,config);
         panel2.add(horaCom,config);
         horaCom.setVisible(false);
         
         coo(0,3,config);
         panel2.add(dia,config);
         dia.setVisible(false);
         
         coo(1,3,config);
         panel2.add(diaCom,config);
         diaCom.setVisible(false);
         
         coo(0,4,config);
         panel2.add(mes,config);
         mes.setVisible(false);
         
         coo(1,4,config);
         panel2.add(mesCom,config);
         mesCom.setVisible(false);
         
         coo(0,6,config);
         panel2.add(citaboton,config);
         citaboton.setVisible(false);
         
         coo(1,6,config);
         panel2.add(cancelar,config);
         cancelar.setVisible(false);
}
public void limpiar(){
         idCtetxt.setText("");
   
         nombretxt.setText("");
         
         apellidotxt.setText("");
         
         direcciontxt.setText("");
         
         
         cedulatxt.setText("");
         
         nombretxt.setText("");
         
         apellidotxt.setText("");
         
         direcciontxt.setText("");
         
         
         clienteNom.setText("");
         
         dentistaNom.setText("");
         
         consulta.setText("");
         consulta2.setText("");
         consulta3.setText("");
         consulta4.setText("");
         consulta5.setText("");
         consulta6.setText("");
         
 
}
public void agregarConsultar(){
         coo(0,0,config);
         panel2.add(idCte,config);
         idCte.setVisible(false);
         
         coo(1,0,config);
         panel2.add(idCtetxt,config);
         idCtetxt.setVisible(false);
         
         coo(0,1,config);
         panel2.add(cedula,config);
         idCte.setVisible(false);
         
         coo(1,1,config);
         panel2.add(cedulatxt,config);
         idCte.setVisible(false);
         
         coo(0,6,config);
         panel2.add(consu,config);
         consu.setVisible(false);
         
         coo(1,6,config);
         panel2.add(cancelar,config);
         cancelar.setVisible(false);
         
         coo(0,8,config);
         panel2.add(consulta,config);
         consulta.setVisible(false);
         
         coo(0,9,config);
         panel2.add(consulta2,config);
         consulta2.setVisible(false);
         
         coo(0,10,config);
         panel2.add(consulta3,config);
         consulta3.setVisible(false);
         
         coo(0,11,config);
         panel2.add(consulta4,config);
         consulta4.setVisible(false);
         
         coo(0,12,config);
         panel2.add(consulta5,config);
         consulta5.setVisible(false);
         
         
         coo(0,13,config);
         panel2.add(consulta6,config);
         consulta6.setVisible(false);
         
}
public void consultar(){
    citarOff();
    cteOff();
    denOff();
    prinOff();
    idCte.setVisible(true);
    idCtetxt.setVisible(true);
    cedula.setVisible(true);
    cedulatxt.setVisible(true);
    cancelar.setVisible(true);
    consu.setVisible(true);
    consulta.setVisible(true);
    consulta2.setVisible(true);
    consulta3.setVisible(true);
    consulta4.setVisible(true);
    consulta5.setVisible(true);
    consulta6.setVisible(true);
}
public void consultarOff(){
    idCte.setVisible(false);
    idCtetxt.setVisible(false);
    cedula.setVisible(false);
    cedulatxt.setVisible(false);
    consu.setVisible(false);
    consulta.setVisible(false);
    consulta2.setVisible(false);
    consulta3.setVisible(false);
    consulta4.setVisible(false);
    consulta5.setVisible(false);
    consulta6.setVisible(false);
    
}
public void prin(){
    cteOff();
    denOff();
    citarOff();
    area.setVisible(true);
}
public void prinOff(){
    area.setVisible(false);
}
}
  

