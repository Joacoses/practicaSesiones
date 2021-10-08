package com.example.joacoses.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import sun.rmi.runtime.Log;

public class Principal extends Login {

    static long FECHA[]={1289001000000L , 1289002000000L , 1289004000000L ,
            1289006000000L , 1289007000000L, 1289008000000L , 128900900000L , 1289011000000L ,
            1289013000000L , 1289016000000L};
    static String USUARIO[] = {"carchimp", "tudela", "arcano", "totencar",
            "ramporo", "tudela", "arcano", "carchimp", "tudela", "totencar"};


    public static void main(String[] args) {

        Login usuario = new Principal();
        usuario.fecha =FECHA[1];
        usuario.nombre =USUARIO[1];

        Login usuario2 = new Principal();
        usuario2.fecha =FECHA[2];
        usuario2.nombre =USUARIO[2];

        if (usuario.comparar(usuario2) == true){
            System.out.println("Funciona");
        }else {
            System.out.println("No funciona");
        }
        System.out.println("---------------------");
        List<Login> almacenamiento=new ArrayList<>();
        for (int i=0;i<FECHA.length;i++){
            String user = new Login().nombre=USUARIO[i];
            long time = new Login().fecha=FECHA[i];
            almacenamiento.add(new Login(time, user));
            System.out.println(almacenamiento.get(i).getNombre());
        }
    }

}