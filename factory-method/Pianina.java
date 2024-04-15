package FactoryMethod.Clase;

 class Pianina extends AInstrumentMuzical {
    private int numarClape;

    public Pianina(String marca, String culoare, String material, int numarClape) {
        super(marca, culoare, material);
        this.numarClape = numarClape;
    }

     public void setNumarClape(int numarClape) {
         this.numarClape = numarClape;
     }

     @Override
    public void canta() {
        System.out.println("Pianina marca " + getMarca() + " canta melodia.");
    }
}