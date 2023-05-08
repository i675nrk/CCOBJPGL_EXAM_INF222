package Locations;

import Tourist.Tourist;

public class China implements Locations {

    public int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}