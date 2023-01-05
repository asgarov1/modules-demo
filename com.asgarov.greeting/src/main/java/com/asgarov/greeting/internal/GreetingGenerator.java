package com.asgarov.greeting.internal;

import java.util.List;

public class GreetingGenerator {
    public String generate() {
        return List.of(
                "Greetings Human!",
                "General Kenobi...",
                "Bonjour"
        ).parallelStream().findAny().orElseThrow();
    }
}
