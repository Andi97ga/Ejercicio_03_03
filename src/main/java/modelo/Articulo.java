/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author User
 */
public class Articulo {
    private String titulo;
    private int numeroPalabras; //maximo 
    private int limitePalabras;
    private int yearPublicacion;
    Revista revista;
    AutorPrincipal autor;

    public Articulo() {
        
    }

    
    public Articulo(String titulo, int yearPublicacion) {
        this.titulo = titulo;
        this.yearPublicacion = yearPublicacion;
    }

    public Articulo(String titulo, int numeroPalabras, int limitePalabras, int yearPublicacion, Revista revista, AutorPrincipal autor) {
        this.titulo = titulo;
        this.numeroPalabras = numeroPalabras;
        this.limitePalabras = limitePalabras;
        this.yearPublicacion = yearPublicacion;
        this.revista = revista;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public int getLimitePalabras() {
        return limitePalabras;
    }

    public void setLimitePalabras(int limitePalabras) {
        this.limitePalabras = limitePalabras;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public AutorPrincipal getAutor() {
        return autor;
    }

    public void setAutor(AutorPrincipal autor) {
        this.autor = autor;
    }
    
    public boolean verificarNumeroPalabras(){ 
        var retorno=false;
        if(this.numeroPalabras>=0 && this.numeroPalabras<=limitePalabras){
                retorno=true; 
        }
        return retorno ;   
    }
    public String verificarFecha(){
     var retorno= " ";
      if (this.yearPublicacion>=2015 && this.yearPublicacion<= 2022){  
          retorno= " Publicacion Actual"; 
      }else if (this.yearPublicacion>=2010 && this.yearPublicacion<=2015){
          retorno= "Publicacion Antigua";
      }
        return retorno;   
    } 

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", numeroPalabras=" + 
                numeroPalabras + 
                ", yearPublicacion=" + yearPublicacion + '}';
    }
    
}
