package persona;

public class empleado extends persona{
    private int sueldo;

    public empleado(String nombre, int edad, int sueldo){
        super(nombre, edad);
        setSueldo(sueldo);
    }

    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }

    public int getSueldo(){
        return sueldo;
    }
}
