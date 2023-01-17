package vehiculo;

public class Vehiculo {
    private String marca = "";
    private String propietario = "";

    public void setMarca (String strMarca){
        this.marca = strMarca;
    }

    public void setPropietario (String strPropietario){
        this.propietario = strPropietario;
    }

    public String getPropietario(){
        return this.propietario;
    }

    public String getMarca(){
        return this.marca;
    }

    public Vehiculo (String strMarca){
        setMarca(strMarca);
    }

    public Vehiculo (String strMarca, String strPropietario){
        setMarca(strMarca);
        setPropietario(strPropietario);
    }
}
