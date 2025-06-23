package logicaMedico;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Medico implements Serializable {
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

    public int devolverPosicioEspecialidad(Especialidad especialidad) {
        int posicion = -1;
        switch (especialidad.name()) {
            case "PEDIATRIA":
                posicion = 1;
                break;
            case "CARDIOLOGIA":
                posicion = 2;
                break;
            case "DERMATOLOGIA":
                posicion = 3;
                break;
            case "NEUROLOGIA":
                posicion = 4;
                break;
            default:
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LA ESPECIALIDAD");
                break;
        }
        return posicion;
    }

    public int devolverPosicionTurno(Turno turno) {
        int posicion = -1;
        switch (turno.name()) {
            case "DIURNO":
                posicion = 1;
                break;
            case "MIXTO":
                posicion = 2;
                break;
            case "NOCTURNO":
                posicion = 3;
                break;
            default:
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR EL TURNO");
                break;
        }
        return posicion;
    }
     @Override
     public String toString() {
         // TODO Auto-generated method stub
         return getCodigo() + ","
            +   getNombre() + ","
            +   getApellido() + ","
            +   getCorreo() + ","
            +   getTurno() + ","
            +   getEspecialidad();
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
