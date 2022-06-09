/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Revista;
import servicio.RevistaServicio;

/**
 *
 * @author User
 */
public class RevistaControl {
   private final RevistaServicio revistaServicio = new RevistaServicio();
    
    public Revista crear(String [] params){
        var revista = new Revista(Integer.valueOf(params[0]),params[1]);
        this.revistaServicio.crear(revista);
        return revista;
    }
    
    public List<Revista> listar()
    {
        return this.revistaServicio.listar();
    }
}
