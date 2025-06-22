package logicaMedico;

public class Medico {
    private String codigo;
    private String nombre;
    private Especialidad especialidad;

    public enum Especialidad {
        PEDIATRIA,
        CARDIOLOGIA,
        DERMATOLOGIA,
        NEUROLOGIA,
    }

    public Medico(String codigo, String nombre, Especialidad especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    


    @Override
    public String toString() {
        return "Código: " + codigo + "\nNombre: " + nombre + "\nEspecialidad: " + especialidad;
    }




    public String getCodigo() {
        return codigo;
    }




    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public Especialidad getEspecialidad() {
        return especialidad;
    }




    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
