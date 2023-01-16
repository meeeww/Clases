package producto;

public class vehiculo {
    private int numeroLicencia = "";
    private String propietario = "";

    public void setNumeroLicencia (int numeroLicencia){
        this.numeroLicencia = numeroLicencia
    }

    public void setPropietario (String propietario){
        this.propietario = propietario;
    }

    public int getNumeroLicencia(){
        return numeroLicencia;
    }

    public String getPropietario(){
        return propietario;
    }
}
