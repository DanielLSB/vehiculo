/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author mutsu
 */
public class Tarjeta extends Persona {
    private String notarjeta , uso;
    
    public Tarjeta(){}

    public Tarjeta(String notarjeta, String uso, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.notarjeta = notarjeta;
        this.uso = uso;
    }
    
       public String getNotarjeta() {
        return notarjeta;
    }

    public void setNotarjeta(String notarjeta) {
        this.notarjeta = notarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
   
@Override
    public void agregar(){
    
     System.out.println("NO Tarjeta: "+ getNotarjeta());
      System.out.println("Uso: "+ getUso());
       System.out.println("Nombre: "+ getNombres());
        System.out.println("Apellidos: "+ getApellidos());
         System.out.println("Direccion: "+ getDireccion());
          System.out.println("Telefono: "+ getTelefono());
           System.out.println("Fecha nacimiento: "+ getFecha_nacimiento());
          
           
        
        
    }
   
 
    
}
