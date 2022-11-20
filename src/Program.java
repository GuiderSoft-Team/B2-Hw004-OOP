import homework4.House;

public class Program {
    public static void main(String[] args) {

        House house1 = new House();

        House house2 = new House(4, 2, "Gas");

        house1.heat();
        house1.runCoolingSystem();

        house2.heat();
        house2.runCoolingSystem();
    }
}
