package logicaMedico;

public class Medico {
    private String codigo;
    private String nombre;
    private String especialidad;

    public Medico(String codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nNombre: " + nombre + "\nEspecialidad: " + especialidad;
    }
}
