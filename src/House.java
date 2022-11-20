public class House {
    public int bedroom;
    public int bathroom;
    public String [] heating={"Gas","Electric"};
    public boolean cooling;
    public boolean haspool;

    public House() {
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

    public void setHeating(String h) {
        if(h=="Gas"){
            this.heating[0] = "Gas";}
        if(h=="Electiric"){
            this.heating[1] = "Electiric";
        }

    }

    public void heat(){
        System.out.println("The house is heated.");

    }
    public void runCollingSystem(boolean cooling ){
        if(cooling==true){
            System.out.println("Cooling system is working.");
        }else{
            System.out.println("No Cooling System");
        }
    }

}
