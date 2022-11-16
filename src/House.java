public class House {
    int bedroom;
    int bathroom;
    String heating;
    boolean cooling;
    boolean hasPool;

    public House() {
        heating="Gas,Electric";
    }

    public House(int bedroom, int bathroom, String heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
        cooling=true;
    }

    public  void  heat(){
        System.out.println("The house is heated.");
    }

    public void runCoolingSystem(){

        if (cooling) {
            System.out.println("Cooling system is working.");
        } else {
            System.out.println("No Cooling System");
        }
    }


}
