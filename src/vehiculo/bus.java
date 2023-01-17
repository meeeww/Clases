package vehiculo;

public class bus extends Vehiculo {

   public bus(String strMarca) {
      super(strMarca);
   }

   public bus(String strMarca, String strPropietario) {
      super(strMarca, strPropietario);
   }

   public int numeroPlazas;

   public void setNumeroPlazas(int numeroPlazas) {
      this.numeroPlazas = numeroPlazas;
   }

   public int getNumeroPlazas() {
      return numeroPlazas;
   }
}
