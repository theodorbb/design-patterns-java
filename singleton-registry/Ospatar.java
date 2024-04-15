public class Ospatar {
    private String nume;
    private Restaurant restaurant; // referinta restaurant

    public Ospatar(String nume, String numeRestaurant) {
        this.nume = nume;
        this.restaurant = Restaurant.getInstance(numeRestaurant);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Ospatar{" + "nume='" + nume + '\'' + '}';
    }

    public void afisareInfoMese() {
        System.out.println("Ospatar " + nume + " vede: " + restaurant);
    }

    public void preluareComanda(int nrPersoane, Locatie restrictieLocatie) {
        Masa masa = restaurant.getMasa(nrPersoane, restrictieLocatie);
        if (masa != null) {
            masa.setEsteDisponibil(false);
            System.out.println("Pentru ospatarul " + this.getNume() + " comanda a fost preluată la masa: " + masa.getId());
        } else {
            System.out.println("Nu există mese disponibile conform restricțiilor.");
        }
    }

    public void inchidereComanda(Masa masa) {
        if (masa != null) {
            masa.setEsteDisponibil(true);
            System.out.println("Comanda la masa: " + masa.getId() + " a fost închisă.");
        } else {
            System.out.println("Nu există masă specificată.");
        }
    }
}