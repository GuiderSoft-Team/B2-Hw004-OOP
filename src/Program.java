public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz
        House object1=new House();
        House object2=new House(2,5,"gas");

        object1.heat();
        object1.runCoolingSystem();

        System.out.println();

        object2.heat();
        object2.runCoolingSystem();


    }
}
