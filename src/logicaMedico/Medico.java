package logicaMedico;

public class Medico {
    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private Turno turno;
    private Especialidad especialidad;

    public enum Especialidad {
        PEDIATRIA,
        CARDIOLOGIA,
        DERMATOLOGIA,
        NEUROLOGIA
    }

    public enum Turno{
        DIURNO,
        NOCTURNO,
        MIXTO
    }

    public Medico(String codigo, String nombre, String apellido, String correo, Turno turno,
            Especialidad especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.turno = turno;
        this.especialidad = especialidad;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    


}
