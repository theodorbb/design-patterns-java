package FactoryMethod.Clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChitaraFactory fabricaChitara = new ChitaraFactory();
        PianinaFactory fabricaPianina = new PianinaFactory();
        TobaFactory fabricaToba = new TobaFactory();

        List<AInstrumentMuzical> instrumente = new ArrayList<>();

        instrumente.add(fabricaChitara.creareInstrumentMuzical("Fender", "Sunburst", "Lemn de artar"));
        ((Chitara)instrumente.get(0)).setNumarCorzi(6);

        instrumente.add(fabricaPianina.creareInstrumentMuzical("Yamaha", "Negru", "Lemn de fag"));
        ((Pianina)instrumente.get(1)).setNumarClape(66);

        instrumente.add(fabricaToba.creareInstrumentMuzical("Pearl", "Argintiu", "Otel inoxidabil"));
        ((Toba)instrumente.get(2)).setAnFabricatie(2020);

        for (AInstrumentMuzical instrument : instrumente) {
            instrument.canta();
        }
    }
}