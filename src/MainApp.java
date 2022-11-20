public class MainApp {
    public static void main(String[] args) {
        House house=new House();
        House house1=new House();

        house.runCoolingSystem();
        house.heat();
        house1.runCoolingSystem();
        house1.heat();
    }
}
