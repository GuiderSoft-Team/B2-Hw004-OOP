public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz
        House home=new House();
        House rent=new House(2, 2, "Yerden ısıtma");

        home.heat();
        home.runCoolingSystem();
        System.out.println("-------------");
        rent.heat();
        rent.runCoolingSystem();



    }
}
