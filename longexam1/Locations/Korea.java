package Locations;

import Tourist.Tourist;

public class Korea implements Locations {

    public int airFare = 350;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}