package HeroePackage;

public abstract class Heroe {
    private String Nombre;
    private String Poder;
    public Heroe(String Nombre, String Poder){
        this.Nombre = Nombre;
        this.Poder = Poder;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setPoder(String Poder){
        this.Poder = Poder;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getPoder(){
        return Poder;
    }    
}