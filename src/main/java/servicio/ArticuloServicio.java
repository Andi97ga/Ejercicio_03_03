/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Articulo;

/**
 *
 * @author User
 */
public class ArticuloServicio implements IArticuloServicio{
    private final List<Articulo> articuloList = new ArrayList<>();
     
     @Override
    public Articulo crear(Articulo articulo) {
        this.articuloList.add(articulo);
        return articulo;
    }

     @Override
    public List<Articulo> listar() {
        return this.articuloList;
    }
}
