package com.asgarov.demo;

import com.asgarov.greeting.GreetingService;
import com.asgarov.tours.api.Tour;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        GreetingService greetingService = new GreetingService();
        GreetingService.class.getDeclaredMethod("greet").invoke(greetingService);

        System.out.println("Found tours: " + findAllTours().size());
    }

    public static List<Tour> findAllTours() {
        return ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}
