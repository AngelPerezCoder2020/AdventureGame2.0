package FactoryPackage;
import VillanoPackage.*;
import HeroePackage.*;

public class FactoryDC implements AbstractFactory {
    @Override
    public Villano getVillano(){
        return new VillanoDC("VillanoDC","Poder");
    }
    @Override
    public Heroe getHeroe(){
        return new HeroeDC("HeroeDC","Poder");
    }
}