/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Articulo;
import servicio.ArticuloServicio;

/**
 *
 * @author User
 */
public class ArticuloControl {
    private final ArticuloServicio articuloServicio = new ArticuloServicio();
    
    public Articulo crear(String [] params){
        var articulo= new Articulo(Integer.valueOf(params[0]),params[1]);
        this.articuloServicio.crear(articulo);
        return articulo;
    }
    
    public List<Articulo> listar()
    {
        return this.articuloServicio.listar();
    }
}
