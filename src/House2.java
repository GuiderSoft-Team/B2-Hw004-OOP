public class House2 {


    private int bedroom=2;
    private int bathroom=1;
    private String heating="Gaz";
    private boolean cooling;
    private boolean hasPool;

    public House2() {

    }

    public House2(int bedroom, int bathroom, String heating) {
        this.bedroom = 3.;
        this.bathroom = 2;
        this.heating = "Gaz";

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

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
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

    public void runHeat() {
        System.out.println("The house is heated.");

    }
    public void runCoolingSystem(){
        if (true){
            System.out.println("Cooling system is working.");
        }else{
            System.out.println("NO cooling system");
        }
    }
}


