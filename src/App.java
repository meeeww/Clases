import persona.*;



public class App {
    public static void main(String[] args) throws Exception {
        persona Omar = new persona("Omar", 18);
        System.out.println(Omar.getNombrePersona());
        System.out.println(Omar.getEdadPersona());

        empleado Alex = new empleado("Alex", 19, 500);
        System.out.println(Alex.getSueldo());
    }
}


















/////////////////////main de vehiculos
/*import vehiculo.*;

public class App {

    public static void main(String[] args) throws Exception {
        int iValor = 0;

        Vehiculo obMercedes = new Vehiculo("Mercedes");
        Vehiculo obFiat = new Vehiculo("Fiat");
        Vehiculo obCoche = new Vehiculo("kk", "Iker Enciso");
        obCoche.setPropietario("Juan Zas");
        obCoche.getPropietario();

        taxi obTaxi = new taxi("Toyota");
        obTaxi.setNumeroLicencia(12345);
        obTaxi.getNumeroLicencia();
        obTaxi.setPropietario("Omar Gómez");

        //bus  obBus = new bus("Trans");
        //obBus.getVehiculo().getMarca();
    }
}*/



/*producto manzanas = new producto("Manzanas", 5.99f, 5);
        producto mandarias = new producto("Mandarinas", 4.99f, 9);

        manzanas.mostrar();
        manzanas.precioTotal();
        mandarias.mostrar();
        mandarias.precioTotal();*/