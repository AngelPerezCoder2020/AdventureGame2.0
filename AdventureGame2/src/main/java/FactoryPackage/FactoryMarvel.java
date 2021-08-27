package FactoryPackage;
import VillanoPackage.*;
import HeroePackage.*;

public class FactoryMarvel implements AbstractFactory{
    @Override
    public Villano getVillano(){
        return new VillanoMarvel("VillanoMarvel","Poder");
    }
    @Override
    public Heroe getHeroe(){
        return new HeroeMarvel("HeroeMarvel","Poder");
    }    
}