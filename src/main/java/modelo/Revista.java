/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Revista {
    private String nombre;
    private String categoria;
    private int edicion;
    private String tipoRevista; 
    private int revistasVendidas;

    public Revista(String nombre, String categoria, int edicion, String tipoRevista, int revistasVendidas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.edicion = edicion;
        this.tipoRevista = tipoRevista;
        this.revistasVendidas = revistasVendidas;
    }

    public Revista(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getTipoRevista() {
        return tipoRevista;
    }

    public void setTipoRevista(String tipoRevista) {
        this.tipoRevista = tipoRevista;
    }

    public int getRevistasVendidas() {
        return revistasVendidas;
    }

    public void setRevistasVendidas(int revistasVendidas) {
        this.revistasVendidas = revistasVendidas;
    }
    
   public String validarCategorias(){
        var retorno="TBD";
        var categoriaRevista=this.categoria.charAt(0);
        switch(categoriaRevista)
        {
            case 'A':
                retorno="Todo Publico";
                break;
            case 'B':
                retorno="Solo niños";
                break;
            case 'C':
                retorno="Revista Cientifica";
                break;
            case 'T':
                retorno="Revista Tecnologica";
                break;
            case 'F':
                retorno="Farandula";
                break;
            case 'E':
                retorno="Revista educativa";
                break;
            default:
                retorno="Revista no disponible";
        }
        
        return retorno;  
     }
    public int precioRevista(){
        var retorno= 30  ;
        if (this.categoria=="Todo pubico");  
         retorno=5; 
         if (this.categoria=="Solo niños");  
           retorno=10;
         if (this.categoria=="Revista Científica");
           retorno= 25;
         if (this.categoria=="Revista Tecnológica");
           retorno= 20;
         if (this.categoria=="Farandula");
           retorno= 8;
         if (this.categoria=="Revista educativa");
           retorno= 15;
         
        return retorno;   
    }

    @Override
    public String toString() {
        return "Revista{" + "nombre=" + nombre + ", categoria=" +
                categoria + ", edicion=" + edicion +'}';
    }
    
    
}
