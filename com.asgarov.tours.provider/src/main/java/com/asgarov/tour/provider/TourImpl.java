package com.asgarov.tour.provider;

import com.asgarov.tours.api.Souvenir;
import com.asgarov.tours.api.Tour;

public class TourImpl implements Tour {
    @Override
    public String name() {
        return "Behind the Scenes";
    }

    @Override
    public int length() {
        return 120;
    }

    @Override
    public Souvenir getSouvenir() {
        return new Souvenir("stuffed animal");
    }
}
