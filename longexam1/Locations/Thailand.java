package Locations;

import Tourist.Tourist;

public class Thailand implements Locations {

    public int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}