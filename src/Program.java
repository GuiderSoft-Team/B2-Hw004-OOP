public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz
        House ev1 = new House();
        House ev2 = new House(2,3, new String[]{"gas","electric"});
        ev1.setCooling(true);

        ev1.heat();
        ev1.runCoolingSystem();

        ev2.heat();
        ev2.runCoolingSystem();




    }
}
