package vehiculo;

public class bus extends vehiculo{

   public bus(String strMarca){
    super(strMarca);
   }

   public bus(String strMarca, String strPropietario){
    super(strMarca, strPropietario);
   }

   public int numeroPlazas;

   public void setNumeroPlazas(int numeroPlazas){
    numeroPlazas = numeroPlazas;
   }

   public int getNumeroPlazas(){
    return numeroPlazas;
   }
}
