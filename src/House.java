public class House {

    public int bedroom;
    public int bathroom;
    public String heating;
    public boolean cooling;
    public boolean hasPool;

    public House() {
    }
    public House(int bedroom, int bathroom, String heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
    }

    public void heat(){
        System.out.println("The house is heated");
    }
    public void runCoolingSystem(){
        System.out.println(cooling ? "Cooling system is working" : "No cooling system");
    }
}