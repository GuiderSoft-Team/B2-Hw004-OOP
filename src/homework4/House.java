package homework4;

public class House {
    int bedroom;
    int bathroom;
    String heating; //{Gas, Electric}
    boolean cooling;
    boolean hasPool;


    public House() {
        //no parameters constructer
    }

    public House(int bedroom, int bathroom, String heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
    } //with three parameters constructor

    public void heat() {
        System.out.println("The house is heated.");
    }

    public void runCoolingSystem() {
        if (cooling) {
            System.out.println("Cooling system is working.");
        } else {
            System.out.println("No Cooling System.");
        }
    }

}
