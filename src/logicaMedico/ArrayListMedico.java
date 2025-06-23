package logicaMedico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import logicaMedico.Medico.Especialidad;

public class ArrayListMedico {

    private ArrayList<Medico> listaMedicos;

    public ArrayListMedico(){
        this.listaMedicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public Medico devolverMedicoBuscado(int indice) {
            return listaMedicos.get(indice);
    }

    public void modificarMedico(int indice, Medico medicoEditado) {
        listaMedicos.set(indice, medicoEditado);
    }

    public void eliminarMedico(int indice) {
        listaMedicos.remove(indice);
    }


    public String mostrarDatosLista() {
        String medicos = "";
        for(Medico medico : listaMedicos) {
            medicos += "-------------------------------------"
            + "\nNombre:" + medico.getNombre() + " " + medico.getApellido()
            + "\nCorreo: " + medico.getCorreo()
            + "\nCodigo: " + medico.getCodigo()
            + "\nEspecialidad: " + medico.getEspecialidad()
            + "\nTurno: " + medico.getTurno(); 
        }
        return medicos;
    }

    public int buscarMedico(String codigoMedico) {
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < listaMedicos.size(); i++ ) {
            Medico medicoActual = listaMedicos.get(i);
            if(medicoActual.getCodigo().equals(codigoMedico)) {
                encontrado = true;
                posicion = i;
                i = listaMedicos.size();
            }
        }
        if(!encontrado) {
            JOptionPane.showMessageDialog(null, "Medico no encontrado", "INTENTE DE NUEVO", JOptionPane.ERROR_MESSAGE);
        }

        return posicion;
        }

    


    public boolean listaVacia() {
        return listaMedicos.isEmpty();
    }



    public ArrayList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(ArrayList<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }



    

}
 