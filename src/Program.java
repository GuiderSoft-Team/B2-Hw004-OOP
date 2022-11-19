import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        House house1 = new House();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select house heating method.\n 1.Gas\t2.Electric\n");
        int selection=scanner.nextInt();
        String heating="";
        switch (selection){
            case 1:
                heating="Gas";
                break;
            case 2:
                heating="Elecktric";
                break;
        }
        House house2 = new House(2, 1, heating);
        house1.heat();
        house1.runCoolingSystem();
        house2.setCooling(true);
        house2.heat();
        house2.runCoolingSystem();



    }
}
