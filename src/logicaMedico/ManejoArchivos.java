package logicaMedico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import logicaMedico.Medico.Especialidad;
import logicaMedico.Medico.Turno;

public class ManejoArchivos {
    private ArrayListMedico listMedico;

    public ManejoArchivos(ArrayListMedico listMedico) {
        this.listMedico = listMedico;
    }

    public boolean verificarOCrearArchivo(String nombreArchivo) {
        boolean iniciarPrograma = true;
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo ya existe\nCargando datos......");
            cargarInformacion(listMedico);
        } else {
            try {
                if(archivo.createNewFile()) {
                    System.out.println("Archivo Creado Exitosamente");
                }else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el archivo\nNo se puede ejecutar el programa");;
                    iniciarPrograma = false;
                }
            } catch (IOException e) {
                System.out.println("ERROR AL CREAR EL ARCHIVO" + e.getMessage());
            }
        }
        return iniciarPrograma;
    }

    public void cargarInformacion(ArrayListMedico listMedico) {
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String codigo = partes[0];
                String nombre = partes[1];
                String apellido = partes[2];
                String correo = partes[3];
                String turno = partes[4];
                String especialidad = partes[5];
                listMedico.agregarMedico(new Medico(codigo, nombre, apellido, correo, Turno.valueOf(turno.toUpperCase()), Especialidad.valueOf(especialidad.toUpperCase())));
            }
            System.out.println("Datos cargados exitosamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

    public void guardarInformacion(ArrayListMedico listMedico) {
       try (FileWriter writer = new FileWriter("archivo.txt")) {
        for(Medico medico : listMedico.getListaMedicos()) {
            writer.write(medico.toString() + "\n");
        }
        System.out.println("Medicos guardados correctamente en el archivo");
       } catch (IOException e) {
        System.out.println("Error al guardar los medicos en el archivo " + e.getMessage());
       }
    }

    
}