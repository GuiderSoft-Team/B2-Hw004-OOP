public class Program {
    public static void main(String[] args) {

        House house1=new House();
        House house2=new House(2,3,new String[]{"gas","electiric"});
        house1.setCooling(true);
        house1.heat();
        house1.runColingSystem();
        System.out.println();
        house2.heat();
        house2.runColingSystem();
    }
}
