/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author Familiar
 */
public class recepcionista extends Empleado{
    
    public recepcionista (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
        super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    public void Obligaciones(){
        System.out.println("Atiende a los nuevos visitantes");
    }
}