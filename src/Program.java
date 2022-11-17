public class Program {
    public static void main(String[] args) {
        House h1=new House();
        House h2=new House(3,2,"Gas");
        h1.heat();
        h1.runCoolingSystem();
        System.out.println("");
        h2.heat();
        h2.runCoolingSystem();
    }
}
