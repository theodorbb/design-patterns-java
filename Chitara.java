package FactoryMethod.Clase;

class Chitara extends AInstrumentMuzical {
    private int numarCorzi;

    public Chitara(String marca, String culoare, String material, int numarCorzi) {
        super(marca, culoare, material);
        this.numarCorzi = numarCorzi;
    }

    public void setNumarCorzi(int numarCorzi) {
        this.numarCorzi = numarCorzi;
    }

    @Override
    public void canta() {
        System.out.println("Chitara marca " + getMarca() + " canta acordurile.");
    }
}