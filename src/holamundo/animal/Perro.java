/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.animal;

/**
 *
 * @author J_oa_
 */
public class Perro {
    private String name;
    private String raza;
    
    Perro(String name, String raza){
        this.name = name;
        this.raza = raza;
    }
    
    /**
     * 
     * @param name
     */
    Perro(String name){
        this.name = name;
    }
    
    Perro(){
        
    }
    
    public String getName(){
        return name;
    }
    
    /** 
     * 
     * @param nuevoNombre
     */
    public void modificarNombre(String nuevoNombre){
        System.out.println("Modificando nombre..");
        name = nuevoNombre;
    }
    
    public void ladrar(){
        System.out.println("Guau guau ");
        
        ladrarPrivate();
    }
    
    
    public void ladrarConNombre(){
        System.out.println("Guau guau " + name);
        
        ladrarPrivate();
    }
    
    private void ladrarPrivate(){
        System.out.println("Guau guau de forma privada");
    }
    
    public void modificarRaza(String raza){
        this.raza = raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }

    
}
