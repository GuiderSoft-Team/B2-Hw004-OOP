public class House {
    private int bedroom;
    private int bathroom;
    private String heating;
    private boolean cooling;
    private boolean haspool;

    public House() {
        cooling=true;
    }
    public House(int bedroom, int bathroom, String heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
    }

    public void heat(){
        System.out.println("The house is heated.");
    }

    public void runCoolingSystem(){
        if (cooling==true){
            System.out.println("Cooling system is working.");
        }if (cooling!=true){
            System.out.println("No cooling system.");
        }
    }
}
