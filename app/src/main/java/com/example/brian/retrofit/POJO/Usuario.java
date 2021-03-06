package com.example.brian.retrofit.POJO;

/**
 * Created by Brian on 20/03/2017.
 */

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString(){
        return
                "Usuario {"+
                        "Nombre : "+nombre +"\n"+
                        "Apellido : "+apellido +"\n"+
                        "Edad : "+edad +"\n"+
                        "Carrera : "+carrera +"\n"+"}"+
                        "------------------------------------------------------------------------------------------------\n";

    }
}
