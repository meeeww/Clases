package vehiculo;

public class taxi extends vehiculo {
   public String numeroLicencia;

   public taxi(String strMarca){
    super(strMarca);
   }

   public taxi(String strMarca, String strPropietario){
    super(strMarca, strPropietario);
   }

   public void setNumeroLicencia(String strNumeroLicencia){
    setNumeroLicencia(strNumeroLicencia);
   }

   public String getNumeroLicencia(){
    return numeroLicencia;
   }
}
