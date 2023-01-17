package vehiculo;

public class taxi extends Vehiculo {
   public int numeroLicencia;

   public taxi(String strMarca){
      super(strMarca);
   }

   public taxi(String strMarca, String strPropietario){
      super(strMarca, strPropietario);
   }

   public void setNumeroLicencia(int strNumeroLicencia){
      this.numeroLicencia = strNumeroLicencia;
   }

   public int getNumeroLicencia(){
      return numeroLicencia;
   }
}
