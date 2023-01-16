package producto;

public class taxi extends vehiculo {
    private String numeroLicencia = "";
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
}
