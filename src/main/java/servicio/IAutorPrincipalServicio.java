/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.AutorPrincipal;

/**
 *
 * @author User
 */
public interface IAutorPrincipalServicio {
    public AutorPrincipal crear(AutorPrincipal autorPrincipal);
    public List<AutorPrincipal> listar();
}
