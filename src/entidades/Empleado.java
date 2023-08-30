package entidades;

import java.util.Objects;

public class Empleado {
    int documento;
    String nombre;
    String apellido;
    String categoria;
    double sueldo;
    Empresa trabaja; // RELACIONAR CLASES   1..1    0..1

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.documento;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.documento != other.documento) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    public Empresa getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Empresa trabaja) {
        this.trabaja = trabaja;
    }

    public Empleado(int documento, String nombre, String apellido, String categoria, double sueldo) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    

    
    
    
            
}
