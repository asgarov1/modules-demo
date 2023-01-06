## To compile the modules:

*All commands to be run from the root directory*:

### To compile into specific output directory (in this case `mods`):

 - `javac -d mods/com.asgarov.greeting com.asgarov.greeting/src/main/java/com/asgarov/greeting/*.java com.asgarov.greeting/src/main/java/com/asgarov/greeting/internal/*.java com.asgarov.greeting/src/main/java/module-info.java`
 - `javac -p mods -d mods/com.asgarov.demo com.asgarov.demo/src/main/java/com/asgarov/demo/*.java com.asgarov.demo/src/main/java/*.java`

### To package into jars`:
*If not empty delete previous `mods` folder to avoid duplicate module errors*

 - Compile first project: `javac com.asgarov.greeting/src/main/java/com/asgarov/greeting/*.java com.asgarov.greeting/src/main/java/com/asgarov/greeting/internal/*.java com.asgarov.greeting/src/main/java/module-info.java`
 - Package it: `jar -cvf mods/com.asgarov.greeting.jar -C ./com.asgarov.greeting/src/main/java .`

 - Compile second project: `javac -p mods com.asgarov.demo/src/main/java/com/asgarov/demo/*.java com.asgarov.demo/src/main/java/*.java`
 - Package it: `jar -cvf mods/com.asgarov.greeting.jar -C ./com.asgarov.greeting/src/main/java .`


## To run:
 `java -p mods -m com.asgarov.demo/com.asgarov.demo.App`