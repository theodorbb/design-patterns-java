package FactoryMethod.Clase;

public class TobaFactory implements IFactory{
    @Override
    public AInstrumentMuzical creareInstrumentMuzical(String marca, String culoare, String material) {
        return new Toba(marca, culoare, material, 0);
    }
}
