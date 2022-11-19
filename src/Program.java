public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz
        House h1 = new House();
        House h2 = new House(1, 2, "Electric");
        h1.heat();
        h1.runCoolingSystem();
        h2.heat();
        h2.runCoolingSystem();

    }


}




