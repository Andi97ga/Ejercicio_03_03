/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author User
 */
public class AutorPrincipal {
    private String nombre;
    private int yearNacimiento ;
    private int edad;
    private String ciudadania;
    Articulo articulo;

    public AutorPrincipal(String nombre, int yearNacimiento, int edad, String ciudadania, Articulo articulo) {
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.edad = edad;
        this.ciudadania = ciudadania;
        this.articulo = articulo;
    }

    public AutorPrincipal(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(String ciudadania) {
        this.ciudadania = ciudadania;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
     public String verificarCiudadania(){
         var retorno="TBD";
        var ciudadaniaAutor=this.ciudadania.charAt(0);
        switch(ciudadaniaAutor)
        {
            case 'A':
                retorno="Alemania";
                break;
            case 'B':
                retorno="Bolivia";
                break;
            case 'C':
                retorno="Cuba";
                break;
            case 'H':
                retorno="Honduras";
                break;
            case 'M':
                retorno="Mexico";
                break;
            case 'P':
                retorno="Puerto Rico";
                break;    
      }
        return retorno;
     }
     
    public int calcularEdad(int yearActual){    
         var retorno= 100;
         retorno= yearActual-this.yearNacimiento;
         return retorno;
    } 

    @Override
    public String toString() {
        return "AutorPrincipal{" + "nombre=" + nombre + ", yearNacimiento=" + 
                yearNacimiento + ", edad=" + edad + ", ciudadania=" + ciudadania 
                + ", articulo=" + articulo + '}';
    }
    
}
