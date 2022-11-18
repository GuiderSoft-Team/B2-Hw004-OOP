public class Program {
    public static void main(String[] args) {
       /* Aşağıdaki özellik ve davranışlara sahip House sınıfı tasarlanacaktır.

        bedroom:int
        bathroom:int
        heating:String {Gas, Electric}
        cooling: boolean
        hasPool:boolean
        heat():void output: The house is heated.
        runCoolingSystem():void {if cooling is true, output: Cooling system is working. if not, output: No Cooling System }
        create a constructor - no parameter
        create a constructor - with bedroom, bathroom and heating
        Program sınıfı - main metodu içerisinde aşağıdaki görevleri yerine getiriniz.
        create two House objects - one with no parameter constructor and the other with three parameters constructor
        run heat() and runCoolingSystem() methods*/

        House home=new House();
        House sweetHome=new House(4,2,"Electric");
        home.heat();
        home.runCoolingSystem();
        System.out.println();
        sweetHome.heat();
        sweetHome.runCoolingSystem();

    }
}
