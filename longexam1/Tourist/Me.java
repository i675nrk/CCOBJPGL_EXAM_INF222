package Tourist;

import Locations.Boracay;
import Locations.Thailand;
import Locations.China;
import Locations.Japan;
import Locations.Korea;
import Locations.Italy;
import Locations.Locations;


public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        
        if (budget<100) {
        System.out.print("You don't have sufficient funds to travel to the following the location.");
        System.exit(0); }
        else
        System.out.println("Enjoying my stay");
        
    }

    public void visit(Boracay boracay) {

        System.out.println("The air fare in Boracay is " + boracay.airFare + ".");
        visit();
        budget -= boracay.airFare;
        checkBudget();

    }

    public void visit(Korea korea) {

        System.out.println("The air fare in Korea is " + korea.airFare + ".");
        visit();
        budget -= korea.airFare;
        checkBudget();
 
    }

    public void visit(China china) {
        
        System.out.println("The air fare in China is " + china.airFare + ".");
        visit();
        budget -= china.airFare;  
        checkBudget();

    }

    public void visit(Japan japan) {

        System.out.println("The air fare in Japan is " + japan.airFare + ".");
        visit();
        budget -= japan.airFare;
        checkBudget();
   
    }
    
    public void visit(Thailand thailand) {

        System.out.println("The air fare in Thailand is " + thailand.airFare + ".");
        visit();
        budget -= thailand.airFare;  
        checkBudget();
    }

    public void visit(Italy italy) {

        System.out.println("The air fare in Italy is " + italy.airFare + ".");
        visit();
        budget -= italy.airFare;  
        checkBudget();
    }


    public void checkBudget() {
        budget -= Locations.airFare;
        System.out.println("my budget is " + budget + "\n");
    }

}