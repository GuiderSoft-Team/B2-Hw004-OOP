public class House1 {

    private int bedroom=2;
    private int bathroom=1;
    private String heating="Gaz";
    private boolean cooling;
    private boolean hasPool;


    public House1() {

    }
    public House1(int bedroom, int bathroom, String heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;

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
        public void runCoolingSystem () {
            if (true) {
                System.out.println("Cooling system is working.");
            } else {
                System.out.println("NO cooling system");
            }


        }

    }

