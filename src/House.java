public class House {
    int bedroom=3;
    int bathroom=2;
    String heating="Gas";
    boolean cooling=true;
    boolean hasPool=true;
    public House() {
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
        if (true){
            System.out.println("Cooling system is working.");
        }else{
            System.out.println("No cooling system.");
        }
    }
}
