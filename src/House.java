public class House {
    private  int bedroom;
    private  int bathroom ;
    private String []heating={"gas","electıc"};
    private Boolean cooling=true;
    private Boolean hasPool;

    public House() {
    }

    public House(int bedroom, int bathroom, String[] heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
    }

    public void heat(){
        System.out.println("The house is heated.");
    }


    public void runCoolingSystem(){
        if ( cooling){
            System.out.println("Cooling system is working.");

        }else{
            System.out.println("No Cooling System ");
        }
    }


    }

