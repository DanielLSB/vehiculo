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
public class Propietario extends Persona  {
    private String cui, nit;
    
    public Propietario(){}

    public Propietario(String cui, String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.cui = cui;
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
        System.out.println("CUI: "+ getCui());
        System.out.println("Nit: "+ getNit());
        System.out.println("Nombres: "+ getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha nacimiento: "+ getFecha_nacimiento());
                
         
              
    
    }
    
}
