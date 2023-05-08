package Tourist;

import Locations.Boracay;
import Locations.Thailand;
import Locations.China;
import Locations.Japan;
import Locations.Korea;
import Locations.Italy;
import Locations.Locations;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Thailand thailand);

    void visit(China china);

    void visit(Japan japan);

    void visit(Korea korea);

    void visit(Italy italy);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}