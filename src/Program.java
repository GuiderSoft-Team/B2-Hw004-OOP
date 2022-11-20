public class Program {
    public static void main(String[] args) {
        House house1=new House();
        House house2=new House(2,2, "Gas");

        house1.heat();
        house1.runCoolingsystem();
        System.out.println();
        house2.heat();
        house2.runCoolingsystem();


    }
}
