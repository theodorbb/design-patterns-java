package FactoryMethod.Clase;

public class ChitaraFactory implements IFactory{

    @Override
    public AInstrumentMuzical creareInstrumentMuzical(String marca, String culoare, String material) {
        return new Chitara(marca, culoare, material, 0);

    }
}
