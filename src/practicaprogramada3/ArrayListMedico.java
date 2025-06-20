package practicaprogramada3;

import java.util.ArrayList;

public class ArrayListMedico {

    private ArrayList<Object> listaMedicos;

    

    public ArrayListMedico(){
        this.listaMedicos = new ArrayList<>();
    }

    public void agregarMedico(Object medico) {
        listaMedicos.add(medico);
    }

    @Override
    public String toString() {
        for (int i = 0; i < listaMedicos.size(); i++) {
            Object medicoActual = listaMedicos.get(i);
            medicoActual.getClass();
        }

        return toString();
    }

    public ArrayList<Object> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(ArrayList<Object> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    

}
 