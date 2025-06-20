/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprogramada3;

/**
 *
 * @author eriic_ws85x
 */
public class Principal {
    public String nombre;
    public int edad;

    
    public Principal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayListMedico listaMedico = new ArrayListMedico();
        Principal p = new Principal("Erick", 12);
        listaMedico.agregarMedico(p);
        Principal p1 = new Principal("Oscar", 20);
        listaMedico.agregarMedico(p1);

        System.out.println(listaMedico.toString());
        
    }
    
}
