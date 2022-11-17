public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz
    House house1 = new House(3,2,"Gas");
    house1.setCooling(false);
    House house2 = new House();
    house2.setBedroom(5);
    house2.setBathroom(3);
    house2.setHeating("Electric");
    house2.setCooling(true);

    house1.heat();
    house1.runCoolingSystem();
    house2.heat();
    house2.runCoolingSystem();
    }
}
