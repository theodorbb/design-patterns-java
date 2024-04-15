import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    private static final Map<String, Restaurant> instances = new HashMap<>();
    private static final int MAX_INSTANCES = 3; // Limita de instanțe
    private List<Masa> listaMese;

    private Restaurant() {
        listaMese = new ArrayList<>();
    }

    public static synchronized Restaurant getInstance(String numeRestaurant) throws IllegalStateException {
        if (!instances.containsKey(numeRestaurant)) {
            if (instances.size() < MAX_INSTANCES) {
                instances.put(numeRestaurant, new Restaurant());
            } else {
                throw new IllegalStateException("Nu se pot crea mai mult de " + MAX_INSTANCES + " restaurante.");
            }
        }
        return instances.get(numeRestaurant);
    }

    public void addMasa(Masa m) {
        listaMese.add(m);
    }

    public Masa getMasa(int nrPersoane, Locatie restrictieLocatie) {
        for (int i = 0; i < listaMese.size(); i++) {
            if (listaMese.get(i).isEsteDisponibil()
                    && listaMese.get(i).getLocatie() == restrictieLocatie
                    && listaMese.get(i).getNrScaune() >= nrPersoane) {
                return listaMese.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "listaMese=" + listaMese +
                '}';
    }
}
