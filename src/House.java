public class House {
    private int bedroom;
    private int bathroom;
    private String heating;
    private boolean cooling;
    private boolean hasPool;

    public House() {
    }

    public House(int bedroom, int bathroom, String heating) {
        //this.bedroom = bedroom;
        setBedroom(bedroom);
        //this.bathroom = bathroom;
        setBedroom(bedroom);
        //this.heating = heating;
        setHeating(heating);
        //this.cooling = cooling;
        //setCooling(cooling);
        //this.hasPool = hasPool;
        //setHasPool(hasPool);
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

    public void heat(){
        System.out.println("The house is heated.");
    }
    public void runCoolingSystem(){
        if(cooling){
            System.out.println("Cooling system is working.");
        }else {
            System.out.println("No cooling system.");
        }
    }
}
