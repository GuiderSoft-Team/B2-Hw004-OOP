public class Program {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz

        Hause hause1=new Hause(2,1,"Gas");
        Hause hause2=new Hause();
        hause2.setCooling(true);

        hause1.heat();
        hause1.runCoolingSystem();
        System.out.println();
        hause2.heat();
        hause2.runCoolingSystem();
    }
}
