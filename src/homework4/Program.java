package homework4;

public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz


        House house1=new House();
        House house2=new House(30,25,new String[]{"Gaz"});
        house1.heat();
        house1.runCoolingSystem();
        System.out.println();

        house2.heat();
        house2.runCoolingSystem();
        System.out.println();

        System.out.println(house1);
        System.out.println(house2);

        house2.setCooling(true);
        house2.runCoolingSystem();
    }
}
