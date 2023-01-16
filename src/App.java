import producto.*;

public class App {

    public static void main(String[] args) throws Exception {
        taxi obTaxi = new taxi();
        obTaxi.setNumeroLicencia("123");
        obTaxi.getNumeroLicencia();
    }
}



/*producto manzanas = new producto("Manzanas", 5.99f, 5);
        producto mandarias = new producto("Mandarinas", 4.99f, 9);

        manzanas.mostrar();
        manzanas.precioTotal();
        mandarias.mostrar();
        mandarias.precioTotal();*/