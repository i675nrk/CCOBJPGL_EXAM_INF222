import Tourist.*;
import Locations.*;


public class App {
    public static void main(String[] args) throws Exception {

        // Long Exam 1

        Locations boracay = new Boracay();

        // 1. Add 5 new locations to visit
        Locations thailand = new Thailand();
        Locations korea = new Korea();
        Locations japan = new Japan();
        Locations china = new China();
        Locations italy = new Italy();
        
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Tourist me = new Me();

        boracay.accept(me);
        thailand.accept(me);
        korea.accept(me);
        japan.accept(me);
        china.accept(me);
        italy.accept(me);
        
        
    }
}
