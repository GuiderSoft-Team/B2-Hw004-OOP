import HouseHomework.House;

public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz
        House house1=new House();
        House house2=new House(5,6,new String[]{"gas","elektric"});



        house1.Heat();
        house1.runCoolingSystem();
        System.out.println();
        house2.Heat();
        house2.runCoolingSystem();

    }
}
