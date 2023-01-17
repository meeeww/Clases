package persona;

public class persona {
    private String nombre;
    private int edad;

    public persona(String nombre, int edad){
        setNombrePersona(nombre);
        setEdadPersona(edad);
    }

    public void setPersona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombrePersona(String nombre){
        this.nombre = nombre;
    }

    public void setEdadPersona(int edad){
        this.edad = edad;
    }

    public String getNombrePersona(){
        return this.nombre;
    }

    public int getEdadPersona(){
        return this.edad;
    }
}
