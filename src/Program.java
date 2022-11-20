public class Program {
    public static void main(String[] args) {

        House h1=new House();
        House h2=new House();
        h2.setBathroom(3);
        h2.setBedroom(2);
        h2.setHeating("Gas");

        h1.runCollingSystem(true);
        h1.heat();
        h2.runCollingSystem(false);
        h2.heat();




    }
}
