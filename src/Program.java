public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz

        House house1=new House();
        House house2=new House(house1.getBathroom(), house1.getBedroom(), house1.getHeating());

        house1.setCooling(true);

        house1.heat();
        house1.runCoolingSystem();
        System.out.println();

        house2.heat();
        house2.runCoolingSystem();







    }
}
