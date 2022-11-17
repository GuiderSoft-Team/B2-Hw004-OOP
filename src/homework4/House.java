package homework4;

import java.util.Arrays;

public class House {
    private int badroom;
    private int bathroom;
    private String[] heating;
    private boolean cooling;
    private boolean hasPool;

    public House() {
    }

    public House(int badroom, int bathroom, String[] heating) {
        this.badroom = badroom;
        this.bathroom = bathroom;
        this.heating = heating;
    }


    public String[] getHeating() {
        return heating;
    }

    public void setHeating(String[] heating) {
        this.heating = heating;
    }

    public boolean isCooling() {
        return cooling;
    }

    public void setCooling(boolean cooling) {
        this.cooling = cooling;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void heat(){
        System.out.println("The House is heated");
    }
    public void runCoolingSystem(){
        if (cooling){
            System.out.println("Cooling system is working.");
        }else {
            System.err.println("No Cooling System");
        }
    }

    @Override
    public String toString() {
        return "House {" +
                " badroom=" + badroom +
                ", bathroom=" + bathroom +
                ", heating=" + Arrays.toString(heating) +
                ", cooling=" + cooling +
                ", hasPool=" + hasPool +
                '}';
    }
}
