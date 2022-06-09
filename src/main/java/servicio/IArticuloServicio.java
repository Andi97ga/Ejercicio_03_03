/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Articulo;

/**
 *
 * @author User
 */
public interface IArticuloServicio {
    public Articulo crear(Articulo articulo);
    public List<Articulo> listar();
}
