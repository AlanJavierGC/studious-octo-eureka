/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public class Cocinero extends Empleado{
    public String Titulo;
    public String Especialidad;
    public int Sueldo;
    
    public Cocinero (String Id, String Nombre, String Fec_Nac, int Jornada, String Titulo, String Especialidad, int Sueldo){
        super(Id, Nombre, Fec_Nac, Jornada);
        this.Titulo = Titulo;
        this.Especialidad = Especialidad;
        this.Sueldo = Sueldo;
        
    }
    
    // sueldo polimorfismo
    @Override
    public int sueldo(int hrs){
        int extra = 0;
        hrs = hrs * 6;
        int hrsext = hrs - 48;
        
        if ((hrs - hrsext) <= 48){
            hrs = (hrs - hrsext) * 160;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 320;
        }
        
        int s = hrs + extra;
        
        return s;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    // abstraccion
    public void Obligaciones(){
        System.out.println("/t Prepara los desayunos" + 
                           "/t Pepara la comida" +
                           "/t Escupir en la sopa");
    }
}