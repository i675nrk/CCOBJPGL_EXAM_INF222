package Locations;

import Tourist.Tourist;

public class Italy implements Locations {

    public int airFare = 400;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    
}