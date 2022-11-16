public class Program {
    public static void main(String[] args) {

        House hause1=new House();
        House hause2=new House(1,2,"Electric");

        hause1.heat();
        hause1.runCoolingSystem();
        System.out.println("---------------");
        hause2.heat();
        hause2.runCoolingSystem();


    }
}
