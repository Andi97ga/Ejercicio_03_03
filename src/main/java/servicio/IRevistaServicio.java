/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Revista;

/**
 *
 * @author User
 */
interface IRevistaServicio {
    public Revista crear(Revista revista);
    public List<Revista> listar();
}
