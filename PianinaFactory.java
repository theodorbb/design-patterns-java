package FactoryMethod.Clase;

public class PianinaFactory implements IFactory{

    @Override
    public AInstrumentMuzical creareInstrumentMuzical(String marca, String culoare, String material) {
        return new Pianina(marca,culoare,material,0);
    }
}
