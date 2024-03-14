/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.modelo;

/**
 *
 * @author Usuario
 */
public class Objeto 
{
    private int id;
    private String nombre;

    public Objeto(int id, String nombre) 
    {
        this.id = id;
        this.nombre = nombre;
    }
    
     public Objeto() 
    {
        this.id = 0;
        this.nombre = "";
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public String toString() 
    {
        return "Objeto{" + "id:" + id + ", nombre del sujeto o persona a la cual se le ah asignado la variable de tipo nombre:" + nombre;
    }
    
    
    
    
    
    
    
}
