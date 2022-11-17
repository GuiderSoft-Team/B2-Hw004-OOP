public class Program {
    public static void main(String[] args) {
        House house1=new House();
        house1.runCoolingsystem();
        house1.heat();


        House house2=new House(3,4, "Gas");
        house2.runCoolingsystem();
        house2.heat();




    }
}
