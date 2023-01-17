package vehiculo;

public class bus extends Vehiculo {

   public bus(String strMarca) {
      super(strMarca);
   }

   public bus(String strMarca, String strPropietario, int numeroPlazas) {
      super(strMarca, strPropietario);
      setNumeroPlazas(numeroPlazas);
   }

   /*public Autobus(Vehiculo obVehiculo){

   }*/

   public int numeroPlazas;

   public void setNumeroPlazas(int numeroPlazas) {
      this.numeroPlazas = numeroPlazas;
   }

   public int getNumeroPlazas() {
      return numeroPlazas;
   }
}
