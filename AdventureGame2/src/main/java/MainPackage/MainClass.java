package MainPackage;
import FactoryPackage.*;
import java.util.Scanner;
public class MainClass {
    private static Scanner ent = new Scanner(System.in);
    private static AbstractFactory fabrica;
    private static String opc;
    public static void main(String[] args){
        System.out.println("AdventureGame \n\nDesea Crear un Personaje de Marvel o de DC? \n\n 1. MARVEL \n 2. DC");
        opc=ent.nextLine();
        if(opc.equals("1")){
            fabrica = new FactoryMarvel();
        }else if(opc.equals("2")){
            fabrica = new FactoryDC();
        }
        System.out.println("QUE TIPO DE PERSONAJE DESEA CREAR? \n\n1. VILLANO \n2. HEROE");
        opc = ent.nextLine();
        if(opc.equals("1")){
            System.out.println("Se Creo: "+fabrica.getVillano().getNombre());
        }else if(opc.equals("2")){
            System.out.println("Se Creó: "+fabrica.getHeroe().getNombre());
        }
    }
}