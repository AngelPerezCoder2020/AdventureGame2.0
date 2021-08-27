package FactoryPackage;
import VillanoPackage.Villano;
import HeroePackage.Heroe;

public interface AbstractFactory {
    public abstract Villano getVillano();
    public abstract Heroe getHeroe();
}