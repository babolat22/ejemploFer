package entidades;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */
public class Empresa {
      private String razonSocial;  //ARCOR
      private int CUIT;
      private ArrayList <Empleado> listaEmpleado; // todos sus empleados  1..n

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.razonSocial);
        hash = 83 * hash + this.CUIT;
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
        final Empresa other = (Empresa) obj;
        if (this.CUIT != other.CUIT) {
            return false;
        }
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        return true;
    }

    public Empresa() {
        listaEmpleado= new ArrayList<Empleado>();
    }
    
    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
      
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }    
    
    public void agregaEmpleado(Empleado emp1){
        listaEmpleado.add(emp1);
    }
    public void mostrarEmp(){

     int i=0;
     
     if (this.listaEmpleado.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Esta empresa no tiene empleados ");
     }   
     else {
          for (i=0; i<this.listaEmpleado.size();i++){
            JOptionPane.showMessageDialog(null, this.listaEmpleado.get(i).getNombre()+" "+this.listaEmpleado.get(i).getApellido());
     } 
     }

}

    @Override
    public String toString() {
        return razonSocial + " CUIT: " + CUIT;
    }
}