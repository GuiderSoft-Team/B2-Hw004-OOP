public class House {
    private int bedroom;
    private int bathroom;
    private String heating;
    private boolean cooling;
    private boolean haspool;

    public House() {
    }

    public House(int bedroom, int bathroom, String heating) {
        cooling=true;
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

    public void runCoolingsystem(){
        if (cooling){
            System.out.println("Cooling system is working.");
        }else {
            System.err.println("No Cooling System");
        }

    }
    public void heat(){

        System.out.println("The house is heated.");
    }


 
}
