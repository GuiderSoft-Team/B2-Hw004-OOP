package HouseHomework;

public class House {
    private int bedroom;
   private int bathroom;

  private String [] heating;

    private boolean cooling;
   private boolean hasPool;

    public House() {

    }

    public House(int bathroom, int bedroom, String[] heating) {
        this.bedroom=bedroom;
        this.bathroom=bathroom;
        this.heating=heating;

    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
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

    public void Heat(){
        System.out.println("house is heated.");
    }
    public void runCoolingSystem(){
        if (cooling){
            System.out.println("run cooling system is on.");
        }else {
            System.err.println("run cooling systemis off.");
        }
    }

}
