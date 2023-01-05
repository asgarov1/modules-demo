## To compile the modules:

 *From the root directory*:

 - `javac -d mods/com.asgarov.greeting com.asgarov.greeting/src/main/java/com/asgarov/greeting/*.java com.asgarov.greeting/src/main/java/com/asgarov/greeting/internal/*.java com.asgarov.greeting/src/main/java/module-info.java`
 - `javac -p mods -d mods/com.asgarov.demo com.asgarov.demo/src/main/java/com/asgarov/demo/*.java com.asgarov.demo/src/main/java/*.java`

## To run:
 `java -p mods --module com.asgarov.demo/com.asgarov.demo.App`