package vehiculo;

public class vehiculo {
    private String marca = "";
    private String propietario = "";

    public void setMarca (String strMarca){
        this.marca = strMarca
    }

    public void setPropietario (String strPropietario){
        this.propietario = strPropietario;
    }

    public Vehiculo (String strMarca){
        return marca;
    }

    public Vehiculo (String strMarca, String strPropietario){
        setMarca(strMarca);
        setPropietario(strPropietario);
    }
}
