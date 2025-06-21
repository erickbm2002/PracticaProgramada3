package practicaprogramada3;

import java.util.ArrayList;

public class ArrayListMedico {

    private ArrayList<Object> listaMedicos;

    

    public ArrayListMedico(){
        this.listaMedicos = new ArrayList<>();
    }

    public void agregarMedico(Object medico) {
        this.listaMedicos.add(medico);
    }

    public void mostrarDatosLista() {
        
    }

    public ArrayList<Object> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(ArrayList<Object> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    

}
 