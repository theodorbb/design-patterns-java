package FactoryMethod.Clase;

 class Toba extends AInstrumentMuzical {
    private int anFabricatie;

    public Toba(String marca, String culoare, String material, int anFabricatie) {
        super(marca, culoare, material);
        this.anFabricatie = anFabricatie;
    }

     public void setAnFabricatie(int anFabricatie) {
         this.anFabricatie = anFabricatie;
     }

     @Override
    public void canta() {
        System.out.println("Toba marca " + getMarca() + " canta ritmul.");
    }
}