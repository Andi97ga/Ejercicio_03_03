/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.AutorPrincipal;
import servicio.AutorPrincipalServicio;

/**
 *
 * @author User
 */
public class AutorPrincipalControl {
    private final AutorPrincipalServicio autorPrincipalServicio = new AutorPrincipalServicio();
    
    public AutorPrincipal crear(String [] params){
        var autorPrincipal = new AutorPrincipal(Integer.valueOf(params[0]),params[1]);
        this.autorPrincipalServicio.crear(autorPrincipal);
        return autorPrincipal;
    }
    
    public List<AutorPrincipal> listar()
    {
        return this.autorPrincipalServicio.listar();
    }
}
