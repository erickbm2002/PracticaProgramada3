/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicaMedico;

import MenuMedico.MenuPrincipal;

/**
 *
 * @author eriic_ws85x
 */
public class Principal {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayListMedico listaMedicos = new ArrayListMedico();
        ManejoArchivos manejoArchivos = new ManejoArchivos(listaMedicos);
        if(manejoArchivos.verificarOCrearArchivo("archivo.txt")) {
            MenuPrincipal menu = new MenuPrincipal(listaMedicos, manejoArchivos);
        }  
    }
    
}
