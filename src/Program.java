public class Program {
    public static void main(String[] args) {

        House h1=new House();
        House h2=new House(3,1,"Available");

        h1.cooling=true;

        h1.heat();
        h1.runCoolingSystem();


    }
}
