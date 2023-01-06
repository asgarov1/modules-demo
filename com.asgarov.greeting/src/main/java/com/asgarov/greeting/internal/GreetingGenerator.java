package com.asgarov.greeting.internal;

import java.util.List;
import java.util.Random;

public class GreetingGenerator {
    private final Random random = new Random();

    private final List<String> greetings = List.of(
            "Greetings Human!",
            "General Kenobi...",
            "Bonjour",
            "Wazzzzaaaaap",
            "Hello there..."
    );

    public String generate() {
        return greetings.get(getRandomIndex(greetings.size()));
    }

    private int getRandomIndex(int upperBoundNotIncluded) {
        return random.nextInt(upperBoundNotIncluded);
    }
}
