public class Main {
    public static void main(String[] args) {
            String numeRestaurant1 = "Restaurant1";
            String numeRestaurant2 = "Restaurant2";
            String numeRestaurant3 = "Restaurant3";

            Ospatar ospatar1 = new Ospatar("Ion", numeRestaurant1);
            Ospatar ospatar2 = new Ospatar("Vasile", numeRestaurant2);
            Ospatar ospatar3 = new Ospatar("Gigel", numeRestaurant3);

            Restaurant restaurant1 = Restaurant.getInstance(numeRestaurant1);
            restaurant1.addMasa(new Masa(1, 4, Locatie.TERASA, true));
            restaurant1.addMasa(new Masa(2, 2, Locatie.TERASA, true));

            Restaurant restaurant2 = Restaurant.getInstance(numeRestaurant2);
            restaurant2.addMasa(new Masa(1, 4, Locatie.BALCON, true));
            restaurant2.addMasa(new Masa(2, 6, Locatie.INTERIOR, true));

            Restaurant restaurant3 = Restaurant.getInstance(numeRestaurant3);
            restaurant3.addMasa(new Masa(1, 4, Locatie.BALCON, true));
            restaurant3.addMasa(new Masa(2, 8, Locatie.INTERIOR, true));

            ospatar1.afisareInfoMese();
            ospatar2.afisareInfoMese();
            ospatar3.afisareInfoMese();

            System.out.println("Preluare comenzi:");
            ospatar1.preluareComanda(2, Locatie.TERASA);
            ospatar2.preluareComanda(4, Locatie.INTERIOR);
            ospatar3.preluareComanda(6, Locatie.TERASA);

            System.out.println("După preluarea comenzilor:");
            ospatar1.afisareInfoMese();
            ospatar2.afisareInfoMese();
            ospatar3.afisareInfoMese();
    }
}