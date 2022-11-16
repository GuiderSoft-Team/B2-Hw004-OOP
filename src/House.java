public class House {

    int bedroom = 10;
    int bathroom = 5;
    String heating = "Gas";
    boolean cooling = true;
    boolean hasPool = true;

    public House(int bedroom, int bathroom, String heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
    }

    public House() {

    }

    public void heat() {
        System.out.println("the house is heated");
    }

    public boolean runCoolingSystem() {

        if (cooling == true) {

            System.out.println("Cooling system is working");
        } else
            System.out.println("No cooling system");


        return false;
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
}
