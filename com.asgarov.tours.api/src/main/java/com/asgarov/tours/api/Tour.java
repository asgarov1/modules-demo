package com.asgarov.tours.api;

public interface Tour {
    String name();

    int length();

    Souvenir getSouvenir();
}
