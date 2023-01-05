package com.asgarov.greeting;

import com.asgarov.greeting.internal.GreetingGenerator;

public class GreetingService {

    private final GreetingGenerator greetingGenerator = new GreetingGenerator();

    public void greet() {
        System.out.println(greetingGenerator.generate());
    }
}
