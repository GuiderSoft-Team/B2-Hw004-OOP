public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz

        House h1=new House();
        House h2=new House(5,10,"Gas,Electric");

        h1.cooling=true;
        h1.heat();
        h1.runCoolingSystem();




        h2.cooling=true;
        h2.heat();
        h2.runCoolingSystem();


    }
}
