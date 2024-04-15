public class Masa {
    private long id;
    private int nrScaune;
    private Locatie locatie;
    private boolean esteDisponibil;

    public Masa(long id, int nrScaune, Locatie locatie, boolean esteDisponibil) {
        this.id = id;
        this.nrScaune = nrScaune;
        this.locatie = locatie;
        this.esteDisponibil = esteDisponibil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    public void setNrScaune(int nrScaune) {
        this.nrScaune = nrScaune;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public boolean isEsteDisponibil() {
        return esteDisponibil;
    }

    public void setEsteDisponibil(boolean esteDisponibil) {
        this.esteDisponibil = esteDisponibil;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", nrScaune=" + nrScaune +
                ", locatie='" + locatie + '\'' +
                ", esteDisponibil=" + esteDisponibil +
                '}';
    }
}
