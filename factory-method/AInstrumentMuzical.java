package FactoryMethod.Clase;

abstract class AInstrumentMuzical {
    private String marca;
    private String culoare;
    private String material;

    public AInstrumentMuzical(String marca, String culoare, String material) {
        this.marca = marca;
        this.culoare = culoare;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getMaterial() {
        return material;
    }

    public abstract void canta();
}

