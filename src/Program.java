public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz

         House h1=new House();
         House h2=new House();
         h1.cooling=true;

         h1.runCoolingSystem();
         h1.heat();
        System.out.println();
         h2.runCoolingSystem();
         h2.heat();
    }
}