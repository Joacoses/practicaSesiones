package com.example.joacoses.lib;

public class Login {
    long fecha;
    String nombre;


    public Login(long fecha, String nombre){
        this.fecha=fecha;
        this.nombre=nombre;
    }
    public Login(){}
    /*-----------------------------------get-set----------------------------------------------------*/
    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*---------------------------------FIN:get-set--------------------------------------------------*/

    public boolean comparar(Login otro){
        if (otro.fecha>this.fecha){
            return true;
        }
        return false;
    }

}
